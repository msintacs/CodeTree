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

        for (int i=0; i<N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++) {
            for (int j=i+1; j<arr.length; j++) {
                if (arr[j] - arr[i] < min)
                    min = arr[j] - arr[i];
            }
        }
        
        System.out.print(min);
    }
}