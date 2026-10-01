// Nathan Thomas
// Programming Assignment Chapter04
// Exercise05 (a-d)
// p.157

public class Team
{
    private String schoolName = "";
    private String sport = "";
    private String mascot = "";

    public final static String MOTTO = "Sportsmanship!";

    public Team(String schoolName, String sport, String mascot)
    {
        this.schoolName = schoolName;
        this.sport = sport;
        this.mascot = mascot;
    }

    public String getSchoolName()
    {
        return schoolName;
    }

    public String getSport()
    {
        return sport;
    }

    public String getMascot()
    {
        return mascot;
    }
}
