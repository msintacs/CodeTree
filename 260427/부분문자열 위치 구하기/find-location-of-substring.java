import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String target = br.readLine();

        if (str.contains(target)) {

            System.out.print(str.indexOf(target.charAt(0)));

        } else {
            System.out.print(-1);
        }
    }
}