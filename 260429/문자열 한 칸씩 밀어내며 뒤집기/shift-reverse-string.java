import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        for (int i=0; i<Q; i++) {
            
            int input = Integer.parseInt(br.readLine());
            char tmp;

            switch(input) {
                case 1: 
                    tmp = sb.charAt(0);
                    sb.deleteCharAt(0);
                    sb.append(tmp);
                    System.out.println(sb);
                    break;
                case 2:
                    tmp = sb.charAt(sb.length() - 1);
                    sb.deleteCharAt(sb.length() - 1);
                    sb.insert(0, tmp);
                    System.out.println(sb);
                    break;
                case 3:
                    sb.reverse();
                    System.out.println(sb);
                    break;
                default:
                    break;
            }
        }
    }
}