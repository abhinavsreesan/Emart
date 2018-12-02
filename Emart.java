package com;

import java.util.ArrayList;

public class Emart implements Mart 
{

	//Array List Declaration
	ArrayList<Item> itemList =new ArrayList<Item>(5);
	
	//Constructor
	public Emart(ArrayList<Item> itemList) 
	{
		super();
		this.itemList = itemList;
	}

	
	//Function to Add Item to the Array List
	@Override
	public int addItem(Item i) 
	{
		int s1=itemList.size(); //To get size of Array List
		itemList.add(i);
			if(itemList.size()>s1) 
			{
				return itemList.size();
			}		
			else
				return -1;
	}

	//Extreme Quantity 
	@Override
	public ArrayList<Item> getExtremeQtyByCategory(String s) 
	{
		ArrayList<Item> n1= new ArrayList<Item>(5);
		Item in;
		int ma = 0,mi=1000,l1=0,l2=0;
		for(int i=0;i<itemList.size();i++) 
		{
			in=itemList.get(i);
			if(in.getCategory()==s) 
			{
				if(in.getItemQty()>ma) 
				{
					ma=in.getItemId();
					l1=i;
				}
				if(in.getItemQty()<mi) 
				{
					mi=in.getItemId();
					l2=i;
					
				}
				
			}
		}
		//System.out.println("Max: "+ma);
		//System.out.println("Min: "+mi);
		n1.add(itemList.get(l1));
		n1.add(itemList.get(l2));
		return n1;
	}

	@Override
	public Item getItem(int n) 
	{
		Item in;
		int flag=0;
		try 
		{
			for(int i=0;i<(itemList.size());i++) 
			{
				in=itemList.get(i);
				if(in.getItemId()==n) 
				{
					flag=1;
					return in;
				}
			
			}
			if(flag==0) 
			{
				throw new ItemNotFound("Not Found");
			}
		}
			catch (ItemNotFound e) 
			{
				System.out.println(e);
			}
		
		return null;
	}

	@Override
	public Item updateItem(int a, int b) 
	{
		Item in;
		int flag=0;
		try
		{
		for(int i=0;i<(itemList.size());i++) 
		{
			in=itemList.get(i);
			if(in.getItemId()==a) 
			{
				if(in.getItemQty()<b) 
				{
					flag=1;
					in.setItemQty(b);
					return in;
				}
				
			}
			
		}
		if(flag==0) 
		{
			throw new ItemNotFound("Not Found");
		}
		}
		catch (ItemNotFound e) 
		{
			System.out.println(e);
		}
		return null;
		
	}
	
	

}
