public class simple {
    int a;
    simple(){
        System.out.println("Simple is created.");
    }
    simple(int a){
        System.out.println(a);
    }

    public static void main(String[] args) {
        simple obj=new simple();
        simple obj1=new simple(10);
    }
}
