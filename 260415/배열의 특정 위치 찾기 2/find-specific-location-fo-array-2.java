import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int odd = 0;
        int even = 0;
        for (int i=1; i<=10; i++) {

            int n = Integer.parseInt(st.nextToken());

            if (i % 2 == 0) {
                even += n;
            } else {
                odd += n;
            }
        }
        
        System.out.print(Math.max(odd, even) - Math.min(odd, even));
    }
}