//Sharri'a Sneed
//Oct 17, 2023
//ITSE 2317

import java.util.Scanner;
public class RetailDemo {
	public static void main(String args[]) {
		RetailItem jacket = new RetailItem("Leather Jacket", 20, 50.00);
		RetailItem heels = new RetailItem("Red High Heels", 50, 25.00);
		RetailItem jeans = new RetailItem("Ripped Jeans", 30, 15.00);
		
		display(jacket,heels,jeans);
	}
	
	public static void display(RetailItem i1, RetailItem i2, RetailItem i3) {
		System.out.println("Item Desc\tUnits on Hand\tPrice");
		System.out.println("---------------------------------------------");
		System.out.println(i1.getItemDesc() + "\t\t" + i1.getItemStock() + "\t$" + i1.getItemPrice());
		System.out.println(i2.getItemDesc() + "\t\t" + i2.getItemStock() + "\t$" + i2.getItemPrice());
		System.out.println(i3.getItemDesc() + "\t\t" + i3.getItemStock() + "\t$" + i3.getItemPrice());
	}
}
