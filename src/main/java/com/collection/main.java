package com.collection;

import java.awt.List;

public class main {
	public static <T> MyArrayList<T> asList(T[] a) {
	    return new MyArrayList<T>(a);
	}

}
