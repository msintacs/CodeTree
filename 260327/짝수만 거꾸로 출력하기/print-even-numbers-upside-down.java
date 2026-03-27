import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        Arrays.fill(arr, -1);

        for (int i=0; i<N; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp % 2 == 0) {
                arr[arr.length - 1 - i] = tmp;
            }
        }

        for (int i=0; i<arr.length; i++) {
            if (arr[i] == -1 ) continue;
            System.out.print(arr[i] + " ");
        }
    }
}