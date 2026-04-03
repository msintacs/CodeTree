import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean flag = true;
        for (int i=0; i<5; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n % 3 != 0) {
                flag = false;
                break;
            }
        }

        if (flag)
            System.out.print(1);
        else
            System.out.print(0);
    }
}