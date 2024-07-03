package cy.olesiabokk.stateapp.controller;

import cy.olesiabokk.stateapp.model.entity.Citizen;

import java.util.List;

public interface Controller {
    String requestStateName();

    String requestCapitalName();

    int requestStateArea();

    long requestRegionCount();

    int requestResidentsAverageAge();

    List<Citizen> requestResByLettersNumber();

    List<Citizen> requestResNamesByFirstChar();

}
