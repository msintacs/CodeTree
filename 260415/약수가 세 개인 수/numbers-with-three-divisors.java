import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        int cnt = 0;
        for (int i=start; i<=end; i++) {
            
            int tmp = 0;
            for (int j=1; j<=i; j++) {
                if (i % j == 0) tmp++;
            }

            if (tmp == 3) cnt++;
        }

        System.out.println(cnt);
    }
}