package testFunction.functionalProgramming;

import java.util.ArrayList;
import java.util.function.Function;

public class FuncMain {

	public static void main(String[] args) {
		ThreeConsumer<Integer, Integer, Function<Integer, Integer>, Integer> printer = (start, end, ifTrue) -> {
			ArrayList<Integer> result = new ArrayList<Integer>();
			for (int i = start; i <= end; i++) {
				Integer r = ifTrue.apply(i);
				if(!r.equals(null)) {
					result.add(i);
				}
			}
			return result;
		};
		printer.play(Integer.valueOf(1), Integer.valueOf(100), (Integer i) -> {
			if (i % 2 == 0) {
				System.out.println(i);
			}
			return null;
		});

	}

}
