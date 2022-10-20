public class Exo2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c;
        int sum = 0;
        while (a <= 4000000) {
            if (a % 2 == 0) {
                sum += a;
            }
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(sum);
    }
}