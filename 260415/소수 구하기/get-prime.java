import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for (int i=1; i<=N; i++) {
            int cnt = 0;
            for (int j=1; j<=i; j++) {
                if (i % j == 0) cnt++;
            }
            if (cnt == 2) list.add(i);
        }
        
        Collections.sort(list);

        for (int n : list)
            System.out.print(n + " ");
    }
}