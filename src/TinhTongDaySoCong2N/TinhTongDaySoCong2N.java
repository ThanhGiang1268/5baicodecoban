package TinhTongDaySoCong2N;

import java.util.Scanner;

// Tính tổng S = (2 + 3 + 4... + n) + 2n
public class TinhTongDaySoCong2N {

	private static int n,x;
	private static int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("hay nhap vao so n");
			n = sc.nextInt();
		} while (n <= 0);

		for (int i = 2; i <= n; i++) {
			sum += i ;
			x = sum + 2*n;
		}
		System.out.println("tong cua day so la " + x);
		sc.close();
	}

}
