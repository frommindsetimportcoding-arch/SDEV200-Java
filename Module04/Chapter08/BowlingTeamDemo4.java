// Nathan Thomas
// p. 291

import java.util.*;

public class BowlingTeamDemo4
{
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {
        String name;
        final int NUM_TEAMS = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;

        getTeamData(teams);

        for (y = 0; y < NUM_TEAMS; ++y)
        {
            System.out.printf("\nMembers of team %s\n", teams[y].getTeamName());
            for (x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.print(teams[y].getMember(x) + " ");
            }
            System.out.println();
        }

        System.out.print("\nEnter a team name to see its roster >> ");
        name = input.nextLine();

        for (y = 0; y < NUM_TEAMS; ++y)
        {
            if (name.equals(teams[y].getTeamName()))
            {
                for (x = 0; x < NUM_TEAM_MEMBERS; ++x)
                {
                    System.out.print(teams[y].getMember(x) + " ");
                }
                System.out.println();
            }
        }
        input.close();
    }

    public static void getTeamData(BowlingTeam[] teams)
    {
        String name;
        final int NUM_TEAMS = 4;
        int x;
        int y;
        final int NUM_TEAM_MEMBERS = 4;

        for (y = 0; y < NUM_TEAMS; ++y)
        {
            teams[y] = new BowlingTeam();
            System.out.print("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);
            for (x = 0; x < NUM_TEAM_MEMBERS; ++x)
            {
                System.out.print("Enter team member's name >> ");
                name = input.nextLine();
                teams[y].setMember(x, name);
            }
        }
    }
}
