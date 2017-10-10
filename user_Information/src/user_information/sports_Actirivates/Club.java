package user_INFORMATION.sports_Actirivates;


import user_INFORMATION.address_Information.Address;
import user_INFORMATION.basic_Information.Name;
import user_INFORMATION.contact_Information.ContactINFO;


public class Club {

    private Name clubName;
    private ContactINFO clubContactINFO;
    private Address clubAddress;

    public Club() {
        clubName=new Name();
        clubContactINFO=new ContactINFO();
        clubAddress=new Address();
    }

    public String getClubName() {
        return clubName.getName();
    }

    public void setClubName(String clubName) {
        this.clubName.setName(clubName);
    }

    public ContactINFO getClubContactINFO() {
        return clubContactINFO;
    }

    public void setClubContactINFO(String clubMobileNumber, String clubEmail) {
        this.clubContactINFO.setMobileNumber(clubMobileNumber);
        this.clubContactINFO.setEmail(clubEmail);
    }

    public Address getClubAddress() {
        return clubAddress;
    }

    public void setClubAddress(String clubAddress, String city, int zipCode) {
        this.clubAddress.setAddressDescription(clubAddress);
        this.clubAddress.setCity(city);
        this.clubAddress.setZipCode(zipCode);
    }
}
