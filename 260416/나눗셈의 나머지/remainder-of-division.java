import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] count = new int[10];
        
        int dividend  = Integer.parseInt(st.nextToken());
        int divisor = Integer.parseInt(st.nextToken());

        while (dividend > 1) {
            count[dividend % divisor]++;
            dividend /= divisor;
        }

        int sum = 0;
        for (int i=0; i<count.length; i++) {
            sum += count[i] * count[i];
        }

        System.out.print(sum);
    }
}
