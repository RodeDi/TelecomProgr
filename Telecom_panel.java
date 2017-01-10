package java_project;

import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Telecom_panel extends javax.swing.JFrame {
    private javax.swing.JButton jButton1, jButton2, jButton3, jButton4, jButton5, jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextSearch;
    private static javax.swing.JTextField jTextStatus;
    
    public Telecom_panel() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(getWindowAdapter());
        jTable1.getTableHeader().setFont(new java.awt.Font("Verdana", 0, 11));
        //load contacts into ArrayList
        CustomerBase.readCustomers();
        CostsBase.readCosts();
        BindIntoJTable();
    }
    
    //make public and for enable to access from another class
    public static void BindIntoJTable() {
        //clear jTable First
        jTable1.removeAll();
        ArrayList<Customer> customers = CustomerBase.getAllCustomers();
        if (customers != null) {           
            int index = 1;
            String colNames[] = {"No", "Name", "Contacts No", "Address", "Costs"};
            DefaultTableModel dtm = new DefaultTableModel(null, colNames);
 
            for (int i = 0; i < customers.size(); i++) {
                dtm.addRow(new String[i]);
            }
            jTable1.setModel(dtm);
 
            if (customers.size() > 0) {
                int row = 0;
                for (Customer c : customers) {
                    jTable1.setValueAt(Integer.toString(index), row, 0);                                       
                    jTable1.setValueAt(c.getName(), row, 1);
                    jTable1.setValueAt(c.getNumber(), row, 2);                   
                    jTable1.setValueAt(c.getAdress(), row, 3);
                    jTable1.setValueAt(c.getCost(), row, 4);
                    index++;                   
                    row++;
                }
                jTable1.getColumn("No").setMaxWidth(30);
                jTable1.getColumn("Name").setMaxWidth(100);
                jTable1.getColumn("Contacts No").setMaxWidth(120);
                jTable1.getColumn("Address").setMaxWidth(120);
                jTable1.getColumn("Costs").setMaxWidth(90);
                jTextStatus.setText(Integer.toString(customers.size())
                        + " records found");
            } else {
                jTextStatus.setText("No record Found");
            }
        }
    }
 
    private WindowAdapter getWindowAdapter() {
        return new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {//override to show message
                super.windowClosing(we);
                if (JOptionPane.showConfirmDialog(null, "Are you sure to close this application?",
                        "Confirmation Box", JOptionPane.OK_CANCEL_OPTION) == 0) { //clicked ok
                    CloseApp();
                }
            }
        };
    }
    
    public void CloseApp() {
        this.dispose();
    }

    //This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                         
    private void initComponents() {
 
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextSearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Phone Contacts - Group");
        setResizable(false);
 
        jScrollPane1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
 
        jTable1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Name", "Contacts No", "Email Address"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
 
        jButton1.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton1.setText("Add Contact");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
 
        jButton2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton2.setText("Edit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        jButton6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton6.setText("Pay");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
 
        jButton3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
 
        jTextStatus.setBackground(new java.awt.Color(153, 153, 153));
        jTextStatus.setFont(new java.awt.Font("Verdana", 3, 11)); // NOI18N
        jTextStatus.setToolTipText("This is a Application Status");
        jTextStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jTextStatus.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jTextStatus.setEnabled(false);
 
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Search Contact");
 
        jTextSearch.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
 
        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
 
        jButton5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jButton5.setText("Reload Contacts");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextStatus)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addGap(0, 3, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2)
                        .addComponent(jButton6)
                        .addComponent(jButton3)
                        .addComponent(jButton5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
 
        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                       
 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //Add Contact
        AddEditForm Form = new AddEditForm();
        Form.setFormMode(true);//true for add mode
        Form.UpdateStatus();
        Form.setVisible(true);
    }
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow(); 
        //if row is -1 mean user have not select any row yet
        if(row != -1){
            
            String phone = (String)jTable1.getValueAt(row,1);
            String name = (String)jTable1.getValueAt(row,2);
            String adress = (String)jTable1.getValueAt(row,3);
            String cost = (String)jTable1.getValueAt(row,4);
            
            Customer C = new Customer(phone, name, adress, cost);
         
            AddEditForm dlg = new AddEditForm();
            dlg.setFormMode(false);// true for add mode
            dlg.MapTextBox(C);
            dlg.UpdateStatus();
            dlg.setVisible(true);           
        }
    }
 
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
         int row = jTable1.getSelectedRow(); 
        //if row is -1 mean user have not select any row yet
        if(row != -1){
            String name = (String)jTable1.getValueAt(row,1);
            String phone = (String)jTable1.getValueAt(row,2);
            String email = (String)jTable1.getValueAt(row,3);
            String cost = (String)jTable1.getValueAt(row,4);
            
            Customer C = new Customer(name, phone, email, cost);
            
            if (JOptionPane.showConfirmDialog(null, "Are you sure to delete contact : " + name + "?",
                    "Confirmation Box", JOptionPane.OK_CANCEL_OPTION) == 0) { //clicked ok
                CustomerBase.deleteCustomer(C);
            }
        }
    }
 
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        String searchValue = jTextSearch.getText();
        ArrayList<Customer> contacts = CustomerBase.searchCustomer(searchValue);
        CustomerBase.setAllCustomers(contacts);
        BindIntoJTable();
    }
    
    private static void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        //reload Contacts
        CustomerBase.readCustomers();
        BindIntoJTable();
    }
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        int row = jTable1.getSelectedRow();
        //if row is -1 mean user have not select any row yet
        if(row != -1){
            
            String name = (String)jTable1.getValueAt(row,1);
            String phone = (String)jTable1.getValueAt(row,2);
            String address = (String)jTable1.getValueAt(row,3);
            String cost = (String)jTable1.getValueAt(row,4);
            
            Costs Cost = new Costs(phone, cost);
            Customer C = new Customer(name, phone, address, cost);
         
            AddEditCostForm dlg = new AddEditCostForm();
            dlg.MapTextBox(Cost, C);
            dlg.UpdateStatus();
            dlg.setVisible(true);
        }
    }
 
    private void jMenu1MenuSelected(javax.swing.event.MenuEvent evt) {
        // do nothing
    }
}