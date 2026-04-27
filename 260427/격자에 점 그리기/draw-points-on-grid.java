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

        int cnt = 1; 
        int[][] arr = new int[N][N];
        for (int i=0; i<M; i++) {
            st = new StringTokenizer(br.readLine());

            int idxA = Integer.parseInt(st.nextToken()) - 1;
            int idxB = Integer.parseInt(st.nextToken()) - 1;

            arr[idxA][idxB] = cnt++;
        }

        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(arr[i][j]  + " ");                
            }
            System.out.println();
        }
    }
}