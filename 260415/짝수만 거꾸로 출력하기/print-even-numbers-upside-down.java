import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean isEmpty = true;
        for (int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0) continue;
            if (n % 2 == 0) {
                arr[i] = n;
                isEmpty = false;
            }                
        }

        if (isEmpty) {
            System.out.print(0);
            return;
        }

        for (int i=0; i<N; i++) {
            int n = arr[N - i - 1];
            if (n != 0)
                System.out.print(n + " ");
        }
    }
}