public class static1 {
    static int a;

    static {
        System.out.println("static block");
        a=10;
    }

    static  void m(){
        System.out.println("hello");
        System.out.println(a);
    }
    public static void main(String args[]){
        // static1 o=new static1();
        // o.m();
        static1.m();
        a=100;
        System.out.println(a);
    }
}
