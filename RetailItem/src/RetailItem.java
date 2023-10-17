//Sharri'a Sneed
//Oct 17, 2023
//ITSE 2317

public class RetailItem {
	String itemDescription;
	int itemInStock;
	double itemPrice;
	
	public RetailItem(String desc, int stock, double price) {
		itemDescription =  desc;
		itemInStock = stock;
		itemPrice = price;
	}//closes constructor
	
	//---------------Setters----------------//
	public void setItemDesc(String desc){
		itemDescription =  desc;
	}
	public void setItemStock(int stock){
		itemInStock =  stock;
	}
	public void setItemPrice(int price){
		itemPrice =  price;
	}
	
	//---------------Getters----------------//
	public String getItemDesc(){
		return itemDescription;
	}
	public int getItemStock(){
		return itemInStock;
	}
	public double getItemPrice(){
		return itemPrice;
	}
	
}
