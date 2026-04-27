import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] arr = new String[st.countTokens()];

        int idx = 0;
        while(st.hasMoreTokens()) {
            arr[idx++] = st.nextToken();
        }

        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[arr.length - 1 - i]);
        }
    }
}