package com.collection;

import java.util.Arrays;

public class MyArrayList<T>{
	private int size = 0;
	private static final int sizedef=10;
	private Object a[];
	public MyArrayList() {
		// TODO Auto-generated constructor stub
		a=new Object[sizedef];
	}
	
	public void add(T t){
		if(size == a.length) {
			setLength();
		}
		a[size++]=t;
	}
	private void setLength() {
		int sizenew=a.length*2;
		a=Arrays.copyOf(a, sizenew);
	}
	public T get(int i) {
		if(i>=size || i<0) {
			throw new IndexOutOfBoundsException("Index:"+i+", Size"+size);
		}
		return (T) a[i];
	}
	public T remove(int i) {
		if(i>=size || i<0) {
			throw new IndexOutOfBoundsException("Index:"+i+", Size"+size);
		}
		Object item = a[i];
		int nums = a.length - (i+1);
		System.arraycopy(a, i+1, a, i, nums);
		size--;
		return (T) item;
	}
	
	public int size() {
		
		return size;
	}
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append('[');
		for(int i=0;i<size;i++) {
			s.append(a[i].toString());
			if(i<size-1) {
				s.append(",");
			}
			
		}
		s.append(']');
		return s.toString();
	}

}
