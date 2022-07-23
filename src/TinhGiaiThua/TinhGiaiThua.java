package TinhGiaiThua;

import java.util.Scanner;

public class TinhGiaiThua {
	public static int Tinh(int a) {
		int x = 1;
		for (int i = 1; i <= a; i++) {
			x *= i;
		}
		return x;
		}
	
	public static void main(String[] args) {
		TinhGiaiThua tgt = new TinhGiaiThua();
		System.out.println("hay nhap vao so a");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int m = tgt.Tinh(a);
	
		System.out.println(" ket qua cua giai thua la " + m);
		sc.close();
	}
}
