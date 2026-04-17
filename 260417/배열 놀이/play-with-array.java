import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i=0; i<Q; i++) {
            st = new StringTokenizer(br.readLine());

            int kind = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            
            if (kind == 1) {
                
                System.out.println(arr[target - 1]);

            } else if (kind == 2) {
                
                boolean isInclude = false;
                for (int j=0; j<arr.length; j++) {
                    if (arr[j] == target) {
                        isInclude = true;
                        System.out.println(j+1);
                        break;
                    }
                }

                if (!isInclude) System.out.println(0);

            } else {

                int subTarget = Integer.parseInt(st.nextToken());

                for (int j=target-1; j<subTarget; j++)
                    System.out.print(arr[j] + " ");

                System.out.println();
            }
        }
    }
} 