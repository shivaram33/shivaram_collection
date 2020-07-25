package com.collection;


public class main1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyArrayList<Integer> list = new MyArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(6);
		list.add(20);
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		System.out.println(list.size());
		System.out.println(list.get(3));
	}

}
