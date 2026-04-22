import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];        
        for (int i=0; i<N; i++) arr[i] = Integer.parseInt(st.nextToken());
        
        int end = N;        
        while (end != 0) {

            int max = Integer.MIN_VALUE;            
            for (int i=0; i<end; i++) {
                if (max < arr[i])
                    max = arr[i];
            }

            int idx = -1;
            for (int i=0; i<end; i++) {
                if (max == arr[i]) {
                    idx = i;
                    break;
                }
            }

            end = idx;
            System.out.print((end + 1) + " ");
        }
    }
}