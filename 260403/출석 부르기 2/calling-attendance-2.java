import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num > 4) {
                System.out.println("Vacancy");
                break;
            }
                
            if (num == 1) 
                System.out.println("John");
            else if (num == 2)
                System.out.println("Tom");
            else if (num == 3)
                System.out.println("Paul");
            else if (num == 4)
                System.out.println("Sam");
        }
    }
}