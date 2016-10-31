package uemployee;

/**
 *
 * @author mangu3804
 */
public class Staff extends UEmployee {
    private String jobName;
    
    /**
     * constructor
     * pre: none
     * post: Staff object has been created.
     * name initialized to "Janitor"
     */
    public Staff() {
        super();
        jobName = "Janitor";
    }
    
    /**
     * constructor
     * pre: none
     * post: Staff object has been initiated with
     * name n, salary s, and jobName jN.
     * @param n
     * @param s
     * @param jN 
     */
    public Staff(String n, double s, String jN) {
        super(n,s);
        jobName = jN;
    }
    
    /**
     * Returns the job name.
     * pre: none
     * post: The job name has been returned.
     * @return 
     */
    public String getJob() {
        return(jobName);
    }
    
    /**
     * Returns a String that represents the Staff object.
     * pre: none
     * post: A string representing the Staff object has been returned.
     * @return 
     */
    public String toString() {
        String staff = super.toString() + ", Title: " + jobName;
        return (staff);
    }
}
