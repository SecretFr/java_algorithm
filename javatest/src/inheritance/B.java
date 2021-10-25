package inheritance;

public class B extends A {
	private int m;

	public void setM(int m) {
		this.m = m;
	}

	public int getM() {
		return m;
	}

	public String toString() {
		String s = getN() + " " + getM();
		return s;
	}
}
