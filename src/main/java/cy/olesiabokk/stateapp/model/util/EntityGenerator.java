package cy.olesiabokk.stateapp.model.util;

import cy.olesiabokk.stateapp.model.entity.*;

import java.util.ArrayList;

public class EntityGenerator {
    private final Generator generator = new Generator();

    public ArrayList<Region> createRegionCollection() {
        ArrayList<Region> regions = new ArrayList<>();
        int listSize = generator.getRandomNumber(1, 6);
        for (int i = 0; i < listSize; i++) {
            regions.add(new Region(createDistrictCollection()));
        }
        return regions;
    }

    public ArrayList<District> createDistrictCollection() {
        ArrayList<District> districts = new ArrayList<>();
        int listSize = generator.getRandomNumber(1, 10);
        for (int i = 0; i < listSize; i++) {
            districts.add(new District(createCityCollection()));
        }
        return districts;
    }

    public ArrayList<City> createCityCollection() {
        ArrayList<City> cities = new ArrayList<>();
        int listSize = generator.getRandomNumber(1, 15);
        for (int i = 0; i < listSize; i++) {
            cities.add(new City());
        }
        return cities;
    }

    public ArrayList<Citizen> createCitizenCollection(State state, String cityName, String districtName, String regionName) {
        ArrayList<Citizen> citizens = new ArrayList<>();
        int quantity = generator.getRandomNumber(1000, 5000);
        for (int i = 0; i < quantity; i++) {
            citizens.add(new Citizen(state, cityName, districtName, regionName));
        }
        return citizens;
    }
}
