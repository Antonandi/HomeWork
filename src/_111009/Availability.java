package _111009;

public class Availability {

    private int quantity;

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Availability(int quantity) {
        this.quantity =quantity;
        }

    @Override
    public String toString() {
        return "Availability{" +
                quantity +
                '}';
    }

//    public static void main(String[] args) {
//
//        Availability availability = new Availability(2);

        }
//    }
