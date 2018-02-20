package ooplab9;

public class Address {

    private String HomeNumber;
    private String Privince;
    private String PostCode;

    public Address (String HomeNumber, String Privince, String PostCode) {
        this.HomeNumber = HomeNumber;
        this.Privince = Privince;
        this.PostCode = PostCode;
    }
    //toString

    @Override
    public String toString() {
        return "Address{" +
                "Home Number='" + HomeNumber + '\'' +
                ", Privince='" + Privince + '\'' +
                ", PostCode=" + PostCode +
                '}';
    }
    //getter and setter method

    public String getHomeNumber() {
        return HomeNumber;
    }

    public void setHomeNumber(String HomeNumber) {
        this.HomeNumber = HomeNumber;
    }

    public String getPrivince() {
        return Privince;
    }

    public void setPrivince(String Privince) {
        this.Privince = Privince;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String PostCode) {
        this.PostCode = PostCode;
    }

}