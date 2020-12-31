package Entity;

public class Car {
	
	private String id,name,price,count,status;
	
	public Car() {
		super();
	}
	
	public Car(String id,String name,String price,String count,String status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.count = count;
		this.status = status;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getCount() {
		return count;
	}

	public void setCount(String count) {
		this.count = count;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}