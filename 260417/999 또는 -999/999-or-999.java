import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (true) {
            int n = Integer.parseInt(st.nextToken());

            if (n == 999 || n == -999) break;
            
            if (n > max)
                max = n;

            if (n < min)
                min = n;            
        }

        System.out.print(max + " " + min);
    }
}