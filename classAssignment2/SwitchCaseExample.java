import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a command (start, stop, pause, exit): ");
        String command = scanner.nextLine();

        switch (command.toLowerCase()) {
            case "start":
                System.out.println("System is starting...");
                break;
            case "stop":
                System.out.println("System is stopping...");
                break;
            case "pause":
                System.out.println("System is pausing...");
                break;
            case "exit":
                System.out.println("Exiting the system...");
                break;
            default:
                System.out.println("Unknown command: " + command);
                break;
        }

        scanner.close();
    }
}
