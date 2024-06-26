package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;

import java.util.ArrayList;

public class City implements General {
    private final String name;

    private final ArrayList<Citizen> citizens;

    public City(String name) {
        this.name = name;
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

    @Override
    public String toString() {
        return "City name = '" + name + '\'';
    }
}
