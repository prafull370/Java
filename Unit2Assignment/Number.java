public class Number {
    private double value;

    public Number(double value) {
        this.value = value;
    }

    boolean isZero() {
        return value == 0;
    }

    boolean isPositive() {
        return value > 0;
    }

    boolean isNegative() {
        return value < 0;
    }

    boolean isOdd() {
        return value % 2 != 0;
    }

    boolean isEven() {
        return value % 2 == 0;
    }

    boolean isPrime() {
        if (value <= 1) return false;
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) return false;
        }
        return true;
    }

    boolean isAmstrong() {
        int original = (int) value, remainder, result = 0, n = 0;
        for (original = (int) value; original != 0; original /= 10, ++n);
        original = (int) value;
        for (; original != 0; original /= 10) {
            remainder = original % 10;
            result += Math.pow(remainder, n);
        }
        return result == value;
    }

    public static void main(String[] args) {
        
                System.out.println("Prafull kumar ");
        System.out.println("MCA-C");
        Number num = new Number(153);
        System.out.println("Zero = " + num.isZero());
        System.out.println("Positive = " + num.isPositive());
        System.out.println("Negative = " + num.isNegative());
        System.out.println("Odd = " + num.isOdd());
        System.out.println("Even = " + num.isEven());
        System.out.println("Prime = " + num.isPrime());
        System.out.println("Armstrong = " + num.isAmstrong());
    }
}