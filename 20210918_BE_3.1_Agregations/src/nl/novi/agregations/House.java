package nl.novi.agregations;

public class House {
    private String streetName;
    private String houseNumber;

    public House(String streetName, String houseNumber) {
        this.streetName = streetName;
        this.houseNumber = houseNumber;
    }

    @Override
    public String toString() {
        return streetName + " " + houseNumber;
    }
}
