import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = 0;
        int cnt = 0;
        while (true) {
            int n = Integer.parseInt(br.readLine());

            if (n >= 30 || n < 20)
                break;

            sum += n;
            cnt++;
        }


        System.out.printf("%.2f", (double) sum / cnt);
    }
}