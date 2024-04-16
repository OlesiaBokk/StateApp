import cy.olesiabokk.stateapp.model.entity.*;
import cy.olesiabokk.stateapp.model.util.EntityGenerator;

import java.util.ArrayList;

public class TestEntityGenerator extends EntityGenerator {
    @Override
    public ArrayList<Region> createRegionCollection() {
        ArrayList<Region> regions = new ArrayList<>();
        regions.add(new Region(createDistrictCollection(), "region"));
        return regions;
    }

    @Override
    public ArrayList<District> createDistrictCollection() {
        ArrayList<District> districts = new ArrayList<>();
        districts.add(new District(createCityCollection(), "district"));
        return districts;
    }

    @Override
    public ArrayList<City> createCityCollection() {
        ArrayList<City> cities = new ArrayList<>();
        cities.add(new City("city1"));
        return cities;
    }

    @Override
    public ArrayList<Citizen> createCitizenCollection(State state, String name, String surname, int age, String cityName, String districtName, String regionName) {
        ArrayList<Citizen> citizens = new ArrayList<>();
        citizens.add(new Citizen(state, "viktor", "ivanov", 32, cityName, districtName, regionName));
        citizens.add(new Citizen(state, "vasily", "vasilyev", 15, cityName, districtName, regionName));
        citizens.add(new Citizen(state, "georgy", "egoryev", 73, cityName, districtName, regionName));
        citizens.add(new Citizen(state, "anton", "antonov", 48, cityName, districtName, regionName));
        citizens.add(new Citizen(state, "anatoly", "petrov", 3, cityName, districtName, regionName));
        return citizens;
    }
}
