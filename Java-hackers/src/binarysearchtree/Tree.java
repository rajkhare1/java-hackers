package binarysearchtree;

public interface Tree<T extends Comparable> {
	public boolean isEmpty();
	public int cardinality();
	public boolean member(T elt);
	public NonEmptyBST<T> add (T elt);
}
