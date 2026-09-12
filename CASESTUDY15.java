class MovieTheatre {
    private int availableSeats = 5;

    public synchronized void bookSeats(int seats) {
        System.out.println(Thread.currentThread().getName()
                + " is trying to book " + seats + " seats.");

        if (seats <= availableSeats) {
            availableSeats -= seats;

            System.out.println(Thread.currentThread().getName()
                    + " booking successful!");
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            System.out.println(Thread.currentThread().getName()
                    + " booking failed!");
            System.out.println("Only " + availableSeats
                    + " seats are available.");
        }

        System.out.println();
    }
}

class Customer extends Thread {
    private MovieTheatre theatre;
    private int seats;

    Customer(MovieTheatre theatre, int seats, String name) {
        super(name);
        this.theatre = theatre;
        this.seats = seats;
    }

    public void run() {
        theatre.bookSeats(seats);
    }
}

public class CASESTUDY15 {
    public static void main(String[] args) {
        MovieTheatre theatre = new MovieTheatre();

        Customer customer1 = new Customer(theatre, 2, "ROHIT");
        Customer customer2 = new Customer(theatre, 2, "LAKSHYA");
        Customer customer3 = new Customer(theatre, 2, "HARI");

        customer1.start();
        customer2.start();
        customer3.start();
    }
}