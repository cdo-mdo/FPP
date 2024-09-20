package lab10.assignment_10_2;

public class Rational {
	private int p;
	private int q;

	public int getP() {
		return p;
	}

	public int getQ() {
		return q;
	}

	public Rational(int p, int q) {
		if (q <= 0) {
			System.out.println("Error not accept " + q + " in rational number");
			return;
		}
		this.p = p;
		this.q = q;
	}

	// adds the rational rat to this Rational
	public Rational add(Rational rat) {
		int newP = this.p * rat.getQ() + rat.getP() * this.q;
		int newQ = this.q * rat.getQ();

		return new Rational(newP, newQ);
	}

	// multiplies rat by this Rational
	public Rational multiply(Rational rat) {
		int newP = this.p * rat.p;
		int newQ = this.q * rat.q;

		return new Rational(newP, newQ);
	}

	// returns -1 if this rational is less than rat
	// returns 0 if this rational equals (see equals method discussion below) rat
	// returns 1 if this rational is greater than rat
	public int compareTo(Rational rat) {
		return (this.p * rat.q - rat.p * this.q);
	}

	public boolean equals(Rational rat) {
		return this.p * rat.q == this.q * rat.p ? true : false;
	}

	@Override
	public int hashCode() {
		long longNum = Double.doubleToLongBits(this.p / this.q);
		return (int) Math.pow(longNum, longNum >>> 32);
	}

	@Override
	public String toString() {
		return this.p + "/" + this.q;
	}

	public static void main(String[] args) {

		Rational rational1_1 = new Rational(2, 3);
		Rational rational1_2 = new Rational(-17, 5);
		Rational rational1_3 = new Rational(1, 3);

		Rational rational1_4 = rational1_1.multiply(rational1_2);
		Rational rational1_5 = rational1_4.add(rational1_3);

		Rational rational1_6 = rational1_2.add(rational1_3);
		Rational rational1_7 = rational1_1.multiply(rational1_6);

		System.out.println("Compare");
		System.out.println("(" + rational1_1.toString() + " * " + rational1_2.toString() + ")" + " + "
				+ rational1_3.toString() + " = " + rational1_5.toString());
		System.out.println("and");
		System.out.println(rational1_1.toString() + " * (" + rational1_2.toString() + " + " + rational1_3.toString()
				+ ") = " + rational1_7.toString());

		boolean res = rational1_5.compareTo(rational1_7) > 0 ? true : false;
		System.out.println("result = " + res);

	}
}
