package binarysearchtree;

public class EmptyBST<T extends Comparable> implements Tree<T> {
	
	public boolean isEmpty() {
		return true;
	}
	
	public int cardinality() {
		return 0;
	}
	
	public boolean member(T elt) {
		return false;
	}
	
	public NonEmptyBST<T> add (T elt){
		 return new NonEmptyBST<T>(elt);
	}

}
