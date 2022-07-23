package TinhTongDaySoPhanSo;

import java.util.Scanner;
// Viết chương trình tìm S biết:
// S = 1+1/2+1/3+...+1/n


public class TinhTongDaySoPhanSo {
	public static int a;

	public double TinhTongDaySo(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += (double) 1 / i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TinhTongDaySoPhanSo ttdsps = new TinhTongDaySoPhanSo();
		int n = sc.nextInt();
		double x = ttdsps.TinhTongDaySo(n);
		System.out.println("tong cua day so can tim la " + x);
		sc.close();
	}

}
