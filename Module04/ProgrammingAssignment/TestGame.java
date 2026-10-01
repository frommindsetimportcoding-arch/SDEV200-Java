// Nathan Thomas
// Programming Assignment Chapter04
// Exercise05 (a-d)
// p.157

import java.util.Scanner;

public class TestGame
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.println("Enter data for Team 1: ");
        Team t1 = TestTeam.setTeamData();

        System.out.println("\nEnter data for Team 2:");
        Team t2 = TestTeam.setTeamData();

        System.out.println("\nEnter the game time (e.g hh:mm am/pm): ");
        String time = input.nextLine();

        Game myGame = new Game(t1, t2, time);

        displayGameDetails(myGame);

    }

    public static void displayGameDetails(Game game)
    {
        System.out.println("\n======= GAME DETAILS =======");
        System.out.println("Scheduled Time: " + game.getGameTime());

        Team t1 = game.getTeam1();
        Team t2 = game.getTeam2();

        System.out.printf("Team 1: %s %s %s\n", t1.getSchoolName(), t1.getMascot(), t1.getSport());
        System.out.printf("Team 2 %s %s %s", t2.getSchoolName(), t2.getMascot(), t2.getSport());
    }
}
