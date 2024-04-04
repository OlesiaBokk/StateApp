package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.entity.interfaces.General;
import cy.olesiabokk.stateapp.util.Generator;

public class State implements General {
    private static State instance;
    private String name;
    private final String capital;
    private District district;
    private Region region;
    private City city;
    private Generator generator = new Generator();

    private State() {
        this.name = generator.generateName();
        this.capital = city.getCapitalName();
    }

    public static State getInstance() {
        if (instance == null) {
            instance = new State();
        }
        return instance;
    }

    @Override
    public String getName() {
        return name;
    }
}
