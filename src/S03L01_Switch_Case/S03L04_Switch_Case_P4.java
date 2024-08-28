package S03L01_Switch_Case;

public class S03L04_Switch_Case_P4 {
    public static void main(String[] args) {

//      Ques - condition
        //if xis 1
        //if x is 3
        //if x is othere then 1, 2, 4



        String name  =  "author";

        switch (name.toLowerCase()) {
            case "editor" -> System.out.println("editor");
            case "author" -> System.out.println("nikhil");
            case "team" -> System.out.println("raghu");

            default -> System.out.println("X is  other then a, b, c");


        }
    }
}
