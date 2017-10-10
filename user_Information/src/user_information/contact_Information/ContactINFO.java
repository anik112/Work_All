package user_INFORMATION.contact_Information;

public class ContactINFO {

    private MobileNumber mobileNumber;
    private Email email;

    public ContactINFO() {
        mobileNumber=new MobileNumber();
        email=new Email();
    }

    public String getMobileNumber() {
        return mobileNumber.getMobilNumber();
    }

    public void setMobileNumber(String giveNumber) {
        this.mobileNumber.setMobilNumber(giveNumber);
    }

    public String getEmail() {
        return email.getEmail();
    }

    public void setEmail(String giveEmail) {
        this.email.setEmail(giveEmail);
    }
}
