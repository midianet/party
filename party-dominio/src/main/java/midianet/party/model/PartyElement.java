package midianet.party.model;

/**
 * Created by marcosfernandocosta on 29/10/15.
 */
public class PartyElement {
    private Long id;
    private Element element;
    private float amountPerson;
    private double unitValue;

    public Long getId() {
        return id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public Element getElement() {
        return element;
    }

    public void setElement(final Element element) {
        this.element = element;
    }

    public float getAmountPerson() {
        return amountPerson;
    }

    public void setAmountPerson(final float amount) {
        this.amountPerson = amount;
    }

    public double getUnitValue() {
        return unitValue;
    }

    public void setUnitValue(final double value) {
        this.unitValue = value;
    }
}