package cy.olesiabokk.stateapp.model.service;

import java.util.List;

public interface StateServiceInterface {
    String getStateName();

    String getCapital();

    int getStateArea();

    long regionCount();

    int getResidentAverageAge();

    List<String> getResByLettersNumber(int number);

    List<String> getResNamesByFirstChar(char character);
}
