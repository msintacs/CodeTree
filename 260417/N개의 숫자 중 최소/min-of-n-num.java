import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int min = Integer.MAX_VALUE;
        for (int i=0; i<N; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (min > n)
                min = n;

            arr[i] = n;
        }

        int cnt = 0;
        for (int i=0; i<arr.length; i++) {
            if (min == arr[i]) cnt++;
        }

        System.out.print(min + " " + cnt);
    }
}