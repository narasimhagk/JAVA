package EmployeeManagement;
public class Address {

    private String country;
    private String street;
    private String region;
    private String postalCode;

    //Getters Setters

    public Address(String country, String street, String region, String postalCode) {
        this.country = country;
        this.street = street;
        this.region = region;
        this.postalCode = postalCode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", region='" + region + '\'' +
                ", postalCode='" + postalCode + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (getCountry() != null ? !getCountry().equals(address.getCountry()) : address.getCountry() != null)
            return false;
        if (getStreet() != null ? !getStreet().equals(address.getStreet()) : address.getStreet() != null) return false;
        if (getRegion() != null ? !getRegion().equals(address.getRegion()) : address.getRegion() != null) return false;
        return getPostalCode() != null ? getPostalCode().equals(address.getPostalCode()) : address.getPostalCode() == null;
    }

    @Override
    public int hashCode() {
        int result = getCountry() != null ? getCountry().hashCode() : 0;
        result = 31 * result + (getStreet() != null ? getStreet().hashCode() : 0);
        result = 31 * result + (getRegion() != null ? getRegion().hashCode() : 0);
        result = 31 * result + (getPostalCode() != null ? getPostalCode().hashCode() : 0);
        return result;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
