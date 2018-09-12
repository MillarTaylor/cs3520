import java.util.Random;

public class MyUnicode {
    static Random r = new Random();

    public static void main(String[] args){
        r.setSeed(1776);
        int size =10;
        char[][] a = new char[size][size];

       // Random r = new Random();
        r.setSeed(1776);
        
        
for(int i=0;i<10;i++)
    for(int n=0;n<10;n++){

    a[i][n]=getRandomChar('\u0020','\u007E','\u00A0','\u00FF');

    }


        for(int i=0;i<10;i++) {
            for (int n = 0; n < 10; n++) {

                System.out.print(String.valueOf(a[i][n]) + " ");

            }
        System.out.print("\n");
}
System.out.println("Printing [4][5]" + a[4][5]);

    }

    public static char getRandomChar(char ch1, char ch2, char ch3,char ch4){
        Random oneortwo= new Random();

if((oneortwo.nextInt(1) + 1) == 1){

//System.out.println(x);
   return (char)(Character.getNumericValue(ch1)+r.nextInt(ch2-ch1)*(Character.getNumericValue(ch2)-Character.getNumericValue(ch1)+1));
}else{


    return (char)(Character.getNumericValue(ch3)+r.nextInt(ch4-ch3)*(Character.getNumericValue(ch4)-Character.getNumericValue(ch3)+1));
}
    }


}
