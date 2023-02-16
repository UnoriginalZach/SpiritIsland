package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.GameBoard.Area;
import src.GameBoard.Board;
import src.errors.InvalidPlayerCountException;

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

    public Game(Board board, Player ...players) throws InvalidPlayerCountException {
        this.board = board;
        if (players.length > 4 || players.length < 2) {
            // throw error [recommended]
            // OR
            // playerList.addAll(Arrays.copyRange(players, 0, 4))
            throw new InvalidPlayerCountException(players.length);
        }
        playerList.addAll(List.of(players));
    }

    public int getTarget(Area area, Scanner scanner) {
        if(area.isInvadersPresent()) {
            System.out.println("you are attacking Invaders in: "+ area.getType()+ " number:"+ area.getNumber());
            System.out.println("There are "+area.getTotalInvaders()+" invaders");
            for(var i = 0; i < area.getTotalInvaders(); i++ ) {
                System.out.println((i + 1) +" " + area.getInvader(i)+" with "+ area.getInvader(i).getLifePoints()+" life points");
            }
            System.out.print("select the invader you would like to attack:");
                return scanner.nextInt() - 1;
        }
        else {return -1;}
    }

    public void blightCascade(Area area) {
        ArrayList<Area>areaOptions = board.adjacentAreas(area);
        for(Area i : areaOptions) {
            areaOptions.add(i);

        }
        
        
    }

    public void playersAttackPhase() {
        var scanner = new Scanner(System.in);
        getTarget(null, scanner);
        
        scanner.close();
    }
    public void round () {
        // Spirit phase
        // card commit
        // fast attack
        // invaders attack
        // slow attacks
        // time passes

    }
}
