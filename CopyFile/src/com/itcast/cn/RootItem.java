package com.itcast.cn;

import java.io.Serializable;
import java.util.List;

public class RootItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3065319933171457083L;
	private String DispName;
	private List<ItemTab> Item;
	
	public RootItem() {
		super();
	}
	public RootItem(String dispName, List<ItemTab> item) {
		super();
		DispName = dispName;
		Item = item;
	}
	public String getDispName() {
		return DispName;
	}
	public void setDispName(String dispName) {
		DispName = dispName;
	}
	public List<ItemTab> getItem() {
		return Item;
	}
	public void setItem(List<ItemTab> item) {
		Item = item;
	}
	@Override
	public String toString() {
		return "RootItem [DispName=" + DispName + ", Item=" + Item + "]";
	}
	
	
	

}
