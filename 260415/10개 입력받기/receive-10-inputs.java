import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        int cnt = 0;
        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;
            sum += n;
            cnt++;
        }

        System.out.printf("%d %.1f", sum, (double)sum / cnt);
    }
}