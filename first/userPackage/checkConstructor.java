import java.util.*;
// import first.userPackage;

// public class checkConstructor {
//         public static void main(String str[]){
//            userPackage p=new userPackage();
//             System.out.println(userPackage.age);
//         }
// }


public class checkConstructor{
    // int age;
    static void person(int age){
        System.out.println("Person age"+ age);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        person(age);
    }
}
