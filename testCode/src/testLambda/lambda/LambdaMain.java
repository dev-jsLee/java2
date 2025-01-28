package testLambda.lambda;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaMain {

	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("run");
		};
		r.run();
		r.run();
		r.run();
		r.run();
		System.out.println("==================");
		Function<String, Integer> f = howLong();
		int length = f.apply("asdddd");
		System.out.println(length);

	}

	public static BiFunction<Integer, Integer, Integer> add() {
		// 람다식을 리턴
		return (x, y) -> x + y;
	}

	public static Function<String, Integer> howLong() {
		return s -> s.length();
	}

}
