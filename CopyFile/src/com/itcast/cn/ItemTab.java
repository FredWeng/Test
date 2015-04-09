package com.itcast.cn;

import java.io.Serializable;

public class ItemTab implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4922366566700957931L;
	private String DispName;
	private String DbField;
	private String Select;
	private String Weigth;
	
	public ItemTab() {
		super();
	}
	public ItemTab(String dispName, String dbField, String select, String weigth) {
		super();
		DispName = dispName;
		DbField = dbField;
		Select = select;
		Weigth = weigth;
	}
	public String getDispName() {
		return DispName;
	}
	public void setDispName(String dispName) {
		DispName = dispName;
	}
	public String getDbField() {
		return DbField;
	}
	public void setDbField(String dbField) {
		DbField = dbField;
	}
	public String getSelect() {
		return Select;
	}
	public void setSelect(String select) {
		Select = select;
	}
	public String getWeigth() {
		return Weigth;
	}
	public void setWeigth(String weigth) {
		Weigth = weigth;
	}
	@Override
	public String toString() {
		return "ItemTab [DispName=" + DispName + ", DbField=" + DbField
				+ ", Select=" + Select + ", Weigth=" + Weigth + "]";
	}
	
	

}
