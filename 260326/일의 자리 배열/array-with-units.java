import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[10];
        for (int i=0; i<2; i++) {
            arr[i] = Integer.parseInt(st.nextToken());            
        }

        for (int i=1; i<9; i++) {
            int result = arr[i-1] + arr[i];
            arr[i+1] = result % 10;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}