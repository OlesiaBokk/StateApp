package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;

import java.util.ArrayList;

public class Region implements General {
    private final String name;
    private final ArrayList<District> districts;

    public Region(ArrayList<District> districts, String name) {
        this.name = name;
        this.districts = new ArrayList<>(districts);
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<District> getDistricts() {
        return new ArrayList<>(districts);
    }

    @Override
    public String toString() {
        return "Region name = '" + name + '\'';
    }
}