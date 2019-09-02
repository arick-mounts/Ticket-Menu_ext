
/*
 *This program uses objects to create a menu and ticket, and fill them with menu items,
 *It utilizes polymorphism to accommodate many types of food.
 *Java @ TCC
 *Arick Mounts
 */


public class Driver {
	public static void main (String[] args) {
		Entree e0 = new Entree("Entree one", 12.99, "it's food!", 13, "Mac+Cheese");
		Entree e1 = new Entree("Entree two", 12.99, "it's food!", 13, "Mashed potatoes");
		Entree e2 = new Entree("Entree three", 12.99, "it's food!", 13, "Green Beans");
		Entree e3 = new Entree("Entree four", 12.99, "it's food!", 13, "");
		Entree e4 = new Entree("Entree five", 12.99, "it's food!", 13, "Mac+Cheese");

		Dessert d0 = new Dessert("Dessert one", 12.99, "it's food!", 13, 100000);
		Dessert d1 = new Dessert("Dessert two", 12.99, "it's food!", 13, 1045);
		Dessert d2 = new Dessert("Dessert three", 12.99, "it's food!", 13, 500);
		Dessert d3 = new Dessert("Dessert four", 12.99, "it's food!", 13, 6200);
		Dessert d4 = new Dessert("Dessert five", 12.99, "it's food!", 13, 1045);
		

		Appetizer a0 = new Appetizer("Appetizer one", 12.99, "it's food!", 13, true);
		Appetizer a1 = new Appetizer("Appetizer two", 12.99, "it's food!", 13, false);
		Appetizer a2 = new Appetizer("Appetizer three", 12.99, "it's food!", 13, true);
		Appetizer a3 = new Appetizer("Appetizer four", 12.99, "it's food!", 13, false);
		Appetizer a4 = new Appetizer("Appetizer five", 12.99, "it's food!", 13, true);
		
		Menu m1 = new Menu ("Food Place");
		m1.addItem(e0);
		m1.addItem(e1);
		m1.addItem(e2);
		m1.addItem(e3);
		m1.addItem(e4);

		m1.addItem(d0);
		m1.addItem(d1);
		m1.addItem(d2);
		m1.addItem(d3);
		m1.addItem(d4);

		m1.addItem(a0);
		m1.addItem(a1);
		m1.addItem(a2);
		m1.addItem(a3);
		m1.addItem(a4);

		System.out.print(m1.toString());	

		Ticket t1 = new Ticket (15);
		Ticket t2 = new Ticket (420);

		t1.addItem (e1);
		t1.addItem (e4);
		t1.addItem (a1);
		t1.addItem (d1);
		t1.addItem (d1);


		t2.addItem (e2);
		t2.addItem (e3);
		t2.addItem (a3);
		t2.addItem (d0);
		t2.addItem (d2);

		System.out.print(t1.toString());
		System.out.print(t2.toString());
	}
		
}