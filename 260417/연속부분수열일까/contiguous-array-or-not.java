import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N1 = Integer.parseInt(st.nextToken());
        int N2 = Integer.parseInt(st.nextToken());

        int[] A = new int[N1];
        int[] B = new int[N2];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N1; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N2; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = B.length;
        boolean isConsecutive = true;
        while (end <= A.length) {

            isConsecutive = true;

            int idx = 0;
            for (int i=start; i<end; i++) {
                if (A[i] != B[idx]) {                    
                    isConsecutive = false;
                    break;
                }

                idx++;
            }

            if (isConsecutive) {
                System.out.print("Yes");
                break;
            }

            start++;
            end++;            
        }

        if (!isConsecutive) System.out.print("No");
    }
}