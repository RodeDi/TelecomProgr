package java_project;

import javax.swing.JOptionPane;

public class AddEditCostForm extends javax.swing.JFrame {
    private javax.swing.JTextField  JTextCost, JTextStatus;
    private javax.swing.JButton jButton1, jButton2;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3;

    private Costs editCostDetails;
    private Customer editCustomerDetails;
    String Name, Phone, Address;
    
    public static void main(String args[]) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEditCostForm().setVisible(true);
            }
        });
    }
    
    public AddEditCostForm() {
        initComponents();
    }
    
    public void UpdateStatus(){
        JTextStatus.setText("Edit Cost Mode");
        jButton1.setText("Update");
    }
    
    public void MapTextBox(Costs c, Customer C){
        if(c != null){
            jLabel2.setText("Contact No: " + c.getNumber());
            JTextCost.setText(c.getCost());
            editCostDetails = c;
            
            Name = C.getName();
            Phone = C.getNumber();
            Address = C.getAdress();
            C.getName();
            C.getNumber();
            C.getAdress();
            C.getCost();
            editCustomerDetails = C;
        }
    }
    
    protected void CloseDialog() {
        this.dispose();
    }
    
    //This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                         
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextCost = new javax.swing.JTextField();
        
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTextStatus = new javax.swing.JTextField();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
 
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Cost Information");
 
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11));
        
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel3.setText("Cost");
        
        JTextCost.setFont(new java.awt.Font("Verdana", 0, 11));
 
        jButton1.setFont(new java.awt.Font("Verdana", 0, 11));
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
 
        jButton2.setFont(new java.awt.Font("Verdana", 0, 11));
        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
 
        JTextStatus.setBackground(new java.awt.Color(153, 153, 153));
        JTextStatus.setFont(new java.awt.Font("Verdana", 3, 11));
        JTextStatus.setForeground(new java.awt.Color(255, 255, 255));
        JTextStatus.setToolTipText("This is a Cost Information Status");
        JTextStatus.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        JTextStatus.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        JTextStatus.setEnabled(false);
 
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(JTextCost, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            )))
                .addContainerGap(23, Short.MAX_VALUE))
            .addComponent(JTextStatus)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(JTextStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pack();
        setLocationRelativeTo(null);
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String Cost = JTextCost.getText();
        
        String buildCost = "";
        String buildCustomer = "";
        
        buildCost += Phone + ",";
        
        if(!Cost.isEmpty()){
            buildCost += Cost + ",";
        }else {
            buildCost += "NULL" + ",";
        }
        
        buildCustomer += Name + ",";
        buildCustomer += Phone + ",";
        buildCustomer += Address + ",";
        
        if(!Cost.isEmpty()){
            buildCustomer += Cost + ",";
        }else {
            buildCustomer += "NULL" + ",";
        }
        
        buildCustomer = buildCustomer.substring(0, buildCustomer.length() -1);
        buildCost = buildCost.substring(0, buildCost.length());
        
        if((CostsBase.editCost(editCostDetails.getNumber(), editCostDetails.getCost(), buildCost)) 
                && CustomerBase.editCustomer(editCustomerDetails.getName(),
                    editCustomerDetails.getNumber(),
                    editCustomerDetails.getAdress(), 
                    editCustomerDetails.getCost(), buildCustomer)){
            JOptionPane.showMessageDialog(null, "Successfully updated cost");
            CustomerBase.readCustomers();
            CostsBase.readCosts(); // reread contact file to reload arrayList
            Telecom_panel.BindIntoJTable();
            CloseDialog();
        } else {
            JOptionPane.showMessageDialog(null, "Failed to update cost");
        }
    }
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CloseDialog();
    }
    
    public Costs getEditCostDetails() {
        return editCostDetails;
    }
}