package nz.vuw.ac.mapleyhayl.ArrayList;

import java.util.*;

public class ArrayList<E> implements List<E> {

	private E[] data;
	private int size;

	public ArrayList() {
		//		@SuppressWarnings("unchecked")
		data = (E[]) new Object[10];
	}

	public void printList() {
		for (E element : data) {
			if (element != null) {
				System.out.println(element.toString());
			}
		}
	}


	//	-------------------- CORE ------------------------

	//COMPLETE
	@Override
	public boolean add(E element) {
		if (size+1 > data.length) {
			E[] copy = (E[]) new Object[data.length*2];
			for (int i=0; i<data.length; i++) {
				copy[i] = data[i];
			}
			data = copy;
		}
		data[size++] = element;
		return false;
	}

	//COMPLETE
	@Override
	public void add(int index, E element) {
		for (int i=data.length-1; i>index; i--) {
			data[i] = data[i-1];
		}
		data[index] = element;
		size++;
	}

	//COMPLETE
	@Override
	public boolean addAll(Collection<? extends E> c) {
		boolean added = false;
		for (E element : c) {
			if (element != null) {
				this.add(element);
				added = true;
			}
		}
		return added;
	}

	//COMPLETE
	@Override
	public void clear() {
		for (int i=0; i<data.length; i++) {
			data[i] = null;
		}
	}

	//COMPLETE
	@Override
	public boolean contains(Object o) {
		for (E element : data) {
			if (element != null && element.equals(o)) {
				return true;
			}
		}
		return false;
	}

	//COMPLETE
	@Override
	public E get(int index) {
		return data[index];
	}

	//COMPLETE
	@Override
	public boolean isEmpty() {
		boolean isEmpty = true;
		for (int i=0; i<data.length; i++) {
			if (data[i] != null) {
				isEmpty = false;
			}
		}
		return isEmpty;
	}

	//COMPLETE
	@Override
	public boolean remove(Object o) {
		for (int i=0; i<data.length; i++) {
			if (data[i].equals(o)) {
				this.remove(i);
				return true;
			}
		}
		return false;
	}

	//COMPLETE
	@Override
	public E remove(int index) {
		E out = data[index];
		for (int i=index; i<data.length-1; i++) {
			data[i] = data[i+1];
		}
		return out;
	}

	//COMPLETE
	@Override
	public E set(int index, E element) {
		E original = data[index];
		data[index] = element;
		return original;
	}

	//COMPLETE - Also did a recursive size method for fun
	@Override
	public int size() {
		int size = 0;
		for (int i=0; i<data.length; i++) {
			if (data[i] != null) {
				size++;
			}
		}
		return size;
	}

	//COMPLETE
	public int size(int i) {
		if (data[i] == null) {
			return 0;
		} else {
			return 1 + this.size(i+1);
		}
	}


	//	------------------ COMPLETION ------------------------

	//COMPLETE
	@Override
	public int indexOf(Object o) {
		for (int i=0; i<data.length; i++) {
			if (data[i].equals(o)) {
				return i;
			}
		}
		return -1;
	}

	//COMPLETE
	@Override
	public boolean containsAll(Collection<?> c) {
		boolean containsAll = false;
		for (Object element : c) {
			for (E listEle : data) {
				if (element != null) {
					if (element.equals(listEle)) {
						containsAll = true;
						break;
					}
				}
				containsAll = false;
			}
		}
		return containsAll;
	}

	//COMPLETE
	@Override
	public boolean removeAll(Collection<?> c) {
		boolean removed = false;
		for (Object element : c) {
			for (E listEle : data) {
				if (element != null) {
					if (element.equals(listEle)) {
						this.remove(element);
						removed = true;
					}
				}
			}
		}
		return removed;
	}

	//COMPLETE
	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		boolean addedAll = false;
		for (E element : c) {
			this.add(index, element);
			index++;
		}
		return addedAll;
	}

	//COMPLETE
	@Override
	public int lastIndexOf(Object o) {
		int position = -1;
		for (int i=0; i<data.length; i++) {
			if (data[i] != null && data[i].equals(o)) {
				position = i;
			}
		}
		return position;
	}

	//COMPLETE
	@Override
	public Object[] toArray() {
		E[] copy = (E[]) new Object[data.length];
		for (int i=0; i<data.length; i++) {
			copy[i] = data[i];
		}
		return copy;
	}


	//	------------------- CHALLENGE ------------------------
	// None completed
	//
	@Override
	public Iterator<E> iterator() {
		return null;
	}

	//
	@Override
	public ListIterator<E> listIterator() {
		return null;
	}

	//
	@Override
	public ListIterator<E> listIterator(int arg0) {
		return null;
	}

	//
	@Override
	public boolean retainAll(Collection<?> c) {
		return false;
	}

	//
	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return null;
	}

	//
	@Override
	public <T> T[] toArray(T[] a) {
		return null;
	}

	
	// ACCESSORS
	public E[] getData() {
		return data;
	}
	public void setData(E[] data) {
		this.data = data;
	}
	
	public int getSize() {
		return size;
	}
}
