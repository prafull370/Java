package classEx;

class Demo {
    int number;
    String brand;
    static String name;

    public void show() {
        System.out.print(brand + ":" + name + ":" + number);
    }

    public static void show1(Demo obj) {
        System.out.print(obj.brand + ":" + name + ":" + obj.number);
    }
}

public class StaticEx {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.number = 10;
        obj.brand = "nokia";
        Demo.show1(obj);
    }
}
