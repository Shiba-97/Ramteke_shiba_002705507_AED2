/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import model.City;
import model.Community;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.SystemClass;

/**
 *
 * @author Shubham Idekar
 */
public class System2Panel extends javax.swing.JPanel {

    /**
     * Creates new form System2Panel
     */
    JPanel workArea;
    PatientDirectory ptDirectory;
    PersonDirectory person;
    DoctorDirectory docDirectory;
    HospitalDirectory hospDirectory;
    City commDirectory;
    SystemClass sys;
    public System2Panel(JPanel workArea,PersonDirectory person, PatientDirectory ptDirectory,DoctorDirectory docDirectory, 
                        HospitalDirectory hospDirectory, City commDirectory, SystemClass sys) {
        initComponents();
        this.workArea = workArea;
        this.ptDirectory = ptDirectory;
        this.person= person;
        this.docDirectory = docDirectory;
        this.hospDirectory = hospDirectory;
        this.commDirectory = commDirectory;
        this.sys = sys;
        
        ArrayList<Community> commArray = commDirectory.commDirectory;
        if(!commArray.isEmpty()){
            for(int k = 0; k < commArray.size(); k++){
                cmbcomm.addItem(commArray.get(k).toString());
                
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPatient = new javax.swing.JButton();
        btnComm = new javax.swing.JButton();
        btnHosp = new javax.swing.JButton();
        btnDoc = new javax.swing.JButton();
        cmbRole = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        cmbcomm = new javax.swing.JComboBox<String>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtaptno = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        txtcellph = new javax.swing.JTextField();
        txtstreet = new javax.swing.JTextField();
        cmbgender = new javax.swing.JComboBox<String>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtage = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 204, 255));

        btnPatient.setText("Manage Patients");
        btnPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPatientActionPerformed(evt);
            }
        });

        btnComm.setText("Manage Community");
        btnComm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCommActionPerformed(evt);
            }
        });

        btnHosp.setText("Manage Hospital");
        btnHosp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHospActionPerformed(evt);
            }
        });

        btnDoc.setText("Manage Doctors");
        btnDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDocActionPerformed(evt);
            }
        });

        cmbRole.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { " ", "Hospital Admin\t", "Community Admin", "Doctor", "Patient" }));

        jLabel1.setText("Role");

        jLabel5.setText("Gender");
        jPanel2.add(jLabel5);
        jPanel2.add(lblCity);

        cmbcomm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbcommActionPerformed(evt);
            }
        });

        jLabel3.setText("Select Community");

        jLabel4.setText("Name");

        jLabel7.setText("House No.");

        jLabel8.setText("Cell Phone");

        txtaptno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaptnoActionPerformed(evt);
            }
        });
        txtaptno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtaptnoKeyPressed(evt);
            }
        });

        txtname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnameActionPerformed(evt);
            }
        });

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        txtcellph.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcellphKeyPressed(evt);
            }
        });

        cmbgender.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { " ", "Male", "Female", "Other", " " }));

        jLabel9.setText("Street Name");

        jLabel10.setText("Age");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(btnsave))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(txtaptno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtstreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtcellph, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10)
                                        .addGap(45, 45, 45)
                                        .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(50, 50, 50))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbcomm, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(58, 58, 58))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(201, 201, 201)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnComm)
                            .addComponent(btnPatient)
                            .addComponent(btnDoc)
                            .addComponent(btnHosp))))
                .addContainerGap(603, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnComm, btnDoc, btnHosp, btnPatient});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cmbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbcomm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnComm)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnHosp)
                            .addComponent(txtage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(txtaptno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel9)
                                .addComponent(txtstreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(119, 119, 119)
                        .addComponent(btnsave)
                        .addGap(19, 19, 19))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(btnDoc)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcellph, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(btnPatient))))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnHospActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHospActionPerformed
        // TODO add your handling code here:
            HospitalPanel hosp = new HospitalPanel(workArea, person, ptDirectory, docDirectory, hospDirectory, commDirectory, sys);
            workArea.add("HospitalPanel",hosp );
            CardLayout lay = (CardLayout) workArea.getLayout();
            lay.next(workArea);
    }//GEN-LAST:event_btnHospActionPerformed

    private void btnPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPatientActionPerformed
        // TODO add your handling code here:
            PatientDetails patdet = new PatientDetails(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
            workArea.add("PatientDetails",patdet );
            CardLayout lay = (CardLayout) workArea.getLayout();
            lay.next(workArea);
    }//GEN-LAST:event_btnPatientActionPerformed

    private void cmbcommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbcommActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbcommActionPerformed

    private void txtaptnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaptnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaptnoActionPerformed

    private void txtaptnoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtaptnoKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == 8){
            txtaptno.setEditable(true);

        } else {
            txtaptno.setEditable(false);

        }
    }//GEN-LAST:event_txtaptnoKeyPressed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtcellphKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcellphKeyPressed
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(Character.isDigit(c) || c == 8){
            txtcellph.setEditable(true);

        } else {
            txtcellph.setEditable(false);

        }
    }//GEN-LAST:event_txtcellphKeyPressed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        if(cmbRole.getSelectedIndex() == 0){
            JOptionPane.showMessageDialog(null, "Select a role!");
        }else if(cmbRole.getSelectedIndex() == 1){
//HospitalAdmin
            String name = txtname.getText();
            String gender = cmbgender.getSelectedItem().toString();
            String cellph = txtcellph.getText();
            String street = txtstreet.getText();
//            String city = lblCity.getText();
            String comm = cmbcomm.getSelectedItem().toString();
            String agechk = txtage.getText();
            String aptnochk = txtaptno.getText();
            
            if (name.isEmpty() || gender.isEmpty() || agechk.isEmpty() || cellph.isEmpty() ||  comm.isEmpty() || aptnochk.isEmpty() || street.isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill in all the details");
            } else if(cellph.length() != 10) {
                JOptionPane.showMessageDialog(null, "Incorrect cellphone number");

            }else {

                int age = Integer.parseInt(txtage.getText());
                int aptno = Integer.parseInt(txtaptno.getText());
                Person pc = person.addNewPerson();

                pc.setName(name);
                pc.setAge(age);
                pc.setCellph(cellph);
                pc.setGender(gender);
                pc.setAptno(aptno);
                pc.setStreet(street);
//                pc.setCity(city);
                pc.setComm(comm);
                pc.setRole(cmbRole.getSelectedItem().toString());
                System.out.println(cmbRole.getSelectedItem().toString());
                int x = JOptionPane.showConfirmDialog(null, "Do you want to proceed to register as Doctor ?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(x == JOptionPane.YES_OPTION){
                    CreateAdmin admPan = new CreateAdmin(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
                    workArea.add("CreateAdmin", admPan );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.next(workArea);

                }else if(x == JOptionPane.NO_OPTION){
//                    PatientPanel patty = new PatientPanel(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
//                    workArea.add("Patient", patty );
//                    CardLayout lay = (CardLayout) workArea.getLayout();
//                    lay.previous(workArea);
                }

            }
            
        }else if(cmbRole.getSelectedIndex() == 2){
//CommunityAdmin
            String name = txtname.getText();
            String gender = cmbgender.getSelectedItem().toString();
            String cellph = txtcellph.getText();
            String street = txtstreet.getText();
//            String city = lblCity.getText();
            String comm = cmbcomm.getSelectedItem().toString();
            String agechk = txtage.getText();
            String aptnochk = txtaptno.getText();
            
            if (name.isEmpty() || gender.isEmpty() || agechk.isEmpty() || cellph.isEmpty() ||  comm.isEmpty() || aptnochk.isEmpty() || street.isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill in all the details");
            } else if(cellph.length() != 10) {
                JOptionPane.showMessageDialog(null, "Incorrect cellphone number");

            }else {

                int age = Integer.parseInt(txtage.getText());
                int aptno = Integer.parseInt(txtaptno.getText());
                Person pc = person.addNewPerson();

                pc.setName(name);
                pc.setAge(age);
                pc.setCellph(cellph);
                pc.setGender(gender);
                pc.setAptno(aptno);
                pc.setStreet(street);
//                pc.setCity(city);
                pc.setComm(comm);
                pc.setRole(cmbRole.getSelectedItem().toString());

                int x = JOptionPane.showConfirmDialog(null, "Do you want to proceed to register as Doctor ?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(x == JOptionPane.YES_OPTION){
                    CreateAdmin admPan = new CreateAdmin(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
                    workArea.add("CreateAdmin", admPan );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.next(workArea);

                }else if(x == JOptionPane.NO_OPTION){
//                    PatientPanel patty = new PatientPanel(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
//                    workArea.add("Patient", patty );
//                    CardLayout lay = (CardLayout) workArea.getLayout();
//                    lay.previous(workArea);
                }

            }
        }else if(cmbRole.getSelectedIndex() == 3){
            String name = txtname.getText();
            String gender = cmbgender.getSelectedItem().toString();
            String cellph = txtcellph.getText();
            String street = txtstreet.getText();
//            String city = lblCity.getText();
            String comm = cmbcomm.getSelectedItem().toString();
            String agechk = txtage.getText();
            String aptnochk = txtaptno.getText();
            
            if (name.isEmpty() || gender.isEmpty() || agechk.isEmpty() || cellph.isEmpty() ||  comm.isEmpty() || aptnochk.isEmpty() || street.isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill in all the details");
            } else if(cellph.length() != 10) {
                JOptionPane.showMessageDialog(null, "Incorrect cellphone number");

            }else {

                int age = Integer.parseInt(txtage.getText());
                int aptno = Integer.parseInt(txtaptno.getText());
                Person pc = person.addNewPerson();

                pc.setName(name);
                pc.setAge(age);
                pc.setCellph(cellph);
                pc.setGender(gender);
                pc.setAptno(aptno);
                pc.setStreet(street);
//                pc.setCity(city);
                pc.setComm(comm);
                pc.setRole(cmbRole.getSelectedItem().toString());

                int x = JOptionPane.showConfirmDialog(null, "Do you want to proceed to register as Doctor ?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(x == JOptionPane.YES_OPTION){
                    CreateDoctor docPan = new CreateDoctor(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
                    workArea.add("CreateDoctor", docPan );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.next(workArea);

                }else if(x == JOptionPane.NO_OPTION){
                    PatientPanel patty = new PatientPanel(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
                    workArea.add("Patient", patty );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.previous(workArea);
                }

            }
        
        
        
        
        }else if(cmbRole.getSelectedIndex()== 4) {
        
            String name = txtname.getText();
            String gender = cmbgender.getSelectedItem().toString();
            String cellph = txtcellph.getText();
            String street = txtstreet.getText();
//            String city = lblCity.getText();
            String comm = cmbcomm.getSelectedItem().toString();
            String agechk = txtage.getText();
            String aptnochk = txtaptno.getText();
            

            if (name.isEmpty() || gender.isEmpty() || agechk.isEmpty() || cellph.isEmpty() 
                || comm.isEmpty() || aptnochk.isEmpty() || street.isEmpty()){
                JOptionPane.showMessageDialog(null, "Fill in all the details");
            } else if(cellph.length() != 10) {
                JOptionPane.showMessageDialog(null, "Incorrect cellphone number");

            } else {

                int age = Integer.parseInt(txtage.getText());
                int aptno = Integer.parseInt(txtaptno.getText());
                Person pc = person.addNewPerson();

                pc.setName(name);
                pc.setAge(age);
                pc.setCellph(cellph);
                pc.setGender(gender);
                pc.setAptno(aptno);
                pc.setStreet(street);
//                pc.setCity(city);
                pc.setComm(comm);
                pc.setRole(cmbRole.getSelectedItem().toString());

                int x = JOptionPane.showConfirmDialog(null, "Do you want to proceed to register as Patient ?", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if(x == JOptionPane.YES_OPTION){
                    CreatePatient panpatient = new CreatePatient(workArea,person,ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
                    workArea.add("CreatePatient", panpatient );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.next(workArea);

                }else if(x == JOptionPane.NO_OPTION){
                    PatientPanel patty = new PatientPanel(workArea,person, ptDirectory , docDirectory,hospDirectory, commDirectory, sys);
                    workArea.add("Patient", patty );
                    CardLayout lay = (CardLayout) workArea.getLayout();
                    lay.previous(workArea);
                }

            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnCommActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCommActionPerformed
        // TODO add your handling code here:
            CommunityPanel comp1 = new CommunityPanel(workArea, person, ptDirectory, docDirectory, hospDirectory, commDirectory, sys);
            workArea.add("CommunityPanel",comp1 );
            CardLayout lay = (CardLayout) workArea.getLayout();
            lay.next(workArea);
        
    }//GEN-LAST:event_btnCommActionPerformed

    private void btnDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDocActionPerformed
        // TODO add your handling code here:
            DoctorDetails doc = new DoctorDetails(workArea, person, ptDirectory, docDirectory, hospDirectory, commDirectory, sys);
            workArea.add("DoctorDetails",doc );
            CardLayout lay = (CardLayout) workArea.getLayout();
            lay.next(workArea);
        
    }//GEN-LAST:event_btnDocActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComm;
    private javax.swing.JButton btnDoc;
    private javax.swing.JButton btnHosp;
    private javax.swing.JButton btnPatient;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cmbRole;
    private javax.swing.JComboBox<String> cmbcomm;
    private javax.swing.JComboBox<String> cmbgender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JTextField txtage;
    private javax.swing.JTextField txtaptno;
    private javax.swing.JTextField txtcellph;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtstreet;
    // End of variables declaration//GEN-END:variables
}
