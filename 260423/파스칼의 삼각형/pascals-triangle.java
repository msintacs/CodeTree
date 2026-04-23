import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][N];

        for (int i=0; i<N; i++) {
            for (int j=0; j<i+1; j++) {
                arr[i][j] = 1;
            }            
        }

        for (int i=2; i<N; i++) {
            for (int j=1; j<i; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
            }
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                if (arr[i][j] == 0) continue;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}