public class Entree extends MenuItem {
	private String side;
	
	Entree (String name, double price, String description, int orderCode, String side){
		super(name, price, description, orderCode);
		this.side = side;
	}
	public void setSide (String side){
		this.side = side;
	} 
	public String getSide (){
		return side;
	}
	public String toString (){
		return super.toString() + "Side: " + side;
	}
}