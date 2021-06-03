package com.bridgelabz.model;

import java.util.List;

public class StockModel {

	private List<Patanjali> Patanjali;
	private List<Marie> Marie;
	private List<Oreo> Oreo;
	private List<Tiger> Tiger;

	private int totalValueOfAllStock;

	public List<Patanjali> getPatanjali() {
		return Patanjali;
	}

	public void setPatanjali(List<Patanjali> patanjali) {
		Patanjali = patanjali;
	}

	public List<Marie> getMarie() {
		return Marie;
	}

	public void setMarie(List<Marie> marie) {
		Marie = marie;
	}

	public List<Oreo> getOreo() {
		return Oreo;
	}

	public void setOreo(List<Oreo> oreo) {
		Oreo = oreo;
	}

	public List<Tiger> getTiger() {
		return Tiger;
	}

	public void setTiger(List<Tiger> tiger) {
		Tiger = tiger;
	}

	public int getTotalValueOfAllStock() {
		return totalValueOfAllStock;
	}

	public void setTotalValueOfAllStock(int totalValueOfAllStock) {
		this.totalValueOfAllStock = totalValueOfAllStock;
	}

}