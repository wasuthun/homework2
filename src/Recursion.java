import java.util.ArrayList;
import java.util.List;
/**
 * Have method to do a homework2
 * @author wasuthun wanaphongthipakorn
 *
 */
public class Recursion {
	private static ArrayList<Long> cached = new ArrayList<>();
/**
 * Use to remove duplicate element in list by recursion
 * @param list
 * @return result of not duplicate element list
 */
	public static List<Integer> unique(List<Integer> list) {
		if (list.isEmpty())
			return null;
		if (list.size() == 1)
			return list;
		if (list.get(0) == list.get(1)) {
			list.remove(0);
			unique(list);
		} else {
			unique(list.subList(1, list.size()));
		}
		return list;
	}
/**
 * Fast fibbonacci by use memorization and recursive
 * @param n
 * @return result of fibbonacci
 */
	public static long fibonacci(int n) {
		long v;
		if (n < cached.size())
			return cached.get(n);
		if (n == 0 || n == 1)
			v = n;
		else {
			long fib1 = fibonacci(n - 1);
			long fib2 = fibonacci(n - 2);
			v = fib1 + fib2;
		}
		if (cached.size() == n)
			cached.add(v);
		return v;
	}
	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(3);
		list.add(3);
		list.add(3);
		System.out.println(unique(list));

		System.out.println(fibonacci(92));
	}
}
