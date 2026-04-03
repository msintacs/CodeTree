import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String C = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        if ("A".equals(C)) {
            for (int i=1; i<=N; i++) {
                System.out.print(i  + " ");
            }
        } else {
            for (int i=N; i>=1; i--) {
                System.out.print(i  + " ");
            }
        }
    }
}