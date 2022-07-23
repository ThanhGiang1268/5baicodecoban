package TinhTongChanLeTrongDoanAB;

import java.util.Scanner;

public class TinhTongChanLeTrongDoanAB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		int sum = 0;
		do {
			System.out.println("hay nhap vao so a");
			a = sc.nextInt();
			System.out.println("hay nhap vao so b");
			b = sc.nextInt();
		} while (a > b);
		
		if(a%2 != 0) {
			a++;
		}
		for (int i = a; i<=b ; i+=2) {
			sum += i;
		}
		
		System.out.println("ket qua so chan trong doan [a;b] la: " + sum );
	}
}
