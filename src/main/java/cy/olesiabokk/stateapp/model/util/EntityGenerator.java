package cy.olesiabokk.stateapp.model.util;

import cy.olesiabokk.stateapp.model.entity.*;

import java.util.ArrayList;
import java.util.Random;

public class EntityGenerator {
    private final Random random = new Random();

    private char getRandomChar() {
        return (char) (random.nextInt(26) + 'a');
    }

    public int getRandomNumber() {
        return random.nextInt();
    }

    public int generateCitizenAge() {
        return getRandomNumber(0, 100);
    }


    public int getRandomNumber(int from, int to) {
        int randomNum = getRandomNumber();
        if (randomNum < from || randomNum > to) {
            randomNum = (from + random.nextInt(to - from));
        }
        return randomNum;
    }

    public String generateName() {
        int randomNum = getRandomNumber(5, 10);
        char[] strName = new char[randomNum];
        for (int i = 0; i < strName.length; i++) {
            strName[i] = getRandomChar();
        }
        return String.valueOf(strName);
    }

    public ArrayList<Region> createRegionCollection() {
        ArrayList<Region> regions = new ArrayList<>();
        int listSize = getRandomNumber(1, 6);
        for (int i = 0; i < listSize; i++) {
            regions.add(new Region(createDistrictCollection(), generateName()));
        }
        return regions;
    }

    public ArrayList<District> createDistrictCollection() {
        ArrayList<District> districts = new ArrayList<>();
        int listSize = getRandomNumber(1, 10);
        for (int i = 0; i < listSize; i++) {
            districts.add(new District(createCityCollection(), generateName()));
        }
        return districts;
    }

    public ArrayList<City> createCityCollection() {
        ArrayList<City> cities = new ArrayList<>();
        int listSize = getRandomNumber(1, 15);
        for (int i = 0; i < listSize; i++) {
            cities.add(new City(generateName()));
        }
        return cities;
    }

    public ArrayList<Citizen> createCitizenCollection(State state, String name, String surname, int age, String cityName, String districtName, String regionName) {
        ArrayList<Citizen> citizens = new ArrayList<>();
        int quantity = getRandomNumber(1000, 5000);
        for (int i = 0; i < quantity; i++) {
            citizens.add(new Citizen(state, generateName(), generateName(), generateCitizenAge(), cityName, districtName, regionName));
        }
        return citizens;
    }
}
