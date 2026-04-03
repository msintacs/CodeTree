import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = 0;
        while (true) {
            
            if (cnt >= 3)
                break;

            int n = Integer.parseInt(br.readLine());

            if (n % 2 == 1)
                continue;

            System.out.println(n / 2);
            cnt++;
        }
    }
}