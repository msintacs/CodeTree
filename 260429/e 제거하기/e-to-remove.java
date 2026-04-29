import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        boolean isDeleted = false;
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {
            if (!isDeleted && 'e' == str.charAt(i)) {
                isDeleted = true;
                continue;
            } else {
                sb.append(str.charAt(i));
            }
        }

        System.out.print(sb);
    }
}