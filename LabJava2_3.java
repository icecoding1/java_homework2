import java.util.ArrayList;

public class LabJava2_3 {

    public static void main(String[] args) {
        int [] number  = {1,2,3,4,5,6,7,8,9,10,11,12};
        for(int i = 1; i < number.length; i++) {
            System.out.println();
            System.out.print( i + "|");
            for(int j = 1; j <= 12; j++) {
                int result = i * j;
                System.out.print( " " + i + "x" + j + "=" + result);
            }
        }
        
    }
    
}
