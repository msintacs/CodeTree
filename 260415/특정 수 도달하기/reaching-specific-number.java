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
        while (true) {
            int value = 0;
            if (st.hasMoreTokens())
                value = Integer.parseInt(st.nextToken());
            else
                break;

            if (value >= 250) break;

            sum += value;
            cnt++;
        }

        System.out.printf("%d %.1f", sum, (double) sum / cnt);
    }
}