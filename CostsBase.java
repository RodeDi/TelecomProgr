package java_project;

import java.io.*;
import java.text.ParseException;
import java.util.*;
import java.util.logging.*;
import javax.swing.JOptionPane;

public class CostsBase {
    private static ArrayList<Costs> costs = new ArrayList<Costs>();
    Scanner scan = new Scanner(System.in);
    public static final String FileName = "Costs.txt";
    
    private static String MessageStatus;
    public static String getMessageStatus() {
        return MessageStatus;
    }

    public static void setMessageStatus(String message_status) {
        MessageStatus = message_status;
    }

    protected static boolean writeFile(String TextToWrite) {
        FileWriter writer = null;
        boolean successfulWrite = false;
        try {
            writer = new FileWriter(FileName);
            writer.write(TextToWrite);
            writer.close();
            successfulWrite = true;
        } catch (IOException ex) {
            successfulWrite = false;
            MessageStatus = ex.getMessage();
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                MessageStatus = ex.getMessage();
            }
        }
        return successfulWrite;
    }
    
    public static void readCosts() {
        //read Contacts file and store into arraylist of Object(contact)
        BufferedReader br = null;
        try {
            if (new File(FileName).exists()) {
 
                if (costs == null) {
                    costs = new ArrayList<>();
                } else {
                    costs.clear();
                }
                br = new BufferedReader(new FileReader(FileName));
                StringBuilder sb = new StringBuilder();
                String line = "";
                Costs CostClass = null;
                while ((line = br.readLine()) != null) {
                    if (!line.equalsIgnoreCase("")) {
                        String[] _temp = line.split(",");
                        
                        String _temp_phone = _temp[0];
                        if (_temp_phone.equalsIgnoreCase("NULL")) {
                            _temp_phone = "";
                        }
                        
                        String _temp_cost = _temp[1];
                        if (_temp_cost.equalsIgnoreCase("NULL")) {
                            _temp_cost = "";
                        }
                        
                        CostClass = new Costs(_temp_phone, _temp_cost);
                        costs.add(CostClass);
                    }
                }
            } else {
                new File(FileName).createNewFile();
                readCosts();
            }
 
        } catch (NullPointerException | IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException ex) {
                    Logger.getLogger(CustomerBase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public static boolean editCost(String number, String cost, String NewStringLine) {
        BufferedReader br = null;
        String ReWrite = "";
        boolean success = false;
        try {
            if (new File(FileName).exists()) {
                br = new BufferedReader(new FileReader(FileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    if (!"".equals(line)) {
                        String[] _temp = line.split(",");
                        if (_temp[0].equalsIgnoreCase(number)&& _temp[1].equalsIgnoreCase(cost)) {
                            ReWrite += NewStringLine + "\r\n";
                        } else {
                            ReWrite += line + "\r\n";
                        }
                    }
                }
                br.close();
 
                if (writeFile(ReWrite)) {
                    success = true;
                } else {
                    success = false;
                }
                //update ArrayList with new Costs List
                readCosts();
 
            } else {
                new File(FileName).createNewFile();
                readCosts();
                success = false;
            }
        } catch (FileNotFoundException ex) {
            MessageStatus = ex.getMessage();
            success = false;
        } catch (IOException ex) {
            MessageStatus = ex.getMessage();
            success = false;
        }
        return success;
    }
    
    public static boolean appendTextCost(String appendValue) {
        boolean success = false;
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FileName, true)));
            out.println(appendValue);
            out.close();
            success = true;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return success;
    }
    
    public static void deleteCost(Costs C) {
        BufferedReader br = null;
        String ReWrite = "";
        try {
            if (new File(FileName).exists()) {
                br = new BufferedReader(new FileReader(FileName));
                String line = "";
                while ((line = br.readLine()) != null) {
                    String[] _temp = line.split(",");
                    if (_temp[0].equalsIgnoreCase(C.getNumber()) && _temp[1].equalsIgnoreCase(C.getCost())) {
                        System.out.println("found cost");
                        //ignore line to delete this contact
                    } else {
                        ReWrite += line + "\r\n";
                    }
                }
                br.close();
 
                if (writeFile(ReWrite)) {
                    //JOptionPane.showMessageDialog(null, "Successfully delete cost " + C.getNumber());
                } else {
                    JOptionPane.showMessageDialog(null, "Failed to delete cost " + C.getNumber());
                }
 
                CostsBase.readCosts();
                Telecom_panel.BindIntoJTable();
                
            } else {
                new File(FileName).createNewFile();
                readCosts();
            }
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public static ArrayList<Costs> getAllCustomers() {
        return costs;
    }

    public static void setAllCustomers(ArrayList<Costs> all_costs) {
        costs = all_costs;
    }
}