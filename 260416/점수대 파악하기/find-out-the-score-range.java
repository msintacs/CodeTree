import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] count = new int[11];
        while (true) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) break;

            count[n / 10]++;            
        }

        for (int i=count.length - 1; i>0; i--) {
            System.out.println((i* 10) + " - " + count[i]);
        }
    }
}