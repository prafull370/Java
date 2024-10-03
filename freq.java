import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class freq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        System.out.println("Enter array elements");
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Map<Integer,Integer> mp=new HashMap<>();
        int j=0;
        for(int el:a){
            if(!mp.containsKey(el)){
                mp.put(el,1);
            }else{
                mp.put(el,mp.get(el)+1);
            }
        }
        int max=-1,anskey=-1;
        System.out.println(mp.entrySet());

//        for(var el:mp.entrySet()){
//            if(max< el.getValue()){
//                max=el.getValue();
//                anskey=el.getKey();
//            }
//        }

        for(var e:mp.keySet()){
            if(mp.get(e)>max){
                max=mp.get(e);
                anskey=e;
            }
        }
        System.out.println(anskey);
    }
}
