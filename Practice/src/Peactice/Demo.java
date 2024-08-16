package Peactice;
class A {
	public void show() {
		System.out.print("In A");
	}
}
class B extends A{
	public void show() {
		System.out.print("In B");
	}
}
public class Demo {
	public static void main(String[] args) {
//		A obj =new A();
//		obj.show();
//		B obj1=new B();
//		obj1.show();
		int num=3;    
		Integer nums1 = num;
		int num2=nums1.intValue();   
		System.out.print(num2);
	}
}
