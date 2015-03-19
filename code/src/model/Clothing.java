package model;

public class Clothing {
	private int id_clothing;
	private int size;
	private String colour;
	public int getId_clothing() {
		return id_clothing;
	}
	public void setId_clothing(int id_clothing) {
		this.id_clothing = id_clothing;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Clothing [" + 
				"id_clothing=" + id_clothing + 
				", size=" + size + 
				", colour=" + colour +
				"]";
}
}
