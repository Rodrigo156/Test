package br.com.teste;

public class Car {
	
	private String model;
	private Integer year;
	private String manufacturer;
	private String colors;
	

	public Car(String model, Integer year,String manufacturer,String colors){
		this.model = model;
		this.year = year;
		this.manufacturer = manufacturer;
		this.colors = colors;
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

	public String getColors() {
		return colors;
	}
	public void setColors(String colors) {
		this.colors = colors;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	
	

}
