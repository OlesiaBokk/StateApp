package cy.olesiabokk.stateapp.util;

import cy.olesiabokk.stateapp.entity.Citizen;
import cy.olesiabokk.stateapp.entity.City;
import cy.olesiabokk.stateapp.entity.District;
import cy.olesiabokk.stateapp.entity.Region;

import java.util.ArrayList;

public class EntityGenerator {
    private Generator generator = new Generator();
    private Region region = new Region();
    private District district = new District();
    private City city = new City();
    private Citizen citizen = new Citizen();

    final ArrayList<Region> regionList = new ArrayList<>();
    final ArrayList<District> districtList = new ArrayList<>();
    final ArrayList<City> cityList = new ArrayList<>();
    final ArrayList<Citizen> citizenList = new ArrayList<>();


    public ArrayList<Region> createRegionCollection() {
        for (int i = 0; i < 3; i++) {
            regionList.add(region);
        }
        return regionList;
    }

    public ArrayList<District> createDistrictCollection() { //key District, value Region
        int random = generator.getRandomNumber(1, 10);
        for (int i = 0; i < regionList.size(); i++) {
            for (int j = 0; j < random; j++) {
                districtList.add(district);

            }
        }
        return districtList;
    }

    public ArrayList<City> createCityCollection() { //key City, value District
        int random = generator.getRandomNumber(1, 15);
        for (int i = 0; i < districtList.size(); i++) {
            for (int j = 0; j < random; j++) {
                cityList.add(city);
            }
        }
        return cityList;
    }

    public ArrayList<Citizen> createCitizenCollection() { //key CitizenId, value City
        int random = generator.getRandomNumber(1, 10000);
        for (int i = 0; i < cityList.size(); i++) {
            for (int j = 0; j < random; j++) {
                citizenList.add(citizen);
            }
        }
        return citizenList;
    }
}
