package pxyx;

public class newclassxyz {
	public static void main(String[] args) {
		   int arr[]=new int[10];
		   try {
			   arr[11]=10;
			   System.out.println("try one is called.");
		   }
		   catch(ArrayIndexOutOfBoundsException e){
//			   try {
//				   arr
//			   }
			   System.out.println("Handle catch.");
		   }
	   }


}
