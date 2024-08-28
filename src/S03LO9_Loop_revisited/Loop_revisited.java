package S03LO9_Loop_revisited;

public class Loop_revisited {
    public static void main(String[] args) {

//        for (int i = 0, j = 0; (i < 10) && (j < 10) ; i++, j++){
//            System.out.println(i +">>"+ j);
//        }



        int i = 0, j = 0 ;
        while (i<10 && j<10){
            System.out.println(i +">"+ j);
            i++;
            j++;
        }



    }
}
