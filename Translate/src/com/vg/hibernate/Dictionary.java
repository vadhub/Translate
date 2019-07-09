package com.vg.hibernate;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dictionary", schema = "", catalog = "dictionary")
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
	
    @Id
    @Column(name = "id", nullable = false, insertable = true, updatable = true)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
    @Basic
    @Column(name = "en",  nullable = false, insertable = true, updatable = true, length = 60)
	public String getEn() {
		return en;
	}

	public void setEn(String en) {
		this.en = en;
	}

	@Basic
    @Column(name = "ru",  nullable = false, insertable = true, updatable = true, length = 60)
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
