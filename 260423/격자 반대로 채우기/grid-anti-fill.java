import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int cnt = 1;
        boolean isUp = true;
        int[][] arr = new int[N][N];

        for (int j=N-1; j>=0; j--) {

            if (isUp) {
                for (int i=N-1; i>=0; i--)  {
                    arr[i][j] = cnt++;
                }
            } else {
                for (int i=0; i<N; i++) {
                    arr[i][j] = cnt++;
                }
            }

            isUp = !isUp;
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}