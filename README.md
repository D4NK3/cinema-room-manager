# cinema-room-manager

The cinema-room project aims to provide a program which simulates the basic operation logic of a cinema room manager system. 
This project was made for personal practice and fun.

## Table of Contents
- [Installing, Compiling and Running](#installing-compiling-and-running)
- [Manual](#manual)
- [Usage Examples](#usage-examples)
- [Troubleshooting](#troubleshooting)
- [License](#license)

## Installing, Compiling and Running
- Installing<br/>
You first need to clone this repository. After that you need to compile the `CinemaRoomManager.java` file. 

- Compiling<br/>
If you have JDK installed on your computer then use the `javac CinemaRoomManager.java` command to compile the program.

- Running<br/>
After compilation you can run your program using the `java CinemaRoomManager.class` command.

Note: I used JDK version 15.0.2 for developing. JDK must be installed on you computer to be able to compile and run this project. Else you can download it from the official page of [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html). 

## Manual
As previously mentioned, this program aims to simulate the logic of a cinema room manager software. It communicates through the standard input and output.
- **Stating phase**
  - You need to type in the parameters(rows; seats in rows) of the cinema room when you start the program.

- **Menu**
  - You will have a menu with 4 options after the starting phase. You can navigate with the `numbers` in the menu. 
  - **Options**
    - **Show the seats** - `1`
      - This option prints out the seating arrangement in a form of a table to the standard output. You can see the available and the sold seats.
    - **Buy a ticket** - `2`
      - You can type in the position(row and seat number) of the wanted seat. If it is available then you the system will buy it automatically for you. You can't buy a seat that is already sold. The program will ask you to type in again a different seat position. The program also warns you if you want to buy a non-existent sea.
     - **Statistics** - `3`
       - You can get some insight into the basic statistics of the cinema room. This option prints out the following ones: Number of purchased tickets, Percentage of the sold seats, Current income, Total income(when all seats sold).
    - **Exit** - `0`
      - You can exit the cinema room manager.

## Usage Examples
- Init phase: \
![Input: Dimensions(rows, seats) of the room][usage1]

- Show the seats: \
![Layout of the cinema room][usage2]

- Buy a ticket: \
![Input: Wanted row and seat number][usage3]

- Buy a ticket (Already sold seat, Wrong input): \
![Wrong input: Invalid seat position][usage4]

- Statistics: \
![Purchased tickets, Percentage, Income][usage5]
  
## Troubleshooting

- If you don't have Oracle JDK installed on your computer, then you can [download](https://www.oracle.com/java/technologies/javase-downloads.html) it.
- If you can't run the program with the `java CoffeeMachine.class` command, then it is possibly that you need to specify the exact location of your .class file. You can do it with the -cp option, which stands for Class Path.

## License
The program and associated documentation in this repo are released under the [MIT License](https://en.wikipedia.org/wiki/MIT_License).<br/>
When you contribute to this repository you are doing so under the above license.

[usage1]: https://github.com/D4NK3/cinema-room-manager/blob/main/img/initPhase.png
[usage2]: https://github.com/D4NK3/cinema-room-manager/blob/main/img/showTheSeats.png
[usage3]: https://github.com/D4NK3/cinema-room-manager/blob/main/img/buyTicket.png
[usage4]: https://github.com/D4NK3/cinema-room-manager/blob/main/img/buyTicketInvalid.png
[usage5]: https://github.com/D4NK3/cinema-room-manager/blob/main/img/statistics.png
