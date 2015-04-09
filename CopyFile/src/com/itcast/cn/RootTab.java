package com.itcast.cn;


import java.io.Serializable;

import java.util.List;



public class RootTab<RootItem> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5164805486607049820L;
	private String rootTab01;
	private String rootTab02;
	
	private List<RootItem> root01Item;
	private List<RootItem> root02Item;
	public String getRootTab01() {
		return rootTab01;
	}
	public void setRootTab01(String rootTab01) {
		this.rootTab01 = rootTab01;
	}
	public String getRootTab02() {
		return rootTab02;
	}
	public void setRootTab02(String rootTab02) {
		this.rootTab02 = rootTab02;
	}
	public List<RootItem> getRoot01Item() {
		return root01Item;
	}
	public void setRoot01Item(List<RootItem> root01Item) {
		this.root01Item = root01Item;
	}
	public List<RootItem> getRoot02Item() {
		return root02Item;
	}
	public void setRoot02Item(List<RootItem> root02Item) {
		this.root02Item = root02Item;
	}
	public RootTab(String rootTab01, String rootTab02,
			List<RootItem> root01Item, List<RootItem> root02Item) {
		super();
		this.rootTab01 = rootTab01;
		this.rootTab02 = rootTab02;
		this.root01Item = root01Item;
		this.root02Item = root02Item;
	}
	public RootTab() {
		super();
	}
	@Override
	public String toString() {
		return "RootTab [rootTab01=" + rootTab01 + ", rootTab02=" + rootTab02
				+ ", root01Item=" + root01Item + ", root02Item=" + root02Item
				+ "]";
	}
	
	
	

}
