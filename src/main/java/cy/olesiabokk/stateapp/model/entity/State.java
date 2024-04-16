package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;
import cy.olesiabokk.stateapp.model.util.EntityGenerator;

import java.util.ArrayList;

public class State implements General {
    private static State instance;
    private final int area;
    private final String name;
    private final Capital capital;
    private final ArrayList<Region> regions;

    private State(EntityGenerator entityGenerator) {
        this.regions = entityGenerator.createRegionCollection();
        this.name = entityGenerator.generateName();
        this.area = entityGenerator.getRandomNumber(1000, 10000000);
        for (Region region : getRegions()) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCities()) {
                    city.addCitizens(entityGenerator.createCitizenCollection(this, entityGenerator.generateName(), entityGenerator.generateName(), entityGenerator.generateCitizenAge(), city.getName(), district.getName(), region.getName()));
                }
            }
        }
        this.capital = Capital.getInstance(entityGenerator.generateName());
    }

    public static State getInstance(EntityGenerator entityGenerator) {
        if(instance == null){
            instance = new State(entityGenerator);
        }
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

    public int getArea() {
        return area;
    }
}
