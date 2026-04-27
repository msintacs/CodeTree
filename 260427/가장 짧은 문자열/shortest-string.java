import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();

        int a = Math.max(str1.length(), Math.max(str2.length(), str3.length()));
        int b = Math.min(str1.length(), Math.min(str2.length(), str3.length()));

        System.out.print(a - b);
    }
}