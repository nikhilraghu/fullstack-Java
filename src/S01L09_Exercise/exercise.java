package S01L09_Exercise;

public class exercise {
    public static void main(String[] args) {
        // (a+b)^2 = a^2 + 2ab + b^2

        int a = 2;
        float b = 3.2f;
        int value = (int)(a*a + 2*(a*b) + b*b);
        System.out.println(value);
    }
}
