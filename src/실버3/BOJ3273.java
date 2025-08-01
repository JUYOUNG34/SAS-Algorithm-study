package 실버3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int A[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(A);
        int X = Integer.parseInt(br.readLine());
        int s = 0;
        int e = N - 1;
        int count = 0;
        while(s < e){
            if(A[s] + A[e] == X){
                count++;
                e--;
            } else if(A[s] + A[e] < X){
                s++;
            } else{
                e--;
            }
        }

    }
}
