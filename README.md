Overview
This is a simple console-based Tic Tac Toe game implemented in Java. The game allows multiple players to take turns making moves on a user defined nxn grid. The objective is to get three of their symbols (either 'X','O',..) in a row, either horizontally, vertically, or diagonally.

How to Run
Ensure you have Java installed on your machine.

Download the TicTacToe.java file.

Open a terminal or command prompt and navigate to the directory where the file is located.

Compile the Java file using the following command:

bash
Copy code
javac TicTacToe.java
Run the compiled program:

bash
Copy code
java TicTacToe
How to Play
The game is played on a nxn grid(n is the value input by the user).

Players take turns to make a move by entering the row and column where they want to place their symbol. Rows and columns are numbered from 1 and 1,.....,n and n respectively.

The game alternates between 'X','O',.. for each player.

The game ends when one player has n of their symbols in a row, or there are no more empty spaces on the board (resulting in a draw).

Follow the on-screen prompts to input your moves.

Example Gameplay
markdown
Copy code
Welcome to Tic Tac Toe!

0,0 | 0,1 | 0,2
---------------
1,0 | 1,1 | 1,2
---------------
2,0 | 2,1 | 2,2

Player 1 (X), enter your move (row and column): 0,0
X |   |  
---------
   |   |  
---------
   |   |  

Player 2 (O), enter your move (row and column): 1,1

X |   |  
---------
   | O |  
---------
   |   |  

...

Player 1 (X) wins!

Thanks for playing!
Project Structure
TicTacToe.java: The main Java file containing the implementation of the Tic Tac Toe game.

Notes:
The code is designed to be simple and console-based for educational purposes.

Feel free to modify and expand the code to add features like input validation, a graphical interface, or additional game modes.

Have fun playing Tic Tac Toe!
