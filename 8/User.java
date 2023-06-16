public class User
{
    private int id;
    private String username;
    private String passHash;

    public User(int id, String username, String passHash)
    {
        this.id = id;
        this.username = username;
        this.passHash = passHash;
    }

    public int getId() {
        return id;
    }

    public String getUsername()
    {
        return username;
    }

    public String getPasswordHash()
    {
        return passwordHash;
    }
}