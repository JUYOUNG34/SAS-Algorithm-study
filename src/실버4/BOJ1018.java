package 실버4;

import java.util.Scanner;

class BOJ1018 {
    public static int getSolution(int startRow, int startCol, String[] board) {
        String[] orgBoard = { "WBWBWBWB", "BWBWBWBW" };
        int whiteSol = 0;
        for (int i = 0; i < 8; i++) {
            int row = startRow + i;
            for (int j = 0; j < 8; j++) {
                int col = startCol + j;
                if (board[row].charAt(col) != orgBoard[row % 2].charAt(j)) whiteSol++;
            }
        }

        return Math.min(whiteSol, 64 - whiteSol);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        sc.nextLine();

        String[] board = new String[row];
        for (int i = 0; i < row; i++) board[i] = sc.nextLine();

        int sol = Integer.MAX_VALUE;
        for (int i = 0; i <= row - 8; i++) {
            for (int j = 0; j <= col - 8; j++) {
                //  현 체스판의 최소 비용 구하기
                int curSol = getSolution(i, j, board);
                // 전체 최적의 값과 비교하여 갱신하기
                if (sol > curSol) sol = curSol;
            }
        }

        System.out.println(sol);
        sc.close();
    }
}