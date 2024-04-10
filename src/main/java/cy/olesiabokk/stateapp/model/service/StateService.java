package cy.olesiabokk.stateapp.model.service;

import cy.olesiabokk.stateapp.model.entity.Citizen;
import cy.olesiabokk.stateapp.model.entity.State;

import java.util.List;

public class StateService implements StateServiceInterface{
    private State state;

    public StateService() {
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
        return state.getRegions().stream().count();
    }

    @Override
    public int getResidentAverageAge() {
        //sum all ages / all citizen
        List<Integer> allCitizenAge = state.getRegions().stream()
                .flatMap(region -> region.getDistricts().stream())
                .flatMap(district -> district.getCities().stream())
                .flatMap(city -> city.getCitizens().stream())
                .mapToInt(Citizen::getAge)
                .boxed().toList();

        return (allCitizenAge.stream()
                .mapToInt(el -> el).sum() / allCitizenAge.size());
    }

    @Override
    public void getResByLettersNumber(int number) {
        state.getRegions().stream()
                .flatMap(region -> region.getDistricts().stream())
                .flatMap(district -> district.getCities().stream())
                .flatMap(city -> city.getCitizens().stream())
                .map(Citizen::getName)
                .filter(name -> name.toCharArray().length == number)
                .forEach(System.out::println);

    }

    @Override
    public void getResNamesByFirstChar(char character) {
        state.getRegions().stream()
                .flatMap(region -> region.getDistricts().stream())
                .flatMap(district -> district.getCities().stream())
                .flatMap(city -> city.getCitizens().stream())
                .map(Citizen::getName)
                .filter(name -> name.charAt(0) == character)
                .forEach(System.out::println);
    }

}
