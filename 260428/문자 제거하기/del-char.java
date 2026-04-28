import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();

        int idx = str.length();
        while (idx > 1) {
            
            idx--;

            int target = Integer.parseInt(br.readLine());

            if (idx < target) {
                target = str.length() - 1;
            }

            str = str.substring(0, target) + str.substring(target + 1);
            System.out.println(str);
            
        }
    }
}