import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1 = br.readLine();
        String str2 = br.readLine();

        String sRes1 = str1 + str2;
        String sRes2 = str2 + str1;

        if (sRes1.equals(sRes2)) {
            System.out.print("true");            
        } else {
            System.out.print("false");
        }
    }
}