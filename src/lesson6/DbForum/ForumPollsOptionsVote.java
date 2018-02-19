package lesson6.DbForum;

import java.sql.Date;

public class ForumPollsOptionsVote {
    private long id;
    private ForumPollsOption pollOption;
    private User user;
    private Date voteDate;
    private String ip;

    public ForumPollsOptionsVote(long id, ForumPollsOption pollOption, User user, Date voteDate, String ip) {
        this.id = id;
        this.pollOption = pollOption;
        this.user = user;
        this.voteDate = voteDate;
        this.ip = ip;
    }
}
