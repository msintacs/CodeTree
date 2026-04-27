import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        String str = br.readLine();
        char target = br.readLine().charAt(0);

        for (char c : str.toCharArray()) {
            if (c == target) cnt++;
        }

        System.out.print(cnt);
    }
}