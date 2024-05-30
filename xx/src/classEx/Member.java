package classEx;

        class Membur {
	    String name;
	    int age;
	    String phoneNumber;
	    String address;
	    double salary;

	    
	    void printSalary() {
	        System.out.println("Salary: " + salary);
	    }
	}

	// Class Employee inherits Member and adds specialization
	class Employee extends Membur {
	    String specialization;

	    // Constructor to initialize Employee
	    Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	        this.specialization = specialization;
	    }

	    // Method to display Employee details
	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        printSalary();
	        System.out.println("Specialization: " + specialization);
	    }
	}

	// Class Manager inherits Member and adds department
	class Manager extends Membur {
	    String department;

	    // Constructor to initialize Manager
	    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	        this.department = department;
	    }

	    // Method to display Manager details
	    void displayDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Phone Number: " + phoneNumber);
	        System.out.println("Address: " + address);
	        printSalary();
	        System.out.println("Department: " + department);
	    }
	}

	// Main class to demonstrate the functionality
	public class Member {
	    public static void main(String[] args) {
	        // Creating an Employee object
	        Employee employee = new Employee("John Doe", 28, "123-456-7890", "123 Main St", 50000, "Software Development");

	        // Creating a Manager object
	        Manager manager = new Manager("Jane Smith", 35, "098-765-4321", "456 Maple Ave", 75000, "HR");

	        // Displaying details of Employee
	        System.out.println("Employee Details:");
	        employee.displayDetails();
	        System.out.println();

	        // Displaying details of Manager
	        System.out.println("Manager Details:");
	        manager.displayDetails();
	    }
	}

