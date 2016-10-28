package uemployee;

/**
 *
 * @author mangu3804
 */
public class Faculty extends UEmployee {
    private String depName;

    /**
     * constructor
     * pre: none
     * post: Faculty object has been created.
     * department name initialized to "Math"
     */
    public Faculty() {
        super();
        depName = "Math";
    }

    /**
     * constructor
     * pre: none
     * post: Faculty object has been initiated with name n,
     * salary s, and depName jN.
     *
     * @param n
     * @param s
     * @param dN
     */
    public Faculty(String n, double s, String dN) {
        super(n, s);
        depName = dN;
    }

    /**
     * Returns the department name.
     * pre: none
     * post: The department name has been returned.
     *
     * @return
     */
    public String getDep() {
        return (depName);
    }
    
    /**
     * Returns a String that represents the Faculty object.
     * pre: none
     * post: A string representing the Faculty object has been returned.
     * @return 
     */
    public String toString() {
        String faculty = super.toString() + ", Department: " + depName;
        return (faculty);
    }
}
