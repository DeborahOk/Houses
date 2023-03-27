public class Houses {

    // list all attributes here: name, age, weight, height
    private String type;
    private int year;
    private int rooms;
    private double price;


    // constructor method
    public Houses(String type, int year, int rooms, double price){ // passing on parameters
        setType (type);
        setYear(year);
        setRooms(rooms);
        setPrice(price);

    }
    // getter setter method alt+insert


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;}

    public void priceIncrease() {
        setRooms(getRooms() + 1);
        setPrice(getPrice() + 100); //  increasing the age by 1
    }
}
