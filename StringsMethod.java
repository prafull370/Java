import java.util.*;
public class StringsMethod {
    static void SubString(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length()+1;j++){
                System.out.print(s.substring(i,j)+" ");
            }
        }
    }

    static void toggle(StringBuilder str){
        for(int i=0;i<str.length();i++){
            boolean flag = true;  // true->capital
            char ch=str.charAt(i);
            int asci=(int)ch;
            if(asci>=97){
                flag=false;
            }
            if(flag==true){
                asci+=32;
                char nch=(char)asci;
                str.setCharAt(i,nch);
            }
            else{
                asci-=32;
                char nch=(char)asci;
                str.setCharAt(i,nch);
            }
        }
        System.out.println(str);
    }

    static boolean CountSubString(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static void stringCompression(StringBuilder s){
        String ans=""+s.charAt(0);
        int count=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
            else{
                if(count>1) ans+=count;
                count=1;
                ans+=s.charAt(i);
            }
        }
        if(count>1) ans+=count;
        System.out.println(ans);
    }

    static void reverseString(StringBuilder str){
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                sb.append(ch);
            } else {
                sb.reverse();
                ans += sb.toString();
                ans += " ";
                sb.delete(0, sb.length());
            }
        }
        sb.reverse();
        ans+=sb.toString();
        System.out.println(ans);
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s="abcb a";
        int count=0;
        System.out.println("Enter String");
        StringBuilder str = new StringBuilder(sc.nextLine());
//        System.out.println(s.getChars(1,5));
//        for(int i=0;i<s.length();i++){
//            for(int j=i+1;j<s.length()+1;j++){
//                if(CountSubString(s.substring(i,j))==true) {
//                    System.out.print(s.substring(i, j) + " ");
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//        SubString(s);

//        toggle(str);

//        reverseString(str);

        stringCompression(str);
    }
}
