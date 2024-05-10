
import java.util.*;

public class Employee {
    int empCode;
    String empName;
    String dob;
    Date dobJoining;
    int designationCode;
    float salary;

    Employee() {
        empCode = 1;
        empName = "Prafull";
        dob = "22 - 4 - 2001";
        designationCode = 01;
        salary = 55000;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee [] em;
        em = new Employee[10]; 
        for(int i=0;i<em.length;i++){
            em[i]=new Employee();
        }
        for(int i=0;i<em.length;i++){
            em.in();
            em.out();
        }
    }
}
