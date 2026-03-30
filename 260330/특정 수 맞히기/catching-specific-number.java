import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int target = 25;
        while (true) {
            int input = Integer.parseInt(br.readLine());
            if (target < input) {
                System.out.println("Lower");
            } else if (target > input) {
                System.out.println("Higher");
            } else {
                System.out.println("Good");
                break;
            }
        }
    }
}