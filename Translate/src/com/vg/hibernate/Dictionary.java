package com.vg.hibernate;

public class Dictionary {
	
	
	private int id;
	private String en;
	private String ru;
	
	public Dictionary() {}
	
	public Dictionary(int id, String en, String ru) {
		this.id = id;
		this.en = en;
		this.ru = ru;
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	public String getRu() {
		return ru;
	}

	public void setRu(String ru) {
		this.ru = ru;
	}
	
	@Override
	
	public String toString(){
		return "Dictionary{ id=" +id+"/,en= "+en+"/,ru"+ru+"}";
	}
}
