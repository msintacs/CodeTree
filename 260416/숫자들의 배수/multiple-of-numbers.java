import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = N;
        int cnt = 0;
        while (true) {
            System.out.print(sum + " ");
            if (sum % 5 == 0) {
                cnt++;
                if (cnt == 2) break;                
            }
            sum += N;            
        }

    }
}