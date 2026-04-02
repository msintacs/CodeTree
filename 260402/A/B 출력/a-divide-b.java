import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        sb.append(A / B).append(".");

        int cnt = 0;
        int rem = A % B;
        while (cnt <= 19) {
            rem = rem * 10;
            sb.append(rem / B);
            rem = rem % B;
            cnt++;
        }

        System.out.println(sb);
    }
}