package collectionFramework;

public class ArrayList {
	static void ArrayListCheck() {
		ArrayList<Integer> l= new ArrayList();// Make a Array List
		l.add(1);
		l.add(2);
		l.add(3);
		System.out.print(l);
		System.out.print(l.get(1));// Print 2
		l.set(1,10);// modify index
		System.out.print(l);//1,10,3
		System.out.println(l.contains(10));
	}
	
//	static void Stack{
//		
//	}
	
   public static void main(String[] args) {
	   ArrayListCheck();
//	   StackExample();
   }
}
