package user_INFORMATION.address_Information;

public class Address {

    private String addressDescription;
    private String city;
    private int zipCode;

    public String getAddressDescription() {
        return addressDescription;
    }

    public void setAddressDescription(String addressDescription) {
        this.addressDescription=addressDescription;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city=city;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode=zipCode;
    }
}
