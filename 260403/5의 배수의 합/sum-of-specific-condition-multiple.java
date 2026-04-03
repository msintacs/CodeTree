import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if (A > B)
            System.out.print(sum(A, B));
        else
            System.out.print(sum(B, A));
    }

    public static int sum(int max, int min) {
        int sum = 0;
        for (int i=min; i<=max; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }
}