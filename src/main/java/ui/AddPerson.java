/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import newpackage.Person;
import newpackage.PersonDirectory;

/**
 *
 * @author shiba
 */
public class AddPerson extends javax.swing.JPanel {

    /**
     * Creates new form AddPerson
     */
    PersonDirectory personDirectory;
    public JPanel RightPanel;
    public AddPerson(JPanel RightPanel, PersonDirectory personDirectory) {
        initComponents();
        this.RightPanel= RightPanel;
        this.personDirectory = personDirectory;
        
        
    }

  //  private AddPerson(JPanel RightPanel, PersonDirectory personDirectory) {
  //      throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  //  }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfHouseNo = new javax.swing.JTextField();
        tfEmail = new javax.swing.JTextField();
        cmbCity = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        cbmComm = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        tfCellno = new javax.swing.JTextField();
        SubmitBt = new javax.swing.JButton();

        lbName.setText("NAME");

        jLabel3.setText("HOUSE No.");

        jLabel4.setText("EMAIL ID");

        jLabel5.setText("CITY");

        jLabel6.setText("COMMUNITY");

        cmbCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "New York", "New Jersey", "Rochester", "Maine", "New Hamshire", "Vermont" }));
        cmbCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCityActionPerformed(evt);
            }
        });

        jLabel7.setText("AGE");

        cbmComm.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Beacon Hill", "Brighton", "Charlestown", "Chinatown-Leather District", "Dorchester", "Upper West Side (Manhattan)", "Upper East Side (Manhattan)", "Greenwich Village (Manhattan)", "East Village (Manhattan)", "Bayside (Queens)", "Financial District (Manhattan)", "Brooklyn Heights (Brooklyn)", "Williamsburg (Brooklyn)" }));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(lbName)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbmComm, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cmbCity, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(133, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfName)
                            .addComponent(tfHouseNo)
                            .addComponent(tfEmail)
                            .addComponent(tfAge, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                            .addComponent(tfCellno))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbmComm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(154, 154, 154)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfHouseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(tfCellno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );

        SubmitBt.setText("SUBMIT");
        SubmitBt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitBtActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(220, 220, 220)
                .addComponent(SubmitBt)
                .addGap(194, 194, 194))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(SubmitBt)
                .addGap(89, 89, 89))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCityActionPerformed

    private void SubmitBtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitBtActionPerformed
        // TODO add your handling code here:
        
        String Name = tfName.getText();
        String HouseNO = tfHouseNo.getText();
        String Email = tfEmail.getText();
        String city = cmbCity.getSelectedItem().toString();
        String Community = cbmComm.getSelectedItem().toString();   
  String Cellno = tfCellno.getText();  
  String AgeChk = tfAge.getText();
  
                if(Name.isEmpty() || AgeChk.isEmpty() || HouseNO.isEmpty() || Email.isEmpty() )
           {
      JOptionPane.showMessageDialog(null, "FIll all details");
    }//GEN-LAST:event_SubmitBtActionPerformed
  else if (Cellno.length() !=10) {
      
      JOptionPane.showMessageDialog(null, "Incorrect Cell No.");
  }
  else {
     
  
          int Age = Integer.parseInt(tfAge.getText());
    Person PD = personDirectory.createAndAddPerson();
    PD.setAge(Age);
    PD.setHouseNo(HouseNO);
    PD.setCity(city);
    PD.setCommunity(Community);
    PD.setPersonName(Name);
    PD.setEmail(Email);
    PD.setCellno(Cellno);
    
    int x = JOptionPane.showConfirmDialog(null, "DO you want to continue as Patient?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    if (x == JOptionPane.YES_OPTION){
        NewPersonCreation AP = new NewPersonCreation(RightPanel,personDirectory);
           RightPanel.add("NewPersonCreation", AP );
                    CardLayout lay = (CardLayout) RightPanel.getLayout();
                    lay.next(RightPanel);
                 
             }else if(x == JOptionPane.NO_OPTION){
                    AddPerson patty = new AddPerson(RightPanel, personDirectory);
                    RightPanel.add("Patient", patty );
                    CardLayout lay = (CardLayout) RightPanel.getLayout();
                    lay.previous(RightPanel);
             }
                
        
}
    
    
  
  
    
  
  }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitBt;
    private javax.swing.JComboBox<String> cbmComm;
    private javax.swing.JComboBox<String> cmbCity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbName;
    private javax.swing.JTextField tfAge;
    private javax.swing.JTextField tfCellno;
    private javax.swing.JTextField tfEmail;
    private javax.swing.JTextField tfHouseNo;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}
