package br.com.teste;


import java.io.Serializable;  
import java.util.ArrayList;  
import java.util.List;  
import java.util.UUID;  

import javax.faces.bean.ViewScoped;

import org.springframework.stereotype.Controller;
  
@Controller
@ViewScoped
public class TableBean implements Serializable {  
  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	
	private final static String[] colors;  
  
    private final static String[] manufacturers;  
  
    static {  
        colors = new String[10];  
        colors[0] = "Black";  
        colors[1] = "White";  
        colors[2] = "Green";  
        colors[3] = "Red";  
        colors[4] = "Blue";  
        colors[5] = "Orange";  
        colors[6] = "Silver";  
        colors[7] = "Yellow";  
        colors[8] = "Brown";  
        colors[9] = "Maroon";  
  
        manufacturers = new String[10];  
        manufacturers[0] = "Mercedes";  
        manufacturers[1] = "BMW";  
        manufacturers[2] = "Volvo";  
        manufacturers[3] = "Audi";  
        manufacturers[4] = "Renault";  
        manufacturers[5] = "Opel";  
        manufacturers[6] = "Volkswagen";  
        manufacturers[7] = "Chrysler";  
        manufacturers[8] = "Ferrari";  
        manufacturers[9] = "Ford";  
    }  
  
    private List<Car> cars;  
  
    private Car selectedCar;  
  
    private Car[] selectedCars;  
  
    private CarDataModel mediumCarsModel;  
  
    public TableBean() {  
        cars = new ArrayList<Car>();  
          
        populateRandomCars(cars, 50);  
  
        mediumCarsModel = new CarDataModel(cars);  
    }  
  
    public Car[] getSelectedCars() {  
        return selectedCars;  
    }  
    public void setSelectedCars(Car[] selectedCars) {  
        this.selectedCars = selectedCars;  
    }  
  
    public Car getSelectedCar() {  
        return selectedCar;  
    }  
  
    public void setSelectedCar(Car selectedCar) {  
        this.selectedCar = selectedCar;  
    }  
  
    private void populateRandomCars(List<Car> list, int size) {  
        for(int i = 0 ; i < size ; i++)  
            list.add(new Car(getRandomModel(), getRandomYear(), getRandomManufacturer(), getRandomColor()));  
    }  
  
    private int getRandomYear() {  
        return (int) (Math.random() * 50 + 1960);  
    }  
  
    private String getRandomColor() {  
        return colors[(int) (Math.random() * 10)];  
    }  
  
    private String getRandomManufacturer() {  
        return manufacturers[(int) (Math.random() * 10)];  
    }  
  
    private String getRandomModel() {  
        return UUID.randomUUID().toString().substring(0, 8);  
    }  
  
    public CarDataModel getMediumCarsModel() {  
        return mediumCarsModel;  
    }  
}  
