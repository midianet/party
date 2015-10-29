package domain;

import com.sun.java.swing.plaf.windows.TMSchema;

/**
 * Created by marcosfernandocosta on 28/10/15.
 */
public class Participant {
    private Long id;
    private String name;
    private Integer age;
    private Party party;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }
}