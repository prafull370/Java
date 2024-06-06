package userException;
import java.util.*;

public class account extends Exception {
	    private String name;
	    private String course;
	    private int marks;
	 
	    public account(String message) {
	        super(message);
	    }
	 
	    public void accept() throws account {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter name: ");
	        name = scanner.nextLine();
	        System.out.print("Enter course: ");
	        course = scanner.nextLine();
	        System.out.print("Enter marks: ");
	        marks = scanner.nextInt();
	        check();
	    }
	 
	    public void check() throws account {
	        if (marks < 33 || marks > 100) {
	            throw new account("Marks are invalid. Marks should be between 33 and 100.");
	        }
	    
	    }
	 
	    public static void main(String[] args) {
	        try {
	        	account obj = new account("hi");
	            obj.accept();
	            System.out.println("Valid marks entered.");
	        } catch (account e) {
	            System.out.println(e.getMessage());
	        }
	    }
	}