package cy.olesiabokk.stateapp.controller;

import java.util.List;

public interface Controller {
    String requestStateName();

    String requestCapitalName();

    int requestStateArea();

    long requestRegionCount();

    int requestResidentsAverageAge();

    List<String> requestResByLettersNumber();

    List<String> requestResNamesByFirstChar();

}