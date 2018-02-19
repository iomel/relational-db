package lesson6.DbForum;

import java.sql.Date;

public class ForumCategory {
    private long id;
    private String title;
    private String description;
    private Date catDate;
    private String ip;

    public ForumCategory(long id, String title, String description, Date catDate, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.catDate = catDate;
        this.ip = ip;
    }
}
