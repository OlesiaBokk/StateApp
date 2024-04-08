package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.entity.interfaces.General;
import cy.olesiabokk.stateapp.util.Generator;

public class City implements General {
    private String name;
    private Generator generator = new Generator();

    public City() {
        this.name = generator.generateName();
    }

    @Override
    public String getName() {
        return name;
    }
}
