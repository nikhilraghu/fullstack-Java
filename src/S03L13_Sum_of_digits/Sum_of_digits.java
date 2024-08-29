package S03L13_Sum_of_digits;
import java.util.Scanner;

public class Sum_of_digits {
    public static void main(String[] args) {

//        int x = 1234; // 1+ 2 + 3 + 4
//        int sumOfDigits = 0;
//
//      while(true) {
//          sumOfDigits = sumOfDigits + ( x % 10);
//          x = x/10;
//          if( x < 1){
//              break;
//          }
//      }
//        System.out.println("sum is : " + sumOfDigits);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = sc.nextInt();
        int sum=0;
        num = Math.abs(num);
        while (num!=0){
            int  Numsum = num%10;
            sum = sum+Numsum;
            num = num/10;
        }
        System.out.println(sum);
    }

}
