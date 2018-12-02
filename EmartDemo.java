package com;

import java.util.ArrayList;

public class EmartDemo {

	public EmartDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		Item[] i =new Item[5];
		i[0]=new Item(101,"Pencil",15,"Stationary");
		i[1]=new Item(104,"Chocolate",20,"Stationary");
		i[2]=new Item(105,"Shampoo",8,"Stationary");
		i[3]=new Item(106,"Bottle",50,"Plastics");
		i[4]=new Item(107,"Phone",84,"Electronics");
		//System.out.println();
		
		ArrayList<Item> itemList = new ArrayList<Item>(5);
		Emart e1 = new Emart(itemList);
		System.out.println(e1.addItem(i[0]));
		System.out.println(e1.addItem(i[1]));
		System.out.println(e1.addItem(i[2]));
		//(e1.getItem(105)).Display();
		//(e1.updateItem(104, 25)).Display();
		
		ArrayList<Item> s1=new ArrayList<Item>(5);
		s1=e1.getExtremeQtyByCategory("Stationary");
		Item n;
		for(int k=0;k<s1.size();k++) 
		{	
			n=s1.get(k);
			n.Display();
		}

	}

}
