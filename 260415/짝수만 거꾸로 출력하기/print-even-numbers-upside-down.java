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
        int cnt = 0;
        for (int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());            
            if (n % 2 == 0) {
                arr[cnt++] = n;                
            }                
        }

        for (int i=cnt-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}