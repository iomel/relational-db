package lesson6.DbForum;

import java.sql.Date;

public class ForumPollsOption {
    private long id;
    private ForumPost post;
    private String title;
    private Date date;

    public ForumPollsOption(long id, ForumPost post, String title, Date date) {
        this.id = id;
        this.post = post;
        this.title = title;
        this.date = date;
    }
}
