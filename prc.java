
public class prc {
    public static void main(String[] args){
        int a=5,b=3,c=0;
        if(a>b||a>c){
            System.out.println(a);
        }
        else if(b>a||b>c){
            System.err.println(b);
        }
        else{
            System.out.println(c);
        }
    }
}
