package uemployee;

/**
 * UEmployee class and subclasses are tested.
 * @author Madison Nguyen
 */
public class testUEmployee {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UEmployee employee1 = new UEmployee();
        UEmployee employee2 = new UEmployee("Dave", 20000);
        
        Staff employee3 = new Staff();
        Staff employee4 = new Staff("Arda", 1, "NBA Pro");
        
        Faculty employee5 = new Faculty();
        Faculty employee6 = new Faculty("Bill", 25000, "Physics");
        
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println("");
        System.out.println(employee3);
        System.out.println(employee4);
        System.out.println("");
        System.out.println(employee5);
        System.out.println(employee6);
    }
}
