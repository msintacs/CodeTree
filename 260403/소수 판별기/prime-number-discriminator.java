import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i=1; i<=N; i++) {
            if (N % i == 0)
                cnt++;
        }

        if (cnt == 2) {
            System.out.print("P");
        } else {
            System.out.print("C");
        }
    }
}