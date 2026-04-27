import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int endIdx = 0;

        if (str.length() >= N) {
            endIdx = N;    
        } else {
            endIdx = str.length();
        }

        for (int i=0; i<endIdx; i++) {
            System.out.print(str.charAt(str.length() - 1 - i));
        }
    }
}