package user_INFORMATION.address_Information;

public class Present {

    private Address presentAddress;

    public Present() {
        presentAddress=new Address();
    }


    public String addressDescription(){
        return presentAddress.getAddressDescription();
    }

    public String getCity(){
        return presentAddress.getCity();
    }

    public int getZipCode(){
        return presentAddress.getZipCode();
    }

    public void setPresentAddress(String addressDescription, String city, int zipCode) {
        this.presentAddress.setAddressDescription(addressDescription);
        this.presentAddress.setCity(city);
        this.presentAddress.setZipCode(zipCode);
    }
}
