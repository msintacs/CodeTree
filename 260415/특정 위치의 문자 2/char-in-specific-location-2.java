import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i=1; i<=10; i++) {
            String str = st.nextToken();
            if (i == 2 || i == 5 || i == 8)
                System.out.print(str + " ");
        }
    }
}