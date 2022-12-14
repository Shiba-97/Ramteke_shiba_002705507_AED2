/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.City;
import model.Doctor;
import model.DoctorDirectory;
import model.HospitalDirectory;
import model.Patient;
import model.PatientDirectory;
import model.PersonDirectory;
import model.SystemClass;

/**
 *
 * @author Shiba
 */
public class DoctorDetails extends javax.swing.JPanel {

    /**
     * Creates new form DoctorDetails
     */
    JPanel workArea;
    PersonDirectory person;
    PatientDirectory ptDirectory;
    DoctorDirectory docDirectory;
    HospitalDirectory hospDirectory;
    City commDirectory;
    SystemClass sys;
    public DoctorDetails(JPanel workArea, PersonDirectory person, PatientDirectory ptDirectory, DoctorDirectory docDirectory, 
                            HospitalDirectory hospDirectory,City commDirectory,SystemClass sys) {
        initComponents();
        this.workArea = workArea;
        this.ptDirectory = ptDirectory;
        this.person= person;
        this.docDirectory = docDirectory;
        this.hospDirectory = hospDirectory;
        this.commDirectory = commDirectory;
        this.sys = sys;
        
        populateDoctable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabDoctor = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        cmbDegree = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtExp = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rbtnYes = new javax.swing.JRadioButton();
        rbtnNo = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();

        setBackground(new java.awt.Color(102, 204, 255));

        tabDoctor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Username", "Name", "Degree", "Experience", "Availability"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabDoctor);
        if (tabDoctor.getColumnModel().getColumnCount() > 0) {
            tabDoctor.getColumnModel().getColumn(0).setResizable(false);
            tabDoctor.getColumnModel().getColumn(1).setResizable(false);
            tabDoctor.getColumnModel().getColumn(2).setResizable(false);
            tabDoctor.getColumnModel().getColumn(3).setResizable(false);
            tabDoctor.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Degree :");

        cmbDegree.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "MBBS", "BMBS", "MD", "DO" }));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Years of Exp:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Availability :");

        rbtnYes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnYesMouseClicked(evt);
            }
        });
        rbtnYes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnYesActionPerformed(evt);
            }
        });

        rbtnNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbtnNoMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Username");

        btnView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(56, 56, 56)
                                .addComponent(cmbDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rbtnYes)
                                        .addGap(88, 88, 88)
                                        .addComponent(rbtnNo))
                                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnView)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnUpdate)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnDelete))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnDelete)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnView)
                            .addComponent(btnUpdate))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cmbDegree, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(rbtnYes)
                    .addComponent(rbtnNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnYesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnYesMouseClicked
        // TODO add your handling code here:
        if(rbtnYes.isSelected()){
            rbtnNo.setSelected(false);
        }
    }//GEN-LAST:event_rbtnYesMouseClicked

    private void rbtnNoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbtnNoMouseClicked
        // TODO add your handling code here:
        if(rbtnNo.isSelected()){
            rbtnYes.setSelected(false);
        }
    }//GEN-LAST:event_rbtnNoMouseClicked

    private void rbtnYesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnYesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnYesActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tabDoctor.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        if(selectedRowIndex>=0){
            
            
            DefaultTableModel model = (DefaultTableModel) tabDoctor.getModel();
            Doctor doc = (Doctor) model.getValueAt(selectedRowIndex, 0);
            lblUsername.setText(doc.userd);
            txtName.setText(doc.getPerson().name);
            cmbDegree.setSelectedItem(doc.degree);
            txtExp.setText(String.valueOf(doc.experience));
            if(doc.avail==true){
                rbtnYes.setSelected(true);
            }else{
                rbtnNo.setSelected(false);
            }
            
            
            
            
        }
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
            int selectedRowIndex = tabDoctor.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        if(selectedRowIndex>=0){
            DefaultTableModel model = (DefaultTableModel) tabDoctor.getModel();
            Doctor dr = (Doctor) model.getValueAt(selectedRowIndex, 0);
            if(model.getRowCount() == 1){
                String nameUp = txtName.getText();
                String UsernameUp = lblUsername.getText();
                String degreeUp = cmbDegree.getSelectedItem().toString();
                String expyearUp = txtExp.getText();
                
              
                    
                    if (nameUp.isEmpty() || UsernameUp.isEmpty() || degreeUp.isEmpty() || expyearUp.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Fill in all the details");
                    } else {
                        int exp = Integer.parseInt(txtExp.getText());
                        dr.getPerson().name = nameUp;
                        dr.userd = lblUsername.getText();
                        dr.experience = exp;
                        dr.degree = degreeUp;
                        if(rbtnYes.isSelected()){
                            dr.avail = true;
                        }else {
                            dr.avail = false;
                        }
                        JOptionPane.showMessageDialog(null, "Updated Successfully!");
                        populateDoctable();
                        
                        txtExp.setText(" ");
                        txtName.setText(" ");
                        lblUsername.setText("");
                        cmbDegree.setSelectedIndex(0);
                        rbtnYes.setSelected(false);
                        rbtnNo.setSelected(false);
                        
                    }
                } 
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tabDoctor.getSelectedRow();
        
        if(selectedRowIndex<0){
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        if(selectedRowIndex>=0){
            DefaultTableModel model = (DefaultTableModel) tabDoctor.getModel();
            Doctor dr = (Doctor) model.getValueAt(selectedRowIndex, 0);
        
            docDirectory.deleteDoc(dr);
            
            JOptionPane.showMessageDialog(null, "Patient data deleted");
            populateDoctable();
            
            txtName.setText("");
            lblUsername.setText("");
            txtExp.setText("");
            cmbDegree.setSelectedIndex(0);
            rbtnYes.setSelected(false);
            rbtnNo.setSelected(false);
            
        
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        System2Panel sys4 = new System2Panel(workArea, person, ptDirectory, docDirectory, hospDirectory, commDirectory, sys);
        workArea.add("System2Panel", sys4);
        CardLayout lay = (CardLayout) workArea.getLayout();
        lay.next(workArea);
    }//GEN-LAST:event_btnBackActionPerformed
    
    private void populateDoctable() {
        DefaultTableModel model = (DefaultTableModel) tabDoctor.getModel();
        
        model.setRowCount(0);
        
        for(Doctor doc : docDirectory.getDocDirectory()){
            Object[] row = new Object[5];
            row[0] = doc;
            row[1] = doc.getPerson().getName();
            row[2] = doc.degree;
            row[3] = doc.experience;
            row[4] = doc.avail;
            
            
            model.addRow(row);
        }
  
//        DefaultListModel list = new DefaultListModel();
//        for(Doctor doc : docDirectory.getDocDirectory()){
//            list.addElement(doc);
//        }
//        listSearch.setModel(list);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JComboBox<String> cmbDegree;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rbtnNo;
    private javax.swing.JRadioButton rbtnYes;
    private javax.swing.JTable tabDoctor;
    private javax.swing.JTextField txtExp;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
