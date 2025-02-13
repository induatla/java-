import java.util.Scanner;

public class BusReservationSystem {
    private static boolean[] seats = new boolean[10];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Reserve Seat");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. View Available Seats");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reserveSeat();
                    break;
                case 2:
                    cancelReservation();
                    break;
                case 3:
                    viewAvailableSeats();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
        }
    }

    private static void reserveSeat() {
        System.out.println("Enter Seat Number (1-10):");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid Seat Number");
            return;
        }

        if (seats[seatNumber - 1]) {
            System.out.println("Seat Already Reserved");
            return;
        }

        seats[seatNumber - 1] = true;
        System.out.println("Seat Reserved Successfully");
    }

    private static void cancelReservation() {
        System.out.println("Enter Seat Number (1-10):");
        int seatNumber = scanner.nextInt();

        if (seatNumber < 1 || seatNumber > 10) {
            System.out.println("Invalid Seat Number");
            return;
        }

        if (!seats[seatNumber - 1]) {
            System.out.println("Seat Not Reserved");
            return;
        }

        seats[seatNumber - 1] = false;
        System.out.println("Reservation Cancelled Successfully");
    }

    private static void viewAvailableSeats() {
        System.out.println("Available Seats:");

        for (int i = 0; i < seats.length; i++) {
            if (!seats[i]) {
                System.out.print((i + 1) + " ");
            }
        }

        System.out.println();
    }
}
