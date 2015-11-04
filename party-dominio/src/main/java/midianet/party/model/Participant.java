package midianet.party.model;

/**
 * Created by marcosfernandocosta on 28/10/15.
 */
public class Participant {
    private Long id;
    private String email;
    private String password;
    private String name;
    private Integer age;
    private Party party;
    private boolean alcoholic;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(final boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

}