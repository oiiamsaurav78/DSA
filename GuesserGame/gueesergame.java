package GuesserGame;
import java.util.*;
class Guesser{
    int guesserNum;
    public int guesserNumber(){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the guesser num: ");
        guesserNum= input.nextInt();
        return guesserNum;
    }
    
}
class Player{
    int playerNum;
    public int playerguess(){
        System.out.println("Enter player number : ");
        Scanner input= new Scanner(System.in);
        playerNum=input.nextInt();
        return playerNum;
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;
    public void collectFromGuesser(){
        Guesser g1= new Guesser();
        numFromGuesser= g1.guesserNumber();
    }
    public void collectFromPlayer1(){
        Player p1= new Player();
        numFromPlayer1=p1.playerguess();
    }
    public void collectFromPlayer2(){
        Player p2= new Player();
        numFromPlayer1=p2.playerguess();
    }
    public void collectFromPlayer3(){
        Player p3= new Player();
        numFromPlayer3=p3.playerguess();
    }
    void compare(){
        if(numFromPlayer1==numFromGuesser){
            if(numFromPlayer2==numFromGuesser && numFromPlayer3==numFromGuesser){
                System.out.println("All Player won the Game.");
            }
            else if(numFromPlayer3!=numFromGuesser){
                System.out.println("Player1 and Player 2 wont the game.");
            }else{
                System.out.println("Player 1 and Player 3 won the game.");
            }
        }
        else if(numFromPlayer2==numFromGuesser){
                if(numFromPlayer3==numFromGuesser){
                    System.out.println("Player2 and Player 3 won the game");
                }else{
                    System.out.println("Only Player 2 won the game.");
                }
        }else if(numFromPlayer3==numFromGuesser){
            System.out.println("Only Player 3 is winner.");
        }else{
            System.out.println("No one won the game.");
        }

    }
   

}

public class gueesergame {
    public static void main(String[] args) {
        Umpire u1= new Umpire();
        u1.collectFromGuesser();
        u1.collectFromPlayer1();
        u1.collectFromPlayer2();
        u1.collectFromPlayer3();
        u1.compare();
    }
    
}
