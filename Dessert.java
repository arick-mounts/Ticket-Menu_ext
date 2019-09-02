public class Dessert extends MenuItem {
	private int calories;
	
	Dessert (String name, double price, String description, int orderCode, int calories){
		super(name, price, description, orderCode);
		this.calories = calories;
	}
	public void setCalories(int calories){
		this.calories = calories;
	} 
	public int getCalories(){
		return calories;
	}
	public String toString (){
		return super.toString() + "Calories: " + calories;
	}
}