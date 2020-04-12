/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import Business.InsuranceCustomer.InsuranceCustomer;


public class Patient {

    private String patientId;
    private String patientLastName;
    private String patientFirstName;
    private String ssn;
    private String age;
    private String phoneNumber;
    private String address;
    private String sex;
    private boolean isTreatmentComplete;
    private String appointmentDate;

    private InsuranceCustomer insuranceCustomer;

    public Patient() {

    }

    public String getPatientLastName() {
        return patientLastName;
    }

    public void setPatientLastName(String patientLastName) {
        this.patientLastName = patientLastName;
    }

    public String getPatientFirstName() {

        return patientFirstName;

    }

    public void setPatientFirstName(String patientFirstName) {
        this.patientFirstName = patientFirstName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public InsuranceCustomer getInsuranceCustomer() {
        return insuranceCustomer;
    }

    public void setInsuranceCustomer(InsuranceCustomer insuranceCustomer) {
        this.insuranceCustomer = insuranceCustomer;
    }

    public String getPatientId() {
        return patientId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.valueOf(patientId);
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    public boolean isIsTreatmentComplete() {
        return isTreatmentComplete;
    }

    public void setIsTreatmentComplete(boolean isTreatmentComplete) {
        this.isTreatmentComplete = isTreatmentComplete;
    }

    public String getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(String appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    
}
