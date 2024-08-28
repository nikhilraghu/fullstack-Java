package S03L01_Switch_Case;

public class S03L03_Switch_Case_P3 {
    public static void main(String[] args) {

//      Ques - condition
        //if xis 1
        //if x is 3
        //if x is othere then 1, 2, 4


//        int x = 'C';
//
//        switch (Character.toLowerCase(x)) {
//            case 'a':
//                System.out.println("X is a");
//                break;
//            case 'b':
//                System.out.println("X is b");
//                break;
//            case 'c':
//                System.out.println("X is c");
//                break;
//            default:
//                System.out.println("X is  other then a, b, c");


//        String x = "C";
//
//        switch (x.toLowerCase()) {
//            case "a":
//                System.out.println("X is a");
//                break;
//            case "b":
//                System.out.println("X is b");
//                break;
//            case "c":
//                System.out.println("X is c");
//                break;
//            default:
//                System.out.println("X is  other then a, b, c");
//


        int x = 'C';

        switch (Character.toLowerCase(x)) {
            case 'a' -> System.out.println("X is a");
            case 'b' -> System.out.println("X is b");
            case 'c' -> System.out.println("X is c");

            default -> System.out.println("X is  other then a, b, c");


        }
    }
}
