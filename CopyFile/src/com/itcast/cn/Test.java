package com.itcast.cn;

import java.util.LinkedList;
import java.util.List;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	List<RootItem> ss=new LinkedList<RootItem>();
	RootItem rootItem = new RootItem();
	ss.add(rootItem);
	ss.add(rootItem);
	//ss.remove(rootItem);
System.out.println(ss);
	}

}
