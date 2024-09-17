import java.util.ArrayList;
import java.util.Arrays;

public class arraysList {
    public static class Arraylist {
        int[] arr = new int[10];
        int size = 0;
        int indx = 0;

        public void add(int ele) {
            if (size == arr.length) {
                int[] brr = Arrays.copyOf(arr, arr.length * 2) ;
//                    arr=new int[brr.length];
//                    arr=Arrays.copyOf(brr,brr.length);
                    arr = brr;
            }
                arr[indx] = ele;
                indx++;
                size++;

        }
        public void set(int indx,int ele){
            arr[indx] = ele;
        }
    }

    public static void main(String[] args) {
//        ArrayList<Integer> arr= new ArrayList<>();

        Arraylist arr=new Arraylist();
        arr.add(2);
        arr.add(5);
        System.out.println(arr);
    }
}
