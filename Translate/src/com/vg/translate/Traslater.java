package com.vg.translate;

import java.util.HashMap;
import java.util.Map;

public class Traslater {
	private HashMap<String, String> st = new HashMap<String, String>();
	
	public void translateToRus(String englis){
		
		st.put("Hello", "������");
		st.put("World", "���");
		
		
		
		for (Map.Entry<String, String> entry : st.entrySet()) {
			
			if(entry.getKey().contentEquals(englis)){
				System.out.println(entry.getValue());			
			}else{
				System.err.println("Error");
			}
		}
		
	}
	public HashMap<String, String> getSt() {
		return st;
	}
	public void setSt(HashMap<String, String> st) {
		this.st = st;
	}
}
