import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];

        int idx = 0;
        for (int i=0; i<10; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n == 0)  {
                idx = i;
                break;
            }
            arr[i] = n;
        }

        System.out.print(arr[idx-1] + arr[idx-2] + arr[idx-3]);
    }
}