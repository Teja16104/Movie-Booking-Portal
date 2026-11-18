package Basics;

import java.util.*;

class MovieBookingPortal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MOVIE TICKET BOOKING PORTAL =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("\nEnter movie name: ");
        String movie = sc.nextLine();

        System.out.print("Is the movie A-rated? (yes/no): ");
        String certificate = sc.nextLine();

        if (certificate.equalsIgnoreCase("yes")) {

            System.out.println(movie + " selected. Certificate: A");

            if (age < 18) {

                System.out.println("Sorry! A-rated movies are restricted to below 18.");

            } else {

                System.out.println("\nTheatre Details:");

                System.out.print("Enter theatre name: ");
                String theatre = sc.nextLine();

                System.out.print("Is it a Multiplex or Single Screen? ");
                String theatreType = sc.nextLine();

                if (theatreType.equalsIgnoreCase("Multiplex")) {

                    System.out.println(theatre + " is a Multiplex.");

                } else if (theatreType.equalsIgnoreCase("Single Screen")) {

                    System.out.println(theatre + " is a Single Screen.");

                } else {

                    System.out.println("Invalid theatre type!");

                }

                if (theatreType.equalsIgnoreCase("Multiplex") ||
                    theatreType.equalsIgnoreCase("Single Screen")) {

                    System.out.println("\nAvailable Seats:");

                    if (theatreType.equalsIgnoreCase("Multiplex")) {

                        System.out.println("Silver - Rs.200");
                        System.out.println("Gold - Rs.300");
                        System.out.println("Platinum - Rs.400");

                    } else {

                        System.out.println("Silver - Rs.100");
                        System.out.println("Gold - Rs.150");
                        System.out.println("Platinum - Rs.200");

                    }

                    System.out.print("Enter seat type: ");
                    String seat = sc.nextLine();

                    int amount = 0;

                    if (seat.equalsIgnoreCase("Silver")) {

                        if (theatreType.equalsIgnoreCase("Multiplex")) {
                            amount = 200;
                        } else {
                            amount = 100;
                        }

                    } else if (seat.equalsIgnoreCase("Gold")) {

                        if (theatreType.equalsIgnoreCase("Multiplex")) {
                            amount = 300;
                        } else {
                            amount = 150;
                        }

                    } else if (seat.equalsIgnoreCase("Platinum")) {

                        if (theatreType.equalsIgnoreCase("Multiplex")) {
                            amount = 400;
                        } else {
                            amount = 200;
                        }

                    } else {

                        System.out.println("Invalid seat type!");

                    }

                    if (amount != 0) {

                        System.out.println("\nPayment Methods:");
                        System.out.println("UPI");
                        System.out.println("Debit Card");
                        System.out.println("Credit Card");

                        System.out.print("Enter payment method: ");
                        String payment = sc.nextLine();

                        if (payment.equalsIgnoreCase("UPI") ||
                            payment.equalsIgnoreCase("Debit Card") ||
                            payment.equalsIgnoreCase("Credit Card")) {

                            System.out.println(payment + " payment selected.");

                            System.out.println("\n===== BOOKING CONFIRMED =====");
                            System.out.println("Customer Name: " + name);
                            System.out.println("Age: " + age);
                            System.out.println("Movie: " + movie);
                            System.out.println("Certificate: A");
                            System.out.println("Theatre: " + theatre);
                            System.out.println("Theatre Type: " + theatreType);
                            System.out.println("Seat: " + seat);
                            System.out.println("Payment: " + payment);
                            System.out.println("Total Amount: Rs." + amount);
                            System.out.println("Ticket booked successfully!");

                        } else {

                            System.out.println("Invalid payment method!");

                        }

                    }

                }

            }

        } else if (certificate.equalsIgnoreCase("no")) {

            System.out.println(movie + " selected. Certificate: Not A-rated.");

            System.out.println("\nTheatre Details:");

            System.out.print("Enter theatre name: ");
            String theatre = sc.nextLine();

            System.out.print("Is it a Multiplex or Single Screen? ");
            String theatreType = sc.nextLine();

            if (theatreType.equalsIgnoreCase("Multiplex")) {

                System.out.println(theatre + " is a Multiplex.");

            } else if (theatreType.equalsIgnoreCase("Single Screen")) {

                System.out.println(theatre + " is a Single Screen.");

            } else {

                System.out.println("Invalid theatre type!");

            }

            if (theatreType.equalsIgnoreCase("Multiplex") ||
                theatreType.equalsIgnoreCase("Single Screen")) {

                System.out.println("\nAvailable Seats:");

                if (theatreType.equalsIgnoreCase("Multiplex")) {

                    System.out.println("Silver - Rs.200");
                    System.out.println("Gold - Rs.300");
                    System.out.println("Platinum - Rs.400");

                } else {

                    System.out.println("Silver - Rs.100");
                    System.out.println("Gold - Rs.150");
                    System.out.println("Platinum - Rs.200");

                }

                System.out.print("Enter seat type: ");
                String seat = sc.nextLine();

                int amount = 0;

                if (seat.equalsIgnoreCase("Silver")) {

                    if (theatreType.equalsIgnoreCase("Multiplex")) {
                        amount = 200;
                    } else {
                        amount = 100;
                    }

                } else if (seat.equalsIgnoreCase("Gold")) {

                    if (theatreType.equalsIgnoreCase("Multiplex")) {
                        amount = 300;
                    } else {
                        amount = 150;
                    }

                } else if (seat.equalsIgnoreCase("Platinum")) {

                    if (theatreType.equalsIgnoreCase("Multiplex")) {
                        amount = 400;
                    } else {
                        amount = 200;
                    }

                } else {

                    System.out.println("Invalid seat type!");

                }

                if (amount != 0) {

                    System.out.println("\nPayment Methods:");
                    System.out.println("UPI");
                    System.out.println("Debit Card");
                    System.out.println("Credit Card");

                    System.out.print("Enter payment method: ");
                    String payment = sc.nextLine();

                    if (payment.equalsIgnoreCase("UPI") ||
                        payment.equalsIgnoreCase("Debit Card") ||
                        payment.equalsIgnoreCase("Credit Card")) {

                        System.out.println(payment + " payment selected.");

                        System.out.println("\n===== BOOKING CONFIRMED =====");
                        System.out.println("Customer Name: " + name);
                        System.out.println("Age: " + age);
                        System.out.println("Movie: " + movie);
                        System.out.println("Certificate: Not A-rated");
                        System.out.println("Theatre: " + theatre);
                        System.out.println("Theatre Type: " + theatreType);
                        System.out.println("Seat: " + seat);
                        System.out.println("Payment: " + payment);
                        System.out.println("Total Amount: Rs." + amount);
                        System.out.println("Ticket booked successfully!");

                    } else {

                        System.out.println("Invalid payment method!");

                    }

                }

            }

        } else {

            System.out.println("Invalid certificate!");

        }

        sc.close();

    }

}
