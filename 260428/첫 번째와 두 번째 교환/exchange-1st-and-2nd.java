import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char first = str.charAt(0);
        char second = str.charAt(1);

        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == first)
                sb.append(second);
            else if (c == second)
                sb.append(first);
            else
                sb.append(c);
        }

        System.out.print(sb.toString());
    }
}