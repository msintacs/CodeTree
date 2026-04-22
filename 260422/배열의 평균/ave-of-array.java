import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int[][] arr = new int[2][4];

        for (int i=0; i<2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j=0; j<4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        double colSum = 0;
        double rowSum = 0;
        double allSum = 0;        
        for (int i=0; i<arr.length; i++) {

            colSum = 0;    
            for (int j=0; j<arr[0].length; j++) {
                colSum += arr[i][j];                
            }
            allSum += colSum;
            System.out.printf("%.1f ", colSum / 4);
        }

        System.out.println();

        for (int i=0; i<4; i++) {
            rowSum = arr[0][i] + arr[1][i];
            System.out.printf("%.1f ", rowSum / 2);
        }

        System.out.println();
        System.out.println(allSum / (2 * 4));
    }
}