// Nathan Thomas
// Programming Assignment Chapter04
// Exercise05 (a-d)
// p.157

import java.util.Scanner;

public class TestTeam
{
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args)
    {

        Team team1 = setTeamData();
        Team team2 = setTeamData();
        Team team3 = setTeamData();

        display(team1);
        display(team2);
        display(team3);

        input.close();
    }

    public static Team setTeamData()
    {

        System.out.print("Enter high school name >> ");
        String school = input.nextLine();

        System.out.print("Enter sport >> ");
        String sport = input.nextLine();

        System.out.print("Enter team mascot >> ");
        String mascot = input.nextLine();

        Team tempTeam = new Team(school, sport, mascot);

        return tempTeam;
    }

    public static void display(Team team)
    {
        System.out.printf("Welcome to %s High School, home of the %s, varsity %s!\n",
                team.getSchoolName(), team.getMascot(), team.getSport());

        System.out.printf("We stive to embody the motto: %s\n", Team.MOTTO);
    }
}
