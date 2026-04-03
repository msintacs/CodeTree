import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        while (N != 1) {
            if (N % 2 == 0) {
                N /= 2;
            } else {
                N = N * 3 + 1;
            }
            cnt++;
        }

        System.out.print(cnt);
    }
}