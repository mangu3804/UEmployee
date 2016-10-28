package uemployee;

/**
 *
 * @author mangu3804
 */
public class UEmployee {

    private String name;
    private double salary;
    
    /**
     * constructor
     * pre: none 
     * post: Employee object created.
     * Name initialized to Stanley.
     * Salary initialized to 11.5.
     */
    public UEmployee() {
        name = "Stanley";
        salary = 11.5;
    }
    
    /**
     * constructor
     * pre: none 
     * post: Employee object created with name n and salary s;
     */
    public UEmployee(String n, double s) {
        name = n;
        salary = s;
    }
    
    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The name of the employee has been returned.
     */
    public String getName() {
        return (name);
    }
    
    /**
     * Returns the radius of the circle.
     * pre: none
     * post: The salary of the employee has been returned.
     */
    public double getSalary() {
        return (salary);
    }
    
    /**
     * Returns a String that represents the UEmployee object.
     * pre: none
     * post: A string representing the UEmployee object has been returned.
     */
    public String toString() {
        String uemployee;
        
        uemployee = "Employee: " + name
                + ", Salary: " + salary;
        return (uemployee);
    }
}
