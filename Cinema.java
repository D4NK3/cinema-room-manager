package cinema;
import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seats = scanner.nextInt();

        System.out.println();

        String[][] seatingArrangement = init(rows, seats);

        loop:
        while(true){
            System.out.println("1. Show the seats\n2. Buy a ticket\n3. Statistics\n0. Exit");
            int option = scanner.nextInt();

            switch (option){
                case 0:
                    break loop;
                case 1:
                    showSeats(seatingArrangement, rows, seats);
                    break;
                case 2:
                    buyTicket(seatingArrangement, rows, seats);
                    break;
                case 3:
                    statistics(seatingArrangement, rows, seats);
                    break;
            }
        }
    }

    public static String[][] init(int rows, int seats){
        String[][] array = new String[rows][seats];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < seats; j++){
                array[i][j] = "S";
            }
        }
        return array;
    }

    public static void showSeats(String[][] cinemaLayout, int rows, int seats){
        System.out.println();
        System.out.println("Cinema:");
        for(int i = 0; i <= rows; i++){
            for(int j = 0; j <= seats; j++){
                if (i == 0 && j == 0){
                    System.out.print(' ');
                } else if (j == 0) {
                    System.out.print(i);
                } else if (i == 0) {
                    System.out.print(" " + j);
                } else {
                    System.out.print(" " + cinemaLayout[i - 1][j - 1]);
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void buyTicket(String[][] cinemaLayout, int rows, int seats){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a row number:");
        int buyRow = scanner.nextInt();

        System.out.println("Enter a seat number in that row:");
        int buySeat = scanner.nextInt();

        if (buyRow > rows || buyRow < 1 || buySeat > seats || buySeat < 1){
            System.out.println("Wrong input!");
            buyTicket(cinemaLayout, rows, seats);
        } else {
            if (cinemaLayout[buyRow - 1][buySeat - 1].equals("B")){
                System.out.println("That ticket has already been purchased!");
                buyTicket(cinemaLayout, rows, seats);
            } else {
                if (rows * seats <= 60) {
                    System.out.println("Ticket price: $10");
                } else if (rows % 2 == 0) {
                    if (buyRow > rows / 2) {
                        System.out.println("Ticket price: $8");
                    } else {
                        System.out.println("Ticket price: $10");
                    }
                } else {
                    if (buyRow > rows / 2) {
                        System.out.println("Ticket price: $8");
                    } else {
                        System.out.println("Ticket price: $10");
                    }
                }
                cinemaLayout[buyRow - 1][buySeat - 1] = "B";
            }
        }
    }

    private static int getPriceOfSeat(int row, int seat, int totalIncome, int i) {
        if (row * seat <= 60){
            totalIncome += 10;
        } else if (row % 2 == 0) {
            if (i + 1 > row / 2){
                totalIncome += 8;
            } else {
                totalIncome += 10;
            }
        } else {
            if (i + 1 > row / 2) {
                totalIncome += 8;
            } else {
                totalIncome += 10;
            }
        }
        return totalIncome;
    }

    public static void statistics(String[][] cinemaLayout, int row, int seat){
        int purchasedTickets = 0;
        for (String[] rowActual : cinemaLayout){
            for (String seatActual : rowActual) {
                if (seatActual.equals("B")) {
                    purchasedTickets += 1;
                }
            }
        }
        System.out.println("Number of purchased tickets: " + purchasedTickets);

        double percentage = purchasedTickets * 100.0 / (row * seat);
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");

        int income = 0, totalIncome = 0;
        for (int i = 0;i < row; i++){
            for (int j = 0; j < seat; j++){
                if (cinemaLayout[i][j].equals("B")){
                    income = getPriceOfSeat(row, seat, income, i);
                }

                totalIncome = getPriceOfSeat(row, seat, totalIncome, i);
            }
        }
        System.out.println("Current income: $" + income);
        System.out.println("Total income: $" + totalIncome);
    }
}