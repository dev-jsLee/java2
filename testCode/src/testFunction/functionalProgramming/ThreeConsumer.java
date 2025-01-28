package testFunction.functionalProgramming;

import java.util.ArrayList;

@FunctionalInterface
public interface ThreeConsumer<T1, T2, T3, T4> {
	public abstract ArrayList<T4> play(T1 t1, T2 t2, T3 t3);
}
