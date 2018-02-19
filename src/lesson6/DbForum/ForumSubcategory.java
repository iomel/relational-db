package lesson6.DbForum;

import java.sql.Date;

public class ForumSubcategory {
    private long id;
    private ForumCategory category;
    private String title;
    private String description;
    private Date catDate;
    private String ip;

    public ForumSubcategory(long id, ForumCategory category, String title, String description, Date catDate, String ip) {
        this.id = id;
        this.category = category;
        this.title = title;
        this.description = description;
        this.catDate = catDate;
        this.ip = ip;
    }
}
