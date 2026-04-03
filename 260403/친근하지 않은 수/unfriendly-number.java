import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i=0; i<=N; i++) {
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0)
                continue;

            cnt++;
        }

        System.out.print(cnt);
    }
}