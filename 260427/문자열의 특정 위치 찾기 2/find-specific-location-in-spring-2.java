import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        char target = br.readLine().charAt(0);

        int cnt = 0;
        for (String s : arr) {
            if (s.charAt(2) == target || s.charAt(3) == target) {
                System.out.println(s);
                cnt++;
            }
        }
        System.out.print(cnt);
    }
}