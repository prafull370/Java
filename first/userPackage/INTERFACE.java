import java.util.Scanner;

interface client {
    void input();

    void output();
}

class INTERFACE implements client {
    String name;
    double sal;

    public void input() {
        Scanner r = new Scanner(System.in);
        System.out.print("Enter user name.");
        name = r.nextLine();
        System.out.println("Enter salary:");
        sal = r.nextDouble();
    }

    public void output() {
        System.out.println(name + " " + sal);
    }

    public static void main(String[] args) {
        client c = new INTERFACE();
        c.input();
        c.output();
    }
}
