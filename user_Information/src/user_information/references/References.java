package user_INFORMATION.references;

import user_INFORMATION.basic_Information.Name;
import user_INFORMATION.contact_Information.ContactINFO;

public class References {


    private Name refName;
    private ContactINFO contactINFO;

    public References() {
        refName=new Name();
        contactINFO=new ContactINFO();
    }


    public String getRefName() {
        return refName.getName();
    }

    public void setRefName(String refName) {
        this.refName.setName(refName);
    }

    public String getMobileNumber() {
        return contactINFO.getMobileNumber();
    }

    public String getEmail(){
        return contactINFO.getEmail();
    }

    public void setContactINFO(String refMobileNumber, String refEmail) {
        this.contactINFO.setMobileNumber(refMobileNumber);
        this.contactINFO.setEmail(refEmail);
    }
}
