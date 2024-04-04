package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.entity.interfaces.General;
import cy.olesiabokk.stateapp.util.Generator;

public class Region implements General {
    private String name;

    private District district;
    private Generator generator = new Generator();

    public Region() {
        this.name = generator.generateName();
    }

    @Override
    public String getName() {
        return name;
    }
}