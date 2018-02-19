package lesson6.DbForum;

import java.sql.Date;

public class User {
    private long id;
    private String nick;
    private String password;
    private String email;
    private Date date;
    private double karma;
    private String ip;

    public User(long id, String nick, String password, String email, Date date, double karma, String ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.date = date;
        this.karma = karma;
        this.ip = ip;
    }
}
