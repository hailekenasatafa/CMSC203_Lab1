
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

public class Procedure 
{

    private String procedureName;
    private String procedureDate;
    private String practitionerName;
    private double charges;

    // constructor with No-arg
    public Procedure() 
    {
        procedureName = "";
        procedureDate = "";
        practitionerName = "";
        charges = 0.0;
    }

    // Constructors with name
    public Procedure(String name, String date) 
    {
        procedureName = name;
        procedureDate = date;
    }

    // Constructors with all attributes
    public Procedure(String name, String date, String practitioner, double charges) 
    {
        procedureName = name;
        procedureDate = date;
        practitionerName = practitioner;
        this.charges = charges;
    }

    // Accessories 
    public String getProcedureName() 
    {
        return procedureName;
    }

    public void setProcedureName(String procedureName) 
    {
        this.procedureName = procedureName;
    }

    public String getProcedureDate() 
    {
        return procedureDate;
    }

    public void setProcedureDate(String procedureDate) 
    {
        this.procedureDate = procedureDate;
    }

    public String getPractitionerName() 
    {
        return practitionerName;
    }

    public void setPractitionerName(String practitionerName) 
    {
        this.practitionerName = practitionerName;
    }

    public double getCharges() 
    {
        return charges;
    }

    public void setCharges(double charges) 
    {
        this.charges = charges;
    }

    // Display
    public String toString() 
    {
        return "Procedure Name: " + procedureName
                + "\nDate: " + procedureDate
                + "\nPractitioner: " + practitionerName
                + "\nCharges: $" + charges;
    }
}