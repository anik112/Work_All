package user_INFORMATION.profasonalTranning;

import user_INFORMATION.address_Information.Address;
import user_INFORMATION.basic_Information.Name;
import user_INFORMATION.contact_Information.ContactINFO;


public class Organization {

    private Name orgName;
    private ContactINFO orgContactINFO;
    private Address orgAddress;


    public Organization() {
        orgName=new Name();
        orgContactINFO=new ContactINFO();
        orgAddress=new Address();
    }

    public Name getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName.setName(orgName);
    }

    public ContactINFO getOrgContactINFO() {
        return orgContactINFO;
    }

    public void setOrgContactINFO(String mobileNumber, String orgEmail) {
        this.orgContactINFO.setMobileNumber(mobileNumber);
        this.orgContactINFO.setEmail(orgEmail);
    }

    public user_INFORMATION.address_Information.Address getOrgAddress() {
        return orgAddress;
    }

    public void setOrgAddress(String orgAddress, String city, int zipCode) {
        this.orgAddress.setAddressDescription(orgAddress);
        this.orgAddress.setCity(city);
        this.orgAddress.setZipCode(zipCode);
    }
}
