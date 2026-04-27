import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = new String[4];

        for (int i=0; i<4; i++) {
            arr[i] = br.readLine();
        }

        for (int i=0; i<4; i++) {
            System.out.println(arr[3-i]);
        }
    }
}