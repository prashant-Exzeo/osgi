package agenda.api;

public class Conference {

	public Conference() {
	}

	public Conference(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	private String name;
	private String location;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String toString() {
		return "Conference [name=" + name + ", location=" + location + "]";
	}
}
