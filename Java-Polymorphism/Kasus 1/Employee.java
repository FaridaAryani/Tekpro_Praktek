public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    //Sets up an employee with the specified information
    public Employee (String eName, String eAddress, String ePhone, String socSecNumber, double rate){
        super(eName, eAddress, ePhone);
        socialSecurityNumber = socSecNumber;
        payRate = rate;
    }

    //Return information about an emplyee as a string
    public String toString(){
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

    //Return the pay rate for this employee
    public double pay(){
        return payRate;
    }
}