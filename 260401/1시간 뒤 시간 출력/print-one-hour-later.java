import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String hm = br.readLine();
        String[] parts = hm.split(":");
        System.out.print((Integer.parseInt(parts[0]) + 1) + ":" + parts[1]);
    }
}