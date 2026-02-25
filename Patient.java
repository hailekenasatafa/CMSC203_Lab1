
/*
 * Class: CMSC203
 * Instructor: Ashique Tanveer
 * Description: This class stores and manages patient informations. 
 * Due: 02/24/2026
 * Platform/compiler: Java / Eclipse
 * I pledge that I have completed the programming assignment independently.
 * I have not copied the code from a student or any source.
 * I have not given my code to any student.
 * Print your Name here: Haile Tafa
 */

public class Patient 
{

    private String firstName;
    private String middleName;
    private String lastName;

    private String streetAddress;
    private String city;
    private String state;
    private String zipCode;

    private String phoneNumber;

    private String emergencyContactName;
    private String emergencyContactPhone;

    // No-arg constructor
    public Patient() 
    {
        firstName = "";
        middleName = "";
        lastName = "";
        streetAddress = "";
        city = "";
        state = "";
        zipCode = "";
        phoneNumber = "";
        emergencyContactName = "";
        emergencyContactPhone = "";
    }

    // Constructor with first, middle, and last name
    public Patient(String first, String middle, String last) 
    {
        firstName = first;
        middleName = middle;
        lastName = last;
    }

    // Constructor with all attributes
    public Patient(String first, String middle, String last,
                   String address, String city, String state, String zip,
                   String phone, String emergencyName, String emergencyPhone) 
    {

        firstName = first;
        middleName = middle;
        lastName = last;
        streetAddress = address;
        this.city = city;
        this.state = state;
        zipCode = zip;
        phoneNumber = phone;
        emergencyContactName = emergencyName;
        emergencyContactPhone = emergencyPhone;
    }

    // Accessors and Mutators
    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getMiddleName() 
    {
        return middleName;
    }

    public void setMiddleName(String middleName) 
    {
        this.middleName = middleName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }

    public String getStreetAddress() 
    {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) 
    {
        this.streetAddress = streetAddress;
    }

    public String getCity() 
    {
        return city;
    }

    public void setCity(String city) 
    {
        this.city = city;
    }

    public String getState() 
    {
        return state;
    }

    public void setState(String state) 
    {
        this.state = state;
    }

    public String getZipCode() 
    {
        return zipCode;
    }

    public void setZipCode(String zipCode) 
    {
        this.zipCode = zipCode;
    }

    public String getPhoneNumber() 
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) 
    {
        this.phoneNumber = phoneNumber;
    }

    public String getEmergencyContactName() 
    {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String emergencyContactName) 
    {
        this.emergencyContactName = emergencyContactName;
    }

    public String getEmergencyContactPhone() 
    {
        return emergencyContactPhone;
    }

    public void setEmergencyContactPhone(String emergencyContactPhone) 
    {
        this.emergencyContactPhone = emergencyContactPhone;
    }

    // Build full name
    public String buildFullName() 
    {
        return firstName + " " + middleName + " " + lastName;
    }

    // Build address
    public String buildAddress() 
    {
        return streetAddress + " " + city + " " + state + " " + zipCode;
    }

    // Build emergency contact
    public String buildEmergencyContact() 
    {
        return emergencyContactName + " " + emergencyContactPhone;
    }

    // Display all patient information
    public String toString() 
    {
        return "Patient Name: " + buildFullName()
                + "\nAddress: " + buildAddress()
                + "\nPhone Number: " + phoneNumber
                + "\nEmergency Contact: " + buildEmergencyContact();
    }
}