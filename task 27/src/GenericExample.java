class Pair<T, U>{
	private T first;
	private U second;
	
	public Pair(T first, U second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	
	
	public U getSecond() {
		return second;
	}
	
	public void setSecond(U second) {
		this.second = second;
	}
	
	public String toString() {
		return "(" + first + ", " + second + ")";
	}
	
	
}

class Utility{
	public static <T> void swap(Pair<T, T> pair) {
		T temp = pair.getFirst();
		pair.setFirst(pair.getSecond());
		pair.setSecond(temp);
	}
	
	public static <T extends Comparable<T>> T findMax(T a, T b, T c) {
		return (a.compareTo(b) > 0 ? (a.compareTo(c) > 0 ? a : c) : (b.compareTo(c) > 0 ? b : c));
	}
}
public class GenericExample {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair(1, "one");
		Pair<Double, Character> p2 = new Pair(1.3, "A");
		Pair<Integer, Integer> intPair = new Pair(10, 20);
		
		System.out.println("Before Swap : " + intPair);
		Utility.swap(intPair);
		
		System.out.println("After Swap : " + intPair);
		System.out.println("Max of (3, 7, 5) : " + Utility.findMax(3, 7, 5));

	}

}
