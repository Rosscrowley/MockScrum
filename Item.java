
public class Item {

	private String name;
	private String type;
	private String exDate;
	private int quantity;
	private double vat;

	public Item(String n, String t, String eD, int q, double vat) {
		this.name = n;
		this.type = t;
		this.exDate = eD;
		this.quantity = q;
		this.vat = vat;

	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getVat() {
		return vat;
	}

	public void setVat(double vat) {
		this.vat = vat;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getExDate() {
		return exDate;
	}

	public void setExDate(String exDate) {
		this.exDate = exDate;
	}

	public String displayItem() {
		// System.out.println("Student Name: " + this.name + " Address: " +
		// this.address);
		
		String strQ = Integer.toString(quantity);
		String strV = Double.toString(vat);
		
		return "\nItem Name: " + name + "\nItem Type: " + type + "\nExpiration Date: " + exDate + 
				"\nItem quantity: " + strQ + "\nVAT: " + strV  ;
	}

}