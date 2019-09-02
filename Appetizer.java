public class Appetizer extends MenuItem {
	private boolean vegetarian;
	
	Appetizer (String name, double price, String description, int orderCode, boolean vegetarian){
		super(name, price, description, orderCode);
		this.vegetarian = vegetarian;
	}
	public void setVegetarian(boolean vegetarian){
		this.vegetarian = vegetarian;
	} 
	public boolean getVegetarian(){
		return vegetarian;
	}
	public String toString (){
		return super.toString() + "Vegetarian: " + vegetarian;
	}
}