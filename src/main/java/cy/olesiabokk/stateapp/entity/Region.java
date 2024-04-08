package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.entity.interfaces.General;
import cy.olesiabokk.stateapp.util.Generator;

import java.util.ArrayList;

public class Region implements General {
    private final String name;
    private State state;
    private final Generator generator = new Generator();
    private final ArrayList<District> districts;

    public Region(ArrayList<District> districts) {
        this.name = generator.generateName();
        this.districts = new ArrayList<>(districts);
    }

    @Override
    public String getName() {
        return name;
    }

    public ArrayList<District> getDistricts() {
        return new ArrayList<>(districts);
    }
}