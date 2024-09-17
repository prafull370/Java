public class fraction {
    public static Fraction add (Fraction a, Fraction b) {
        int numerator = a.num*b.den+a.den*b.num;
        int denominator=a.den*b.den;
        Fraction c=new Fraction(numerator,denominator);
        return c;
    }
    public static class Fraction {
        public int num;
        public int den;
        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
        }

        public void simplify() {
            int hcf=gcd(num,den);
            num /=hcf;
            den /=hcf;
        }

        private int gcd(int num, int den) {
            int min=Math.min(num,den);
            for(int i=min;i>=1;i--) {
                if(num%i==0&&den%i==0) {
                    return i;
                }
            }
            return min;
        }
    }
    public static void main(String[] args) {
        Fraction f1=new Fraction(3,8);
        System.out.println(f1.num+" /"+f1.den);
//        f1.simplify();
        Fraction f2=new Fraction(8,24);
        System.out.println(f2.num+" /"+f2.den);
        Fraction f3=add(f1,f2);
        System.out.println(f3.num+"/"+f3.den);
    }
}
