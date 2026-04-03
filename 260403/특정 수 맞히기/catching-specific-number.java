import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int input = Integer.parseInt(br.readLine());

            if (input > 25) {
                System.out.println("Lower");
            } else if (input < 25) {
                System.out.println("Higher");
            } else {
                System.out.println("Good");
                break;
            }
        }
    } 
}