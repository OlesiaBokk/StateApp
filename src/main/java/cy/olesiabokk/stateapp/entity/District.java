package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.entity.interfaces.General;
import cy.olesiabokk.stateapp.util.Generator;

public class District implements General {
    private String name;

    private City city = new City();
    private Generator generator = new Generator();

    public District() {
        this.name = generator.generateName();
    }

    @Override
    public String getName() {
        return name;
    }
}
