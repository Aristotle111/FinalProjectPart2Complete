/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package finalprojectday1;

/**
 *
 * @author 6312971
 */
public class Address {
    // The street number and name
    private String street;
    // The city in which the address is located
    private String city;
    // The state in which the address is located
    private String state;
    // The zip code associated with the city and street
    private String zip;
    /**
    Constructor
    @param road Describes the street number and name.
    @param town Describes the city.
    @param st Describes the state.
    @param zipCode Describes the zip code.
    */
    public Address(String road, String town, String st, String zipCode) {
        street = road;
        city = town;
        state = st;
        zip = zipCode;
    }
    /**
    The toString method
    @return Information about the address.
    */
    @Override
    public String toString() {
        return (street + ", " + city +
        ", " + state + " " + zip);
    }
}
