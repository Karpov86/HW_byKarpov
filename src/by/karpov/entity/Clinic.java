package by.karpov.entity;

public class Clinic {

    private String name;
    private String address;
    private String helpDeskTelephoneNumber;
    private String callADoctorAtHomeTelephoneNumber;
    private String paidServicesTelephoneNumber;

    public Clinic(String name, String address, String helpDeskTelephoneNumber, String callADoctorAtHomeTelephoneNumber, String paidServicesTelephoneNumber) {
        this.name = name;
        this.address = address;
        this.helpDeskTelephoneNumber = helpDeskTelephoneNumber;
        this.callADoctorAtHomeTelephoneNumber = callADoctorAtHomeTelephoneNumber;
        this.paidServicesTelephoneNumber = paidServicesTelephoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHelpDeskTelephoneNumber() {
        return helpDeskTelephoneNumber;
    }

    public void setHelpDeskTelephoneNumber(String helpDeskTelephoneNumber) {
        this.helpDeskTelephoneNumber = helpDeskTelephoneNumber;
    }

    public String getCallADoctorAtHomeTelephoneNumber() {
        return callADoctorAtHomeTelephoneNumber;
    }

    public void setCallADoctorAtHomeTelephoneNumber(String callADoctorAtHomeTelephoneNumber) {
        this.callADoctorAtHomeTelephoneNumber = callADoctorAtHomeTelephoneNumber;
    }

    public String getPaidServicesTelephoneNumber() {
        return paidServicesTelephoneNumber;
    }

    public void setPaidServicesTelephoneNumber(String paidServicesTelephoneNumber) {
        this.paidServicesTelephoneNumber = paidServicesTelephoneNumber;
    }
}
