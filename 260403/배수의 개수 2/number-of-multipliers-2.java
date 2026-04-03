import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int cnt = 0;
        for (int i=0; i<10; i++) {
            if (Integer.parseInt(br.readLine()) % 2 == 1)
                cnt++;
        }

        System.out.print(cnt);
    }
}