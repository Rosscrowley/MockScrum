
public class Item {

	private String name;
	private String type;
	private String exDate;

	public Item(String n, String t, String eD) {
		this.name = n;
		this.type = t;
		this.exDate = eD;

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
		return "\n\nItem Name: " + name + "\n  Item Type " + type + "\n  Expiration Date " + exDate;
	}

}