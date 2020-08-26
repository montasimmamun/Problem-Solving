import java.util.Scanner;

public class farhana {

    public static void main(String[] args) {
        int n, temp;

        Scanner s = new Scanner(System.in);
        n = s.nextInt();

        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[n - 1]);

        System.out.print("\n");

        for (int i = n - 1; i > 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}