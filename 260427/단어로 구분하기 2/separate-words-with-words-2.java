import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        boolean b = true;
        while (st.hasMoreTokens()) {
            
            String tmp = st.nextToken();

            if (b) {
                System.out.println(tmp);
            }

            b = !b;
        }
    }
}