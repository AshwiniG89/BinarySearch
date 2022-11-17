import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            checkForIcecream(a, n, k);
            i++;
        }
    }

    public static void checkForIcecream(int[] a, int n, int k) {
        int start = 0;
        int end = n - 1;
        while (start <end) {
            if (a[start] + a[end] == k) {
                start = start + 1;
                end = end + 1;
                System.out.print(start + " " + end);

            } else if ((a[start] + a[end]) > k) end--;
            else start++;
        }
    }
}