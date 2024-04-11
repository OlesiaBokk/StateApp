package cy.olesiabokk.stateapp.model.service;

import cy.olesiabokk.stateapp.model.entity.*;

import java.util.ArrayList;

public class StateServiceImpl implements StateService {
    private final State state;

    public StateServiceImpl() {
        state = State.getInstance();
    }

    @Override
    public String getStateName() {
        return state.getName();
    }

    @Override
    public String getCapital() {
        return state.getCapital();
    }

    @Override
    public int getStateArea() {
        return state.getArea();
    }

    @Override
    public long regionCount() {
        return state.getRegions().size();
    }

    @Override
    public int getResidentAverageAge() {
        ArrayList<Citizen> citizens = getCitizenList();
        int sum = 0;
        for (int i = 0; i < citizens.size(); i++) {
            sum = sum + citizens.get(i).getAge();
        }
        return sum / citizens.size();
    }

    @Override
    public ArrayList<Citizen> getResByLettersNumber(int number) {
        ArrayList<Citizen> citizens = getCitizenList();
        ArrayList<Citizen> citizensStartLetter = new ArrayList<>();
        for (int i = 0; i < citizens.size(); i++) {
            if (citizens.get(i).getName().toCharArray().length == number) {
                citizensStartLetter.add(citizens.get(i));
            }
        }
        return citizensStartLetter;
    }

    @Override
    public ArrayList<Citizen> getResNamesByFirstChar(char character) {
        ArrayList<Citizen> citizens = getCitizenList();
        ArrayList<Citizen> citizenByFirstChar = getCitizenList();
        for (int i = 0; i < citizens.size(); i++) {
            if (citizens.get(i).getName().charAt(0) == character) {
                citizenByFirstChar.add(citizens.get(i));
            }
        }
        return citizenByFirstChar;
    }

    public ArrayList<District> getDistrictList() {
        ArrayList<Region> regions = state.getRegions();
        ArrayList<District> districts = new ArrayList<>();
        for (int i = 0; i < regions.size(); i++) {
            districts.addAll(regions.get(i).getDistricts());
        }
        return districts;
    }

    public ArrayList<City> getCityList() {
        ArrayList<District> districts = getDistrictList();
        ArrayList<City> cities = new ArrayList<>();
        for (int i = 0; i < districts.size(); i++) {
            cities.addAll(districts.get(i).getCities());
        }
        return cities;
    }

    public ArrayList<Citizen> getCitizenList() {
        ArrayList<City> cities = getCityList();
        ArrayList<Citizen> citizens = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            citizens.addAll(cities.get(i).getCitizens());
        }
        return citizens;
    }
}
