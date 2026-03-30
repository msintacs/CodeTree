import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(start).append(" ");
        while (start < end) {
            
            if (start % 2 == 0) {
                start += 3;
            } else {
                start *= 2;                
            }   

            if (start <= end )
                sb.append(start).append(" ");
        }

        System.out.println(sb);
    }
}