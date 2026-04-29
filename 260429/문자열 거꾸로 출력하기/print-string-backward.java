import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        while (true) {
            StringBuilder sb = new StringBuilder(br.readLine());

            if ("END".equals(sb.toString()))
                break;

            System.out.println(sb.reverse());
        }
    }
}