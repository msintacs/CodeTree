import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int coinCnt = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][N];

        for (int i=0; i<coinCnt; i++) {
            st = new StringTokenizer(br.readLine());

            int idxI = Integer.parseInt(st.nextToken()) - 1;
            int idxJ = Integer.parseInt(st.nextToken()) - 1;

            arr[idxI][idxJ] = 1;
        }

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }
}