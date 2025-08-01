package 실버4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> myStack = new Stack<>();
        for (int i = 0; i < N; i++) {
            int V = Integer.parseInt(br.readLine());
            if (V == 0) {
                myStack.pop();
            } else {
                myStack.push(V);
            }
        }

        int sum = 0;
        for (int v : myStack) {
            sum += v;
        }
        System.out.println(sum);
    }
}
