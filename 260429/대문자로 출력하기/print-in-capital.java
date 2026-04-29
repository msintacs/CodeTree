import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();
        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {                
                int nRes = str.charAt(i) - ' ';
                sb.append((char) nRes);
            } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                sb.append(str.charAt(i));
            } 
        }

        System.out.print(sb);
    }
}