public class AssignmentMain {

    import com.yourname.assignment.employees.Developer;
import com.yourname.assignment.employees.Manager;
import com.yourname.assignment.utilities.EmployeeUtilities;

/**
 * Demonstrates the use of packages and access modifiers.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 1001, 90000, "HR");
        Developer developer = new Developer("Bob", 1002, 80000, "Java");

        // Use utilities
        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);

        // Give raise
        EmployeeUtilities.giveRaise(manager, 10);
        EmployeeUtilities.giveRaise(developer, 15);

        System.out.println("\nAfter Raise:");
        EmployeeUtilities.displayEmployeeInfo(manager);
        EmployeeUtilities.displayEmployeeInfo(developer);
    }
}


}
