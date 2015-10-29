package domain;

import java.util.Date;

/**
 * Created by marcosfernandocosta on 28/10/15.
 */
public class Party {
    private Long id;
    private Date startDate;
    private Date finishDate;
    private String title;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(final Date date) {
        this.startDate = date;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinish(final Date date) {
        this.finishDate = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

}