import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = br.readLine();

        int count = 0;
        for (int i=0; i<arr.length; i++) {
            char tmp1 = arr[i].charAt(2);
            char tmp2 = arr[i].charAt(3);

            if (tmp1 == input.charAt(0) || tmp2 == input.charAt(0)) {
                count++;
                sb.append(arr[i]).append("\n");
            }
        }

        System.out.print(sb);
        System.out.println(count);
    }
}