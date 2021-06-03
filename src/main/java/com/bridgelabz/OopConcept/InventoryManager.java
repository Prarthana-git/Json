package com.bridgelabz.OopConcept;

import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.model.InventoryDetailModel;

public class InventoryManager {
	private List<InventoryDetailModel> pulses=new ArrayList<InventoryDetailModel>();
	private List<InventoryDetailModel> wheat=new ArrayList<InventoryDetailModel>();
	private List<InventoryDetailModel> rice=new ArrayList<InventoryDetailModel>();

	public void readInventory(List<InventoryDetailModel> invent)
	
	{
		
		for(InventoryDetailModel inv: invent)
		{
			 if(inv.getId()==1001)
			 {
				 rice.add(inv);
			 }
			 if(inv.getId()==1002)
			 {
				 rice.add(inv);
			 }
			 if(inv.getId()==1003)
			 {
				 rice.add(inv);
			 }
		}
	}
	
	public int getTotalRicePrice()
	{
		double weigth=0.0;
		double price=rice.get(0).getPrice();
		for(InventoryDetailModel inv:rice)
		{
			weigth=weigth+inv.getWeight();
		}
		return 0;
	}
}
