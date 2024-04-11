package cy.olesiabokk.stateapp.model.service;

import cy.olesiabokk.stateapp.model.entity.Citizen;

import java.util.ArrayList;

public interface StateService {
    String getStateName();

    String getCapital();

    int getStateArea();

    long regionCount();

    int getResidentAverageAge();

    ArrayList<Citizen> getResByLettersNumber(int number);

    ArrayList<Citizen> getResNamesByFirstChar(char character);
}
