import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str);

        for (int i=0; i<str.length(); i++) {

            int start = str.length() - 1 - i;

            for (int j=0; j<str.length(); j++) {
                System.out.print(str.charAt((start + j) % str.length()));
            }

            System.out.println();
        }
    }
}