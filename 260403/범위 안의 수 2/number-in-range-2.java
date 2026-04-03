import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int cnt = 0;
        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(br.readLine());

            if (n > 0 && n <= 200) {
                sum += n;
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sum, (double) sum / cnt);
    }
}