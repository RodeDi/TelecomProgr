package java_project;

import javax.swing.JOptionPane;
 
public class AddEditForm extends javax.swing.JFrame {
    private javax.swing.JTextField JTextName, JTextPhone, JTextAddress, JTextStatus;
    private javax.swing.JButton jButton1, jButton2;
    private javax.swing.JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    String Cost;
 
    private boolean formMode; // true for add, false for edit
    private Customer editCustomerDetails;
    
    public static void main(String args[]) {
        // Create and display the form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEditForm().setVisible(true);
            }
        });
    }
    
    //Creates new form AddEditForm
    public AddEditForm() {
        initComponents();
    }
    
    public void UpdateStatus(){
        if(formMode) {
            JTextStatus.setText("Add Contact Mode");
            jButton1.setText(formMode ? "Save" : "Update");
        } else {
            JTextStatus.setText("Edit Contact Mode");
            jButton1.setText(formMode ? "Save" : "Update");
        }
    }
    
    public void MapTextBox(Customer c){
        if(c != null){
            Cost = c.getCost();
            JTextName.setText(c.getName());
            JTextPhone.setText(c.getNumber());
            JTextAddress.setText(c.getAdress());
            editCustomerDetails = c;
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
        JTextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTextPhone = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTextAddress = new javax.swing.JTextField();
        
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        JTextStatus = new javax.swing.JTextField();
 
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
 
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14));
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Contact Information");
 
        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel2.setText("Name");
 
        JTextName.setFont(new java.awt.Font("Verdana", 0, 11));
 
        JTextPhone.setFont(new java.awt.Font("Verdana", 0, 11));
        JTextPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTextPhoneKeyPressed(evt);
            }
        });
 
        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel3.setText("Contact No");
 
        JTextAddress.setFont(new java.awt.Font("Verdana", 0, 11));
 
        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11));
        jLabel4.setText("Address");
 
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
        JTextStatus.setToolTipText("This is a Contact Information Status");
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
                            .addComponent(jLabel4)
                            .addComponent(JTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(JTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(JTextName, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTextAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        CloseDialog();
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        String Name = JTextName.getText();
        String Phone = JTextPhone.getText();
        String Address = JTextAddress.getText();
        String buildCustomer = "";
        
        if(!Name.isEmpty()){
            buildCustomer += Name + ",";
        }else {
            buildCustomer += "NULL" + ",";
        }
        
        if(!Phone.isEmpty()){
            buildCustomer += Phone + ",";
        }else {
            buildCustomer += "NULL" + ",";
        }
        
        if(!Address.isEmpty()){
            buildCustomer += Address + ",";
        }else {
            buildCustomer += "NULL" + ",";
        }
        
        buildCustomer += Cost;
        
        buildCustomer = buildCustomer.substring(0, buildCustomer.length() -1);
        
        if(formMode) {
            if(CustomerBase.appendTextCustomer(buildCustomer + "\r\n")){
                JOptionPane.showMessageDialog(null, "Successfully add contact : " + Name);               
                CustomerBase.readCustomers(); // reread contact file to reload arrayList
                Telecom_panel.BindIntoJTable();
                CloseDialog();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add contact : " + Name);
            } 
        } else {
            if(CustomerBase.editCustomer(editCustomerDetails.getName(),
                    editCustomerDetails.getNumber(),
                    editCustomerDetails.getAdress(), 
                    editCustomerDetails.getCost(), buildCustomer)){
                JOptionPane.showMessageDialog(null, "Successfully update contact : " + Name);
                CustomerBase.readCustomers(); // reread contact file to reload arrayList
                Telecom_panel.BindIntoJTable();
                CloseDialog();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update contact : " + Name);
            }
        }
    }
 
    private void JTextPhoneKeyPressed(java.awt.event.KeyEvent evt) {                                 
        if(JTextPhone.getText().length() == 12){
            JTextPhone.setText(JTextPhone.getText().substring(0,JTextPhone.getText().length() - 1));
        }
    }
    
    // @param formMode the formMode to set
    public void setFormMode(boolean formMode) {
        this.formMode = formMode;
    }

    // @return the editContactDetails
    public Customer getEditContactDetails() {
        return editCustomerDetails;
    }
 
    // @param editContactDetails the editContactDetails to set
    public void setEditContactDetails(Customer editContactDetails) {
        this.editCustomerDetails = editContactDetails;
    }
}