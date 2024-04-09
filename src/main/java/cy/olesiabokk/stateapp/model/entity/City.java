package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;
import cy.olesiabokk.stateapp.model.util.Generator;

import java.util.ArrayList;

public class City implements General {
    private String name;
    private Generator generator = new Generator();

    private final ArrayList<Citizen> citizens;

    public City() {
        this.name = generator.generateName();
        this.citizens = new ArrayList<>();
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<Citizen> getCitizens() {
        return new ArrayList<>(citizens);
    }

    public void addCitizens(ArrayList<Citizen> citizens) {
        this.citizens.addAll(citizens);
    }

}