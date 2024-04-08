package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.entity.interfaces.General;
import cy.olesiabokk.stateapp.util.EntityGenerator;
import cy.olesiabokk.stateapp.util.Generator;

import java.util.ArrayList;

public class State implements General {
    private static final State instance = new State(new EntityGenerator().createRegionCollection());
    private final String name;
    private final String capitalName;
    private Capital capital;
    private final Generator generator = new Generator();
    private final ArrayList<Region> regions;

    private State(ArrayList<Region> regions) {
        this.name = generator.generateName();
        this.regions = new ArrayList<>(regions);
        this.capitalName = getCapital();
    }

    public static State getInstance() {
        return instance;
    }

    public ArrayList<Region> getRegions() {
        return new ArrayList<>(regions);
    }

    @Override
    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital.getName();
    }
}
