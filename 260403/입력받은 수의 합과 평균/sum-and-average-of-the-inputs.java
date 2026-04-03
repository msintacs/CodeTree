import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;        
        for (int i=0; i<N; i++) {
            String tmp = br.readLine().trim();
            sum += Integer.parseInt(tmp);
        }

        System.out.printf("%d %.1f", sum, (double) sum / N);
    }
}