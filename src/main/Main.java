package main;

import model.*;

public class Main {
	public static void main(String[] args) {
		KL7 k = new KL7();
		
		I1 i1 = (I1) k;
		System.out.println(i1.f1(10, 3));
		
		I5 i5 = (I5) i1;
		System.out.println(i5.f5(4, 3));

		AKL6 akl6 = (KL7) i1;
		System.out.println(akl6.f3(10, 3));
		System.out.println(akl6.f6(-1));
		
		System.out.println(k.f7(19));
	}
}