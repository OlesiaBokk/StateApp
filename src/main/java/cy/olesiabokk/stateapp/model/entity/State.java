package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;
import cy.olesiabokk.stateapp.model.util.EntityGenerator;
import cy.olesiabokk.stateapp.model.util.Generator;

import java.util.ArrayList;

public class State implements General {
    private static final State instance = new State();
    private final int area;
    private final String name;
    private final Capital capital;
    private final ArrayList<Region> regions;

    private State() {
        Generator generator = new Generator();
        EntityGenerator entityGenerator = new EntityGenerator();
        this.regions = entityGenerator.createRegionCollection();
        this.name = generator.generateName();
        this.area = generator.getRandomNumber(1000, 10000000);
        for (Region region : getRegions()) {
            for (District district : region.getDistricts()) {
                for (City city : district.getCities()) {
                    city.addCitizens(new EntityGenerator()
                            .createCitizenCollection(this, city.getName(), district.getName(), region.getName()));
                }
            }
        }
        this.capital = Capital.getInstance();
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

    public int getArea() {
        return area;
    }
}
