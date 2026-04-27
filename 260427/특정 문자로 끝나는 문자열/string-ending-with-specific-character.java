import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = new String[10];

        for (int i=0; i<10; i++) {
            arr[i] = br.readLine();
        }

        char target = br.readLine().charAt(0);

        boolean isNone = true;
        for (String s : arr) {
            if (s.charAt(s.length() - 1) == target) {
                System.out.println(s);
                isNone = false;
            }
        }

        if (isNone) System.out.println("None");
    }
}