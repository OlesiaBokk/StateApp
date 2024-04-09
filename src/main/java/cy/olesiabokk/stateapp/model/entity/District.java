package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;
import cy.olesiabokk.stateapp.model.util.Generator;

import java.util.ArrayList;

public class District implements General {
    private String name;
    private final Generator generator = new Generator();
    private final ArrayList<City> cities;

    public District(ArrayList<City> cities) {
        this.name = generator.generateName();
        this.cities = new ArrayList<>(cities);
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<City> getCities() {
        return new ArrayList<>(cities);
    }
}
