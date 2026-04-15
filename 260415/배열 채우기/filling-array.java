import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        for (int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) break;
        }

        for (int i=0; i<arr.length; i++) {
            int n = arr[arr.length - 1 - i];
            if (n != 0)
                System.out.print(n + " ");
        }
    }
}