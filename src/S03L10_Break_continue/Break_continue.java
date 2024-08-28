package S03L10_Break_continue;

public class Break_continue {
    public static void main(String[] args) {

//        for (int i = 0; i < 10 ; i++){
//            System.out.println(i);
//            if (i == 5) {
//                break;
//            }
//        }



        for (int i = 0; i < 10 ; i++){
            System.out.println("before continue");
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }


//whenever we are  executing continue statement all statment after continue  will not get executed, but the statements before continue will execute.


    }
}

