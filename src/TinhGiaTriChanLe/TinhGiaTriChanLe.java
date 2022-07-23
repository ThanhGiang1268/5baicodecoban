package TinhGiaTriChanLe;

import java.util.Scanner;
// Tính giá trị S = 1 - 2 + 3 - ... + (3n + 1)
public class TinhGiaTriChanLe {

	public int Tinh(int n) {
		
		int sum = 0,a = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0)
				sum -= i;
			else
				sum += i;
			
			a = sum + (3*n+1);
		}
		return a;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TinhGiaTriChanLe tgtcl = new TinhGiaTriChanLe();
		int n = sc.nextInt();
		int x = tgtcl.Tinh(n);
		System.out.println("gia tri phep tinh la " + x);
		sc.close();
	}
}
