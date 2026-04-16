import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (true) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n + 3;
            }

            System.out.print(n + " ");
        }
    }
}