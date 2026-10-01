// Nathan Thomas
// Programming Assignment Chapter04
// Exercise05 (a-d)
// p.157

// import java.time.*;
// import java.time.format.DateTimeFormatter;

public class Game
{
    private Team team1;
    private Team team2;
    private String gameTime;

    // LocalTime gameTime = LocalTime.of(19,0);
    // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm a");

    public Game(Team t1, Team t2, String time)
    {
        this.team1 = t1;
        this.team2 = t2;
        this.gameTime = time;
    }

    public Team getTeam1()
    {
        return team1;
    }

    public Team getTeam2()
    {
        return team2;
    }

    public String getGameTime()
    {
        return gameTime;
    }

}
