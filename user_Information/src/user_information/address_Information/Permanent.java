package user_INFORMATION.address_Information;

public class Permanent{

    private Address permanentAddress;

    public Permanent() {
        permanentAddress=new Address();
    }

    public String addressDescription(){
        return permanentAddress.getAddressDescription();
    }

    public String getCity(){
        return permanentAddress.getCity();
    }

    public int getZipCode(){
        return permanentAddress.getZipCode();
    }

    public void setPermanentAddress(String addressDescription, String city, int zipCode) {
        this.permanentAddress.setAddressDescription(addressDescription);
        this.permanentAddress.setCity(city);
        this.permanentAddress.setZipCode(zipCode);
    }
}
