package com;
import java.util.*;

  public interface Mart 
{
	  public int addItem(Item i);
	  public ArrayList<Item> getExtremeQtyByCategory(String s);
	  public Item getItem(int n);
	  public Item updateItem(int a,int b);
	  
}
