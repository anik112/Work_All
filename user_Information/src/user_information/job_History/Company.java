package user_INFORMATION.job_History;


import user_INFORMATION.basic_Information.Name;
import user_INFORMATION.contact_Information.ContactINFO;


public class Company {

    private Name companyName;
    private ContactINFO companyContactInfo;


    public Company() {
        companyName=new Name();
        companyContactInfo=new ContactINFO();
    }

    public Name getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName.setName(companyName);
    }

    public ContactINFO getCompanyContactInfo() {
        return companyContactInfo;
    }

    public void setCompanyContactInfo(String mobileNumber, String email) {
        this.companyContactInfo.setMobileNumber(mobileNumber);
        this.companyContactInfo.setEmail(email);
    }
}
