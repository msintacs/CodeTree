import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        for (int i=0; i<19; i++) {
            for (int j=0; j<19; j++) {
                System.out.print((i+1) + " * " + (j+1) + " = " + ((i+1) * (j+1)));
                if ((j+1) % 2 == 0) {
                    System.out.println();
                } else {
                    if (j < 18)
                        System.out.print(" / ");
                }                
            }
            System.out.println();
        }
    }
}