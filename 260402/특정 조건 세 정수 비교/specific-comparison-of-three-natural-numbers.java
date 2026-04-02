import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int min = 101;
        int[] arr = new int[3];
        boolean isSame = true;
        for (int i=0; i<3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (min > arr[i])
                min = arr[i];

            if (i != 0 && min != arr[i])
                isSame = false;
        }
        
        if (min == arr[0] && isSame) 
            System.out.print(1 + " " + 1);
        else if (min == arr[0] && !isSame)
            System.out.print(1 + " " + 0);
        else 
            System.out.print(0 + " " + 0);
        
    }
}
