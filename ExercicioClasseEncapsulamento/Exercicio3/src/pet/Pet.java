package pet;

public class Pet {
	private final String name;
	private boolean clean;

	public Pet(String name) {
		this.name = name;
		this.clean = false;
	}
	public Pet() {
		this.name = "";
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public boolean isClean() {
		return clean;
	}
	public void setCelan(boolean clean) {
		this.clean = clean;
	}
}
