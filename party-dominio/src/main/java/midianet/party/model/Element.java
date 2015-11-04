package midianet.party.model;

/**
 * Created by marcosfernandocosta on 29/10/15.
 */
public class Element {
    private Long id;
    private String description;
    private ElementUnit unit;
    private ElementType type;
    private boolean alcoholic;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public ElementUnit getUnit() {
        return unit;
    }

    public void setUnit(final ElementUnit unit) {
        this.unit = unit;
    }

    public ElementType getType() {
        return type;
    }

    public void setType(final ElementType type) {
        this.type = type;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

}