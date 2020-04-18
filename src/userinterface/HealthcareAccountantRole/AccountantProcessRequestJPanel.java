/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.HealthcareAccountantRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.InsuranceCompanyEnterprise;
import Business.Insurance.Insurance;
import Business.InsuranceCustomer.InsuranceCustomer;
import Business.Network.Network;
import Business.Organization.AccountantOrganization;
import Business.Organization.InsuranceAgentOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AccountantBillingRequest;
import Business.WorkQueue.InsuranceWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Lionel
 */
public class AccountantProcessRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private UserAccount userAccount;
    private Enterprise enterprise;
    private AccountantOrganization accountantOrganization;
    private AccountantBillingRequest accountBillingRequest;
    private EcoSystem ecosystem;
    private double payableAmount;
   

    /**
     * Creates new form AccountantWorkRequestJPanel
     */
    AccountantProcessRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, AccountantBillingRequest request, Enterprise enterprise, EcoSystem ecoSystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.enterprise = enterprise;
        this.accountantOrganization = accountantOrganization;
        this.accountBillingRequest = request;
        this.ecosystem = ecoSystem;
        populate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSendRequestForInsurance = new javax.swing.JButton();
        txtSSN = new javax.swing.JTextField();
        txtInsurancePolicyName = new javax.swing.JTextField();
        txtPayableAmount = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtBillAmount = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtPolicyNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtInsuranceClaimAmount = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        btnCOllectCash = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Process Billing Request Area");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("SSN");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("FirstName");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("LastName");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Bill Amount");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Insurance Policy Name");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Payable Amount");

        btnSendRequestForInsurance.setBackground(new java.awt.Color(0, 153, 255));
        btnSendRequestForInsurance.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnSendRequestForInsurance.setText("Receive Amount / Send request for Insurance Claim");
        btnSendRequestForInsurance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendRequestForInsuranceActionPerformed(evt);
            }
        });

        txtSSN.setEditable(false);

        txtInsurancePolicyName.setEditable(false);

        txtPayableAmount.setEditable(false);

        txtFirstName.setEditable(false);

        txtBillAmount.setEditable(false);

        txtLastName.setEditable(false);

        txtPolicyNumber.setEditable(false);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Policy Number");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Insurance Claim Amount");

        txtInsuranceClaimAmount.setEditable(false);

        backJButton.setBackground(new java.awt.Color(0, 153, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        btnCOllectCash.setBackground(new java.awt.Color(0, 153, 255));
        btnCOllectCash.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCOllectCash.setText("Receive complete amount from patient");
        btnCOllectCash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCOllectCashActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtInsurancePolicyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPolicyNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtPayableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(52, 52, 52)
                                        .addComponent(txtInsuranceClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSendRequestForInsurance)
                                .addGap(32, 32, 32)
                                .addComponent(btnCOllectCash)))))
                .addContainerGap(108, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPolicyNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInsurancePolicyName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtInsuranceClaimAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPayableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSendRequestForInsurance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCOllectCash, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendRequestForInsuranceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendRequestForInsuranceActionPerformed
        String policyNumber = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurancePolicyNumber();
        String ssn = accountBillingRequest.getPatient().getSsn();
        String policyName = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getPolicyName();
        String insuranceCompany = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getInsuranceCompany();
        double claimAmount = Double.parseDouble(txtInsuranceClaimAmount.getText());
        double billAmount = accountBillingRequest.getBillingAmount();

//        txtPolicyNumber.setText(policyNumber);
//        txtSSN.setText(ssn);
//        txtFirstName.setText(accountBillingRequest.getPatient().getPatientFirstName());
//        txtLastName.setText(accountBillingRequest.getPatient().getPatientLastName());
//        txtBillAmount.setText(String.valueOf(accountBillingRequest.getBillingAmount()));
//        txtInsurancePolicyName.setText(policyName);

       
            Insurance insurance = new Insurance(policyName, insuranceCompany, claimAmount);
            insurance.setCoverage(accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getCoverage());

            InsuranceCustomer insuranceCustomer = new InsuranceCustomer(insurance, policyNumber);
            insuranceCustomer.setCustomerFirstName(txtFirstName.getText().trim());
            insuranceCustomer.setCustomerLastName((txtLastName.getText().trim()));

            InsuranceWorkRequest insuranceWorkRequest = new InsuranceWorkRequest();
            insuranceWorkRequest.setInsuranceCompany(insuranceCompany);
            insuranceWorkRequest.setPolicyNumber(policyNumber);
            insuranceWorkRequest.setPolicyName(policyName);
            insuranceWorkRequest.setSsn(ssn);
            insuranceWorkRequest.setClaimAmount(claimAmount);
            insuranceWorkRequest.setBillAmount(billAmount);
            insuranceWorkRequest.setHealthCenter(enterprise.getName());

            insuranceWorkRequest.setSender(userAccount);
            insuranceWorkRequest.setStatus("Sent");
            insuranceWorkRequest.setInsuranceCustomer(insuranceCustomer);
            

            Organization org = null;
            InsuranceCompanyEnterprise matchedInsuranceCompany = null;

            List<Network> networks = ecosystem.getNetworks();
            for (Network network : networks) {
                List<Enterprise> enterprises = network.getEnterpriseDirectory().getEnterpriseList();
                for (Enterprise enterprise : enterprises) {
                    if (enterprise.getName().equalsIgnoreCase(accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getInsuranceCompany())) {
                        matchedInsuranceCompany = (InsuranceCompanyEnterprise) enterprise;
                    }
                }
            }

            for (Organization organization : matchedInsuranceCompany.getOrganizationDirectory().getOrganizations()) {
                if (organization instanceof InsuranceAgentOrganization) {
                    org = organization;
                    break;
                }
            }
            if (org != null) {
                org.getWorkQueue().getWorkRequests().add(insuranceWorkRequest);
                userAccount.getWorkQueue().getWorkRequests().add(insuranceWorkRequest);
                accountBillingRequest.setStatus("Patient Transaction Completed");
                accountBillingRequest.getPatient().setIsTreatmentComplete(true);
                JOptionPane.showMessageDialog(null, "Money received from patient: " + payableAmount+". Insurance Claim Request Raised Successfully for amount:" + claimAmount);
           btnSendRequestForInsurance.setEnabled(false);
            }
            
            
         
    }//GEN-LAST:event_btnSendRequestForInsuranceActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ProcessMedicalBillingsJPanel pmbjp = (ProcessMedicalBillingsJPanel) component;
        pmbjp.populateTable();
        pmbjp.populateInsuranceClaimTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void btnCOllectCashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCOllectCashActionPerformed
        accountBillingRequest.setStatus("Patient Transaction Completed");
        JOptionPane.showMessageDialog(null, "Amount received from Patient");
        btnCOllectCash.setEnabled(false);
    }//GEN-LAST:event_btnCOllectCashActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton btnCOllectCash;
    private javax.swing.JButton btnSendRequestForInsurance;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBillAmount;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtInsuranceClaimAmount;
    private javax.swing.JTextField txtInsurancePolicyName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtPayableAmount;
    private javax.swing.JTextField txtPolicyNumber;
    private javax.swing.JTextField txtSSN;
    // End of variables declaration//GEN-END:variables

    private void populate() {
        String policyNumber = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurancePolicyNumber();
        double coverage = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getCoverage();
        double billAmount = accountBillingRequest.getBillingAmount();
        String ssn = accountBillingRequest.getPatient().getSsn();
        String policyName = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getPolicyName();
        String insuranceCompany = accountBillingRequest.getPatient().getInsuranceCustomer().getInsurance().getInsuranceCompany();
        double claimAmount = (coverage * billAmount) / 100;
        payableAmount = billAmount - claimAmount;

        txtPolicyNumber.setText(policyNumber);
        txtSSN.setText(ssn);
        txtFirstName.setText(accountBillingRequest.getPatient().getPatientFirstName());
        txtLastName.setText(accountBillingRequest.getPatient().getPatientLastName());
        txtBillAmount.setText(String.valueOf(billAmount));
        txtInsurancePolicyName.setText(policyName);
        txtInsuranceClaimAmount.setText(String.valueOf(claimAmount));
        txtPayableAmount.setText(String.valueOf(payableAmount));
        
        if(claimAmount>0)
        {
            btnSendRequestForInsurance.setEnabled(true);
            btnCOllectCash.setEnabled(false);
        }
        else
        {
            btnCOllectCash.setEnabled(true);
            btnSendRequestForInsurance.setEnabled(false);
        }

    }
}
