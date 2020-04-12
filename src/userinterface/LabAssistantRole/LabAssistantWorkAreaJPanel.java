/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.LabAssistantRole;

import Business.EcoSystem;
import Business.Organization.LabOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PatientTreatmentWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private LabOrganization labOrganization;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, EcoSystem business) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.labOrganization = (LabOrganization) organization;

        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : labOrganization.getWorkQueue().getWorkRequests()) {
            Object[] row = new Object[6];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = ((PatientTreatmentWorkRequest) request).getLabAssistant();
            row[3] = request.getStatus();
            row[4] = ((PatientTreatmentWorkRequest) request).getPatient().getPatientFirstName() + " " + ((PatientTreatmentWorkRequest) request).getPatient().getPatientLastName();
            row[5] = ((PatientTreatmentWorkRequest) request).getPatient().getPatientId();
            model.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 123, 123));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setBackground(new java.awt.Color(204, 255, 153));
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Patient Name", "Patient Id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 58, 730, 96));

        assignJButton.setBackground(new java.awt.Color(255, 204, 51));
        assignJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, 50));

        processJButton.setBackground(new java.awt.Color(255, 204, 51));
        processJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 100, 50));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lab Assistant Work Area");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null,"Please select a row first");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);
        if (request.getLabAssistant() == null) {
            if (request.getStatus().equalsIgnoreCase("SentToLab")) {
                request.setLabAssistant(userAccount);
                request.setStatus("Pending on Lab Assistant");
                //  request.setReceiver(userAccount);
                populateTable();
                JOptionPane.showMessageDialog(null, "The request is assigned to You!");
            } else {
                JOptionPane.showMessageDialog(null, "Cannot assign this lab request as the current status is: " + request.getStatus());
            }
        }
        else
        {
            if(userAccount.equals(request.getLabAssistant()))
            {
                JOptionPane.showMessageDialog(null,"Request is already assigned to you");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Request is assigned to other Lab Assistant");
            }
        }

    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row");
            return;
        }

        PatientTreatmentWorkRequest request = (PatientTreatmentWorkRequest) workRequestJTable.getValueAt(selectedRow, 0);

       // request.setStatus("Processing");
        ProcessWorkRequestJPanel processWorkRequestJPanel = new ProcessWorkRequestJPanel(userProcessContainer, request);
        if (request.getLabAssistant() != null) {
            if (userAccount.equals(request.getLabAssistant())) {
                if (request.getStatus().equalsIgnoreCase("Pending on Lab Assistant")) {

                    userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
                    CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                    layout.next(userProcessContainer);
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot process the request as the status is: " + request.getStatus());
                }

            } else {

                JOptionPane.showMessageDialog(null, "Not authorised to process the request");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please assign the request first");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
