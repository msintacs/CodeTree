import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int i;
        int[] arr = new int[10];
        for (i=0; i<10; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n % 3 == 0)
                break;

            arr[i] = n;
        }

        System.out.print(arr[i-1]);
    }
}