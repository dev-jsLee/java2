package testLambda.lambda;

@FunctionalInterface
public interface Calc {
	public int add(int x, int y);

	default int mult(int x, int y) {
		return x * y;
	};
	
	default int minus(int x, int y) {
		return x - y;
	};
}
