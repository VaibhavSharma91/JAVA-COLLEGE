import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Custom Exception for Invalid Age
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// 2. Custom Exception for Invalid Number of Seats
class InvalidSeatsException extends Exception {
    public InvalidSeatsException(String message) {
        super(message);
    }
}

// 3. Custom Exception for Insufficient Seats Available
class InsufficientSeatsException extends Exception {
    public InsufficientSeatsException(String message) {
        super(message);
    }
}

public class CASESTUDY14 {
    // Simulating a fixed number of total available seats on the bus
    private static int availableSeats = 10;

    public static void bookTicket(int age, int requestedSeats) 
            throws InvalidAgeException, InvalidSeatsException, InsufficientSeatsException {
        
        // Validate Age (Rule 1)
        if (age <= 0) {
            throw new InvalidAgeException("Error: Invalid age! Age must be greater than 0.");
        }

        // Validate Number of Seats (Rule 2)
        if (requestedSeats <= 0) {
            throw new InvalidSeatsException("Error: Invalid number of seats! Seats must be greater than 0.");
        }

        // Validate Seat Availability (Rule 3)
        if (requestedSeats > availableSeats) {
            throw new InsufficientSeatsException("Error: Insufficient seats! Only " + availableSeats + " seats are available.");
        }

        // If all conditions pass, complete the booking
        availableSeats -= requestedSeats;
        System.out.println("\n🎉 Booking Successful!");
        System.out.println("Seats Confirmed: " + requestedSeats);
        System.out.println("Remaining Seats in Bus: " + availableSeats);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to the Bus Ticket Booking System ===");
        System.out.println("Total Available Seats: " + availableSeats + "\n");

        try {
            // Read Passenger Age
            System.out.print("Enter passenger age: ");
            int age = scanner.nextInt();

            // Read Requested Seats
            System.out.print("Enter number of seats to book: ");
            int requestedSeats = scanner.nextInt();

            // Process booking logic
            bookTicket(age, requestedSeats);

        } // 4. Handle Invalid Input (Text instead of a number)
        catch (InputMismatchException e) {
            System.out.println("Error: Invalid input! Please enter numbers only, text is not allowed.");
        } 
        // Handle the custom business rule exceptions
        catch (InvalidAgeException | InvalidSeatsException | InsufficientSeatsException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            scanner.close();
            System.out.println("\nThank you for using the Booking System.");
        }
    }
}
