package Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
public class Topic {
    //attributes
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @OneToMany(mappedBy = "topic")
    private Collection<Choice> choices;

    //empty constructor for MVC
    public Topic() {

    }

    //actual constructors
    public Topic(String name) {
        this.name = name;
    }

    //getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection getChoices() {
        return choices;
    }

    //functionality




}
