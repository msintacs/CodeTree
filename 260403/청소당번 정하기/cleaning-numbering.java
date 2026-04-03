import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt2 = 0;
        int cnt3 = 0;
        int cnt12 = 0;

        for (int i=1; i<=n; i++) {
            if (i % 12 == 0)  {
                cnt12++;
            } else if (i % 3 == 0) {
                cnt3++;
            } else if (i % 2 == 0) {
                cnt2++;
            }
        }

        System.out.print(cnt2 + " " + cnt3 + " " + cnt12);
    }
}