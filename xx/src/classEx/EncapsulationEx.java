package classEx;
class Demo1{
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age=a;
	}
	public void setName(String b) {
		name=b;
	}
}

public class EncapsulationEx {
public static void main(String[] args) {
	Demo1 obj=new Demo1();
	obj.setAge(10);
	obj.setName("Prafull");
	System.out.println(obj.getAge()+" "+obj.getName());
}
}
