package binarysearchtree;

public class NonEmptyBST<T extends Comparable> implements Tree<T> {
    T data;
    Tree<T> left;
    Tree<T> right;
    
	
	public NonEmptyBST(T elt) {
		this.data = elt;
		this.left =  new EmptyBST<T>();
		this.right = new EmptyBST<T>();
	}
	
	public NonEmptyBST(T elt, Tree<T> leftTree, Tree<T> rightTree) {
		this.data = elt;
		this.left = leftTree;
		this.right = rightTree;
	}

	public boolean isEmpty() {
		return false;
	}
	
	public int cardinality() {
		return 1 + left.cardinality() + right.cardinality();
	}
	
	public boolean member(T elt) {
		if(data == elt) {
			return true;
		} else {
			if(data.compareTo(data) < 0) {
				return left.member(elt);
			}else {
				return right.member(elt);
			}
		}
	}
	
	public NonEmptyBST<T> add (T elt){
		if(data == elt) {
			return this;
		} else {
			if(elt.compareTo(data) < 0) {
				return new NonEmptyBST<T>(data, left.add(elt), right);
			} else {
			    return new NonEmptyBST<T>(data, left, right.add(elt));
			}
		}
	}

}
