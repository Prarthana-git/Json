package com.bridgelabz.OopConcept;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import com.bridgelabz.model.InventoryDetailModel;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class InventoryDetails {
	
	public List<InventoryDetailModel> convortJsonToObject(String filepath)
  {try {
		ObjectMapper mapper = new ObjectMapper();
		File jsonfile = new File(filepath);
		List<InventoryDetailModel> invent = mapper.readValue(jsonfile, new TypeReference<List<InventoryDetailModel>>() {
		});
		;
		return null;
	    }
	catch (Exception e)
	{
		e.printStackTrace();
	}
return null;
  }
	public static void main(String[] args)  {

		try {
	InventoryDetails jsoninv = new InventoryDetails();
	
	
	List<InventoryDetailModel> invent= jsoninv.convortJsonToObject("D:\\Java\\JsonPractice\\OopConcept\\src\\main\\java\\com\\bridgelabz\\jsonfiles\\Inventory_details.json");
	 InventoryManager manager=new InventoryManager();
	 manager.readInventory(invent);
	System.out.println(manager.getTotalRicePrice());
	} catch (Exception e) {
		
		e.printStackTrace();
	
	}
      
	}

}
