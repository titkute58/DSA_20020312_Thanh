package Week_12;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Connected_Cells_new {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[][] = new int [n+2][m+2];
        for(int i=1;i<=n;i++)
            for(int j=1;j<=m;j++) {
                a[i][j]= sc.nextInt();
            }

        System.out.println(LargestArea(a,n,m));
    }

    private static int LargestArea(int[][] a,int n, int m) {
        int count = 1;
        boolean v[][] = new boolean[n + 2][m + 2];
        Queue<Integer> q = new LinkedList<>();
        int x[] = {-1, 0, 1, 1, -1, -1, 1, 0, 0};
        int y[] = {-1, 0, 0, -1, 0, 1, 0, 1, -1};
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (a[i][j] == 1 && !v[i][j]) {
                    q.add(i * 10 + j);
                    v[i][j] = true;
                    int ans = 1;
                    while (!q.isEmpty()) {
                        int index = q.remove();
                        int i1 = index / 10;
                        int j1 = index % 10;
                        for (int ii = 0; ii < 9; ii++)
                            if (i1 + x[ii] >= 0 && i1 + x[ii] <= n && j1 + y[ii] <= m && j1 + y[ii] >= 0 && a[i1 + x[ii]][j1 + y[ii]] == 1 && !v[i1 + x[ii]][j1 + y[ii]]) {
                                q.add((i1 + x[ii]) * 10 + j1 + y[ii]);
                                v[i1 + x[ii]][j1 + y[ii]] = true;
                                ans++;
                            }

                    }
                    if (ans>count) count = ans;
                }
            }
        }

        return count;
    }
}