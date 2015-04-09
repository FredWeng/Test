package com.itcast.cn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class Copyfile {
	
	public static int getMax(int[] arr ){
		
		int maxw=arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(maxw<arr[i]){
				maxw=arr[i];
			}
		}
		return maxw;
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		 int[] arr={1,2,3,5};
		 int max=getMax(arr);
		 System.out.println(max);
		
try {
	//		try {
	//			
	//			FileInputStream inputStream=new FileInputStream(new File("item.json"));
	//			FileOutputStream outputStream=new FileOutputStream("c:/work/b.txt");
	//			byte[] b=new byte[1024];
	//			int len=0;
	//			while((len=inputStream.read(b))!=-1){	
	//				buffer.append(str, offset, len);
	//				outputStream.write(b, 0, len);
	//			}
	//			outputStream.flush();
	//			inputStream.close();
	//			outputStream.close();
	//		} catch (Exception e) {
	//			
	//			e.printStackTrace();
	//		}
	BufferedReader  br= new BufferedReader(new FileReader("item.json"));
			StringBuffer buffer = new StringBuffer();
			char[] cbuf=new char[1024];
			int len =0;
			while((len=br.read(cbuf))!=-1){
				buffer.append(cbuf, 0, len);
			}
			String sb=buffer.toString();
//			JSONObject object = JSONObject.parseObject(sb);
//			RootTab rootTab = new RootTab();
//			rootTab.setRootTab01(object.getString("rootTab01"));
//			JSONArray jsonArray = object.getJSONArray("root01Item");
//			List<RootItem> root01Item = new ArrayList<RootItem>();
//			for (int i = 0; i < jsonArray.size(); i++) {
//				RootItem rootItem=new RootItem();
//				JSONObject jsonObject = jsonArray.getJSONObject(i);
//				rootItem.setDispName(jsonObject.getString("DispName"));
//				JSONArray jsonArray2 = jsonObject.getJSONArray("Item");
//				List<ItemTab> item = new ArrayList<ItemTab>();
//				for (int j = 0; j < jsonArray2.size(); j++) {
//					JSONObject jsonObject2 = jsonArray2.getJSONObject(i);
//					ItemTab itemTab = new ItemTab(jsonObject2.getString("DispName"), jsonObject2.getString("DbField"), jsonObject2.getString("Select"), jsonObject2.getString("Weigth"));
//					item.add(itemTab);
//				}
//				rootItem.setItem(item);
//				root01Item.add(rootItem);
//				
//			}
//			rootTab.setRoot01Item(root01Item);			System.out.println(rootTab);
			//System.out.println(buffer.toString());
			TypeReference<RootTab<RootItem>> typeRef = new TypeReference<RootTab<RootItem>>() {};
			RootTab<RootItem> parseObject = JSON.parseObject(sb,typeRef);
			System.out.println(parseObject);
			//List<RootItem<ItemTab>> root01Item = parseObject.getRoot01Item();
			//System.out.println(root01Item.get(0).toString());
			
		TypeReference<List<RootItem>> typeRef2 = new TypeReference<List<RootItem>>() {};
		//String ss=parseObject.getRoot01Item().toString();
		String ss=JSONObject.toJSONString(parseObject.getRoot01Item());
		System.out.println(ss);
		List<RootItem> parseObject2 = JSON.parseArray(ss,RootItem.class);
		System.out.println(parseObject2);
		System.out.println(JSON.parseObject(parseObject.getRoot01Item().toString(), typeRef2));
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
	public static void ff(){
		return ;
	}

}
