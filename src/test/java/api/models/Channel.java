package api.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by yayu on 4/28/2017.
 */
public class Channel {

    private Integer id;
    private String title;
    private String description;
    private Integer publicProjectsCount;
    //constructor
    public Channel(int id, String title, String description, int publicProjectsCount) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.publicProjectsCount = publicProjectsCount;
    }

    public Channel() {
    }
    //getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getPublicProjectsCount() {
        return publicProjectsCount;
    }



    //setters

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublicProjectsCount(int publicProjectsCount) {
        this.publicProjectsCount = publicProjectsCount;
    }

    //toString
    @Override
    public String toString() {
        return "Channel{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", publicProjectsCount=" + publicProjectsCount +
                '}';
    }
}
