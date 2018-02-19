package lesson6.DbForum;

import java.sql.Date;

public class ForumPost {
    private long id;
    private ForumSubcategory subcategory;
    private ForumPost parentPost;
    private String title;
    private String content;
    private boolean isPoll;
    private Date postDate;
    private String ip;

    public ForumPost(long id, ForumSubcategory subcategory, ForumPost parentPost, String title, String content,
                     boolean isPoll, Date postDate, String ip) {
        this.id = id;
        this.subcategory = subcategory;
        this.parentPost = parentPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.postDate = postDate;
        this.ip = ip;
    }
}
