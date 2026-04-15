import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        double avr = 0.0;
        int cnt = 0;
        for (int i=1; i<=10; i++) {
            int n = Integer.parseInt(st.nextToken());

            if (i % 2 == 0)
                sum += n;

            if (i % 3 == 0) {
                avr += n;
                cnt++;
            }
        }

        System.out.printf("%d %.1f", sum, avr / cnt);
    }
}