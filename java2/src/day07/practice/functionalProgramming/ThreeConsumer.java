package day07.practice.functionalProgramming;

@FunctionalInterface
public interface ThreeConsumer<T1, T2, T3> {
	public abstract void play(T1 t1, T2 t2, T3 t3);
}
