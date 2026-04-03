import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int mul = 1;
        for (int i=1; i<=N; i++) {
            mul *= i;
            if (mul >= N) {
                System.out.print(i);
                break;
            }
        }
    }
}