
public class Main {
    public static void main(String[] args) {
        System.out.println("House Prices in London ");
        Houses houses00 = new Houses("Semi detached", 1930, 5, 299.950);
        System.out.println("Type = " + houses00.getType());
        System.out.println("Year = " + houses00.getYear());
        System.out.println("Rooms = " + houses00.getRooms());
        System.out.println("Price = " + houses00.getPrice());

        houses00.priceIncrease();
        System.out.println("A year after....");
        System.out.println("Type = " + houses00.getType());
        System.out.println("Year = " + houses00.getYear());
        System.out.println("Rooms = " + houses00.getRooms());
        System.out.println("Price = " + houses00.getPrice());

    }
}