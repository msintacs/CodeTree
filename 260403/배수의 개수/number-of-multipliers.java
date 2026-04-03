import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt3 = 0;
        int cnt5 = 0;
        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 3 == 0)
                cnt3++;

            if (n % 5 == 0)
                cnt5++;
        }

        System.out.print(cnt3 + " " + cnt5);
    }
}