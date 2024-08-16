import java.util.*;

public class PalindromicBinary {
    static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Maximum number of bits
        int K = sc.nextInt(); // Divisor

        System.out.println(countPalindromicBinary(N , K));
    }

    public static int countPalindromicBinary(int N, int K) {
        Set<Long> palindromicNumbers = generatePalindromicNumbers(N);
        int count = 0;

        for (long num : palindromicNumbers) {
            if (num % K == 0) {
                count = (count + 1) % MOD;
            }
        }

        return count;
    }

    // Function to generate all palindromic binary numbers with up to N bits
    public static Set<Long> generatePalindromicNumbers(int N) {
        Set<Long> palindromicNumbers = new HashSet<>();

        // Generate palindromic numbers with 1 to N bits
        for (int len = 1; len <= N; len++) {
            generatePalindromesOfLength(len, palindromicNumbers);
        }

        return palindromicNumbers;
    }

    // Helper function to generate palindromic numbers of a specific bit length
    public static void generatePalindromesOfLength(int len, Set<Long> palindromicNumbers) {
        int halfLen = (len + 1) / 2;

        // Generate all binary numbers of length halfLen
        for (int i = 0; i < (1 << halfLen); i++) {
            StringBuilder sb = new StringBuilder();

            // Convert the number to binary
            for (int j = halfLen - 1; j >= 0; j--) {
                sb.append(((i >> j) & 1) == 1 ? '1' : '0');
            }

            // Create the palindromic number
            String firstHalf = sb.toString();
            String secondHalf = new StringBuilder(firstHalf).reverse().substring(len % 2);
            String palindromicBinary = firstHalf + secondHalf;

            // Convert the binary string to a number
            long num = Long.parseLong(palindromicBinary, 2);
            palindromicNumbers.add(num);
        }
    }
}
