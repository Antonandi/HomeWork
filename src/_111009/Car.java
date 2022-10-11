package _111009;

public class Car {

    private String model;
    private int price;

    Availability availability;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    private Car(String model, int price, Availability availability){
        this.model = model;
        this.price = price;
        this.availability = availability;
    }

    @Override
    public String toString() {
        return "Car{" +
                "availability=" + availability +
                '}';
    }

    public static void main(String[] args) {
        Car ford = new Car("Mustang",9800, new Availability(5) );
        System.out.println("Ford " + ford.model);
        System.out.println("Стоимость " + ford.price + "$");
        System.out.println("В наличии " + ford.availability + "автомобилей");
    }
}
