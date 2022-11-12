package src;

import java.util.ArrayList;
import java.util.Scanner;

import src.GameBoard.Area;
import src.GameBoard.Board;

public class Game {
    private Board board;
    private ArrayList<Player> playerList = new ArrayList<Player>();

    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        playerList.add(player1);
        playerList.add(player2);
        
    } 
    public Game(Board board, Player player1, Player player2, Player player3) {
        this.board = board;
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
    } 
    public Game(Board board, Player player1, Player player2, Player player3, Player player4) {
        this.board = board;
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);
        playerList.add(player4);
    } 
    public void getPlayersTarget(Area area, Scanner scanner) {
        if(area.isIndaversPresent()) {
            boolean isAttackOver = false;
            System.out.println("you are attacking Invaders in: "+ area.getType()+" number:"+area.getNumber());
            System.out.println("There are "+area.getTotalInvaders()+" invaders, and "+area.getTotalDahan()+" Dahan.");
            
            while(!isAttackOver && area.isIndaversPresent()) {
                System.out.println("the invaders present:");
                for(int i = 0; i < area.getTotalInvaders(); i++ ) {
                    System.out.println((i + 1) +" " + area.getInvader(i)+" with "+ area.getInvader(i).getLifePoints()+" life points");
                }
                System.out.print("select the invader you would like to attack:");
                int target = scanner.nextInt() - 1;
                System.out.print("how much power would you like to use:");
                int spiritPower = scanner.nextInt();
                area.DahanAttackPhase(target, spiritPower);
                System.out.print("would you like to continue attacking in this area?");
                if(scanner.nextLine().toLowerCase().equals("no")) {
                    isAttackOver = true;
                }
            } 
        }
    }
    public void playersAttackPhase() {
        Scanner scanner = new Scanner(System.in);
        getPlayersTarget(null, scanner);
        
        scanner.close();
    }
}
