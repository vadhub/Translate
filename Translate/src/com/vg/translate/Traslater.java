package com.vg.translate;

import java.util.HashMap;
import java.util.Map;

public class Traslater {
	private HashMap<String, String> st = new HashMap<String, String>();
	
	public void translateToRus(String englis){
		
		st.put("Hello", "������");
		st.put("World", "���");
		
		String[] subStr;
		String delimeter = " ";
		subStr = englis.split(delimeter);
		int i = 0;
		for (Map.Entry<String, String> entry : st.entrySet()) {
			
			if(entry.getKey().contentEquals(subStr[i])){
				System.out.println(entry.getValue());			
			}else{
				System.err.println("Error");
			}
			
			i++;
		}
		
	}
	public HashMap<String, String> getSt() {
		return st;
	}
	public void setSt(HashMap<String, String> st) {
		this.st = st;
	}
}
