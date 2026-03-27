import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = -1;
        while (num != 0) {
            num = Integer.parseInt(br.readLine());
            if (num != 0)
                sb.append(num).append("\n");
        }

        System.out.println(sb);
    }
}