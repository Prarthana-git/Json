package com.bridgelabz.model;

import java.util.List;


public class InventoryDetailModel {

private int Id;
private String name;
private int weight;
private double price;
public InventoryDetailModel(int id, String name, int weight, double price) {
	super();
	Id = id;
	this.name = name;
	this.weight = weight;
	this.price = price;
}
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getWeight() {
	return weight;
}
public void setWeight(int weight) {
	this.weight = weight;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


	
}


