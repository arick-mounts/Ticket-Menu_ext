import java.util.ArrayList;

public class Menu {
	private String restaurantName;
	private ArrayList<MenuItem> menuList= new ArrayList<MenuItem> ();
	
	public Menu (String restaurantName){
		this.restaurantName = restaurantName;
	}
	
	public void setRestaurantName (String restaurantName){
		this.restaurantName = restaurantName;
	}
	public String getRestaurantName () {
		return restaurantName;
	}
	public void addItem (MenuItem m) {
		menuList.add(m);//ToDo calls menu item construction
	}
	public String toString() {
		
		StringBuilder tempString = new StringBuilder();
		tempString.append ("---------------------\n<<"+restaurantName + ">>\n---------------------\n") ;
		for( MenuItem m : menuList ){
			tempString.append( m.toString() + "\n\n" );
		}
		return tempString.toString ();
	}
	
}