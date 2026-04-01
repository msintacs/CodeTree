import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String parts[] = input.split("-");

        System.out.print(parts[2] + "." + parts[0] + "." + parts[1]);
    }
}