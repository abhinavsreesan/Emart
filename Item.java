package com;

public class Item {
	
	private int itemId;
	private String itemName;
	private int itemQty;
	private String category;
		
	public Item(int itemId, String itemName, int itemQty, String category) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemQty = itemQty;
		this.category = category;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getItemQty() {
		return itemQty;
	}

	public void setItemQty(int itemQty) {
		this.itemQty = itemQty;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	public void Display() 
	{
		System.out.println("Item ID: "+this.itemId);
		System.out.println("Item Name: "+this.itemName);
		System.out.println("Item Qty: "+this.itemQty);
		System.out.println("Item Category: "+this.category);
	}
	
}
