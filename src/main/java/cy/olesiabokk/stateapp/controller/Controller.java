package cy.olesiabokk.stateapp.controller;

import cy.olesiabokk.stateapp.model.entity.Citizen;

import java.util.ArrayList;

public interface Controller {
    String requestStateName();

    String requestCapitalName();

    int requestStateArea();

    long requestRegionCount();

    int requestResidentsAverageAge();

    ArrayList<Citizen> requestResByLettersNumber();

    ArrayList<Citizen> requestResNamesByFirstChar();

}
