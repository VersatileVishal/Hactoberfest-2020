import java.util.*;
import java.io.File;
public class MazeGame {

public static void main(String[] args) throws Exception {
    Scanner scan = new Scanner(new File("maze.txt"));
    Scanner user = new Scanner(System.in);
    int rows = scan.nextInt();
    int columns = scan.nextInt();
    int px = 0;
    int py = 0;
    String [][] maze = new String[rows][columns];
    String junk = scan.nextLine();

    for (int i = 0; i < rows; i++){
        String temp = scan.nextLine();
        String[] arrayPasser = temp.split("");
        for (int j = 0; j < columns; j++){
            maze[i][j] = arrayPasser[i];
        }
    }

    boolean gotTreasure = false;

    while (gotTreasure == false){
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                System.out.print(maze[i][j]);
                System.out.print(" ");
        }
            System.out.print("\n");
      }


        System.out.printf("\n");
        System.out.println("You may:");
        System.out.println("1) Move up");
        System.out.println("2) Move down");
        System.out.println("3) Move left");
        System.out.println("4) Move right");
        System.out.println("0) Quit");
        int choice = user.nextInt();
        int i = 0;

        if (choice == 1 && i >= 0 && i < columns){
            for (int k = 0; k < rows; k++){
                for (int l = 0; l < columns; l++){
                    if (maze[k][l].equals(maze[px][py]) && maze[px][py-1].equals("X") == false){
                        maze[px][py] = ".";
                        maze[k][l-1] = "P";
                        maze[px][py] = maze[k][l-1];
                    }else if (maze[px][py-1] == "X"){
                        System.out.println("Cannot move into a cave-in! Try something else.");
                    }else {
                    continue;}


                    }
                }
            }
        else if (choice == 2 && i >= 0 && i < columns){
            for (int k = 0; k < rows; k++){
                for (int l = 0; l < columns; l++){
                    if (maze[k][l].equals(maze[px][py]) && maze[px][py+1].equals("X") == false){
                        maze[px][py] = ".";
                        maze[k][l+1] = "P";
                        maze[px][py] = maze[k][l+1];
                    }else if (maze[px][py+1] == "X"){
                        System.out.println("Cannot move into a cave-in! Try something else.");
                    }else {
                    continue;}

               }
             }
            }
        else if (choice == 3 && i >= 0 && i < columns){
            for (int k = 0; k < rows; k++){
                for (int l = 0; l < columns; l++){
                    if (maze[k][l].equals(maze[px][py]) && maze[px-1][py].equals("X") == false){
                        maze[px][py] = ".";
                        maze[k-1][l] = "P";
                        maze[px][py] = maze[k-1][l];
                    }else if (maze[px-1][py] == "X"){
                        System.out.println("Cannot move into a cave-in! Try something else.");
                    }else {
                    continue;}
                }
            }
        }
        else if (choice == 4 && i >= 0 && i < columns){
            for (int k = 0; k < rows; k++){
                for (int l = 0; l < columns; l++){
                    if (maze[k][l].equals(maze[px][py]) && maze[px+1][py].equals("X") == false){
                        maze[px][py] = ".";
                        maze[k+1][l] = "P";
                        maze[px][py] = maze[k+1][l];
                    }else if (maze[px+1][py] == "X"){
                        System.out.println("Cannot move into a cave-in! Try something else.");
                    }else {
                    continue;}
                }
            }
        }
        else if (choice == 0){
            System.exit(0);
        }
    }

    System.out.println("Congratulations, you found the treasure!");

    scan.close();
    user.close();
        }

    }