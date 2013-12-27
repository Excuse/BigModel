package model;

public class KL7 extends AKL6 implements I5 {

	public int f1(int a, int b) {
		return a + b;
	}

	public int f2(int a, int b) {
		return a - b;
	}

	public int f5(int a, int b) {
		return a % b;
	}
	
	public double f6(int i) {
		return i >= 0 ? i : -i;
	}
	
	public int f7(int i) {
		return i;
	}
}
