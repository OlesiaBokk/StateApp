package cy.olesiabokk.stateapp.model.entity.interfaces;

import java.util.List;

public interface StateInterface {
    String getStateName();

    String getCapitalName();

    int getStateArea();

    int getRegionQuantity();

    int getResidentAverageAge();

    List<String> getResByLetterNumber();

    List<String> getResNamesByEnterChar();

}
