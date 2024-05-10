abstract class Base{
   void in(){
    System.out.println();
   }
   abstract void out();
}
 public class child1 extends Base{
        void in(){
            System.out.println("hello");
        }
}
class Abs {
    public static void main(String[] args) {
        child1 obj=new child1();
    }
}