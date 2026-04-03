import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i=1; i<=N; i++) {
            if (i % 3 == 0) {
                System.out.print(0 + " ");
                continue;
            }

            if (String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9")) {
                System.out.print(0 + " ");
                continue;
            }

            System.out.print(i + " ");
        }
    }
}