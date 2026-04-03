import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        int cnt = 0;
        while (cnt++ < N) {
            if (cnt % a == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}