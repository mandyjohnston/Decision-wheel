package Models;

import Models.Topic;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Choice {
    //attributes
    @Id
    @GeneratedValue
    private Long id;
    private String description;
    @ManyToOne
    private Topic topic;

    //empty constructor for MVC
    public Choice() {

    }

    //actual constructors
    public Choice(String description, Topic topic) {
        this.description = description;
    }

    //getters
    public Long getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }

    //functionality
}
