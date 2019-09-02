import java.util.ArrayList;


public class Ticket {
	private int tableNumber;
	private ArrayList<MenuItem> ticketList= new ArrayList<MenuItem> ();
	
	public Ticket (int tableNumber){
		this.tableNumber = tableNumber;
	}
	
	public void addItem (MenuItem m) {
		ticketList.add(m);//ToDo calls menu item construction
	}
	
	public void setTableNumbe (int tableNumber){
		this.tableNumber = tableNumber;
	}
	public int getTableNumber () {
		return tableNumber;
	}
	
	public double totalPrice() {
		double WorkingTotal = 0;
	
		for( MenuItem m : ticketList ){
			WorkingTotal += m.getPrice();
		}
		return WorkingTotal;
	}
	
	public String toString() {
		
		StringBuilder tempString = new StringBuilder();
		tempString.append ("\n---------------------\n||Table " + tableNumber + "||\n---------------------\n") ;
		for( MenuItem m : ticketList ){
			tempString.append( m.toString() + "\n\n" );
		}
		tempString.append ("======\nTotal: " + totalPrice () +"\n======\n");
		return tempString.toString ();
	}
}