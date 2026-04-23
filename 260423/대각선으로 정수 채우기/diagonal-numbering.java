import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];
        int K = (N - 1) + (M - 1);

        int count = 1;
        for (int k=0; k<=K; k++) {
            int i, j;

            if (k < M) {
                i = 0;
                j = k;
            } else {
                i = k - (M - 1);
                j = M - 1;
            }

            while (i < N && j >= 0) {
                arr[i][j] = count++;
                i++;
                j--;
            }
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}