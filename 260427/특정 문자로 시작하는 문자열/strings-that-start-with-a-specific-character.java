import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];
        for (int i=0; i<N; i++)
            arr[i] = br.readLine();
        
        char target = br.readLine().charAt(0);

        double sum = 0;
        int cnt = 0;
        for (String s : arr) {
            if (s.charAt(0) == target) {
                cnt++;
                sum += s.length();
            }
        }

        System.out.printf("%d %.2f", cnt, sum / cnt);
        
    }
}