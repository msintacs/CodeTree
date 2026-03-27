import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int multiple3 = 0;
        int multiple5 = 0;
        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 3 == 0) {
                multiple3++;
            }

            if (n % 5 == 0) {
                multiple5++;
            }
        }

        System.out.println(multiple3 + " " + multiple5);
    }
}