/**
 * Words iterates through the k-permutations (with repetition) of a set
 *  with cardinality n.
 * 
 * @author mh
 *
 */
public class Words {
	public static int size(int n, int k) { return (int) Math.pow(n, k); }
	public static int[] get(int n, int k, int i) {
		int[] r = new int[k];
		fill(r, n, k, i);
		return r;
	}
	public static void fill(int[] r, int n, int k, int i) {
		for (int j = 0; j < k; j++) {
			r[j] = i % n;
			i = (i - r[j]) / n;
		}
	}
}