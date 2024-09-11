import java.util.ArrayList;
import java.util.Collections;

public class ArList {
    public static void rev(ArrayList<Integer> li) {
        for(int i=li.size()-1; i>=0; i--) {
            System.out.print(li.get(i));
            System.out.print("\t");
        }
    }
    // using swap method;
    static void revSwap(ArrayList<Integer> li) {
        int i=0,j=li.size()-1;
        while(i<j) {
            Integer temp = Integer.valueOf(li.get(i));
            li.set(i,li.get(j));
            li.set(j,temp);
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        ArrayList<Integer> li=new ArrayList<>();
        li.add(1);
        li.add(2);
        li.add(3);
        li.add(4);
        li.add(5);
        li.add(10);
        li.add(15);
        li.add(9);
        System.out.println(li);
        System.out.println("Reverse list is: ");
        revSwap(li);
        System.out.println(li);
        System.out.println("Sorted list is: ");
        Collections.sort(li);
        System.out.println(li);
        System.out.println("Reverse list is: ");
        Collections.reverse(li);
        System.out.println(li);
        System.out.println("Sorted Reverse list is: ");
        Collections.sort(li,Collections.reverseOrder());
        System.out.println(li);

        ArrayList<String> str=new ArrayList<>();
        str.add("Language");
        str.add("Java");
        str.add("C++");
        str.add("My name is rohit");
        System.out.println("Original Strlist: "+str);
        Collections.reverse(str);
        System.out.println("REverse strlist is: "+str);

    }
}
