package cy.olesiabokk.stateapp.controller;

import cy.olesiabokk.stateapp.model.service.StateServiceInterface;
import cy.olesiabokk.stateapp.view.ViewInterface;

import java.util.List;

public class Controller implements ControllerInterface {
    public StateServiceInterface stateServiceInterface;
    public ViewInterface viewInterface;
    public Menu menu = new Menu();

    public void setStateService(StateServiceInterface stateServiceInterface) {
        this.stateServiceInterface = stateServiceInterface;
    }

    public void setViewInterface(ViewInterface viewInterface) {
        this.viewInterface = viewInterface;
    }

    public void select() {
        boolean flag = true;
        while (flag) {
            int number = menu.getUserNumber();
            switch (number) {
                case 1:
                    viewInterface.printStateName();
                    break;
                case 2:
                    viewInterface.printCapitalName();
                    break;

                case 3:
                    viewInterface.printStateArea();
                    break;

                case 4:
                    viewInterface.printRegionCount();
                    break;

                case 5:
                    viewInterface.printResidentsAverageAge();
                    break;

                case 6:
                    viewInterface.printResByLettersNumber();
                    break;

                case 7:
                    viewInterface.printResNamesByFirstChar();
                    break;

                case 0:
                    System.out.println("Bye bye!");
                    flag = false;
                    break;
            }
        }
    }

    @Override
    public String requestStateName() {
        return stateServiceInterface.getStateName();
    }

    @Override
    public String requestCapitalName() {
        return stateServiceInterface.getCapital();
    }

    @Override
    public int requestStateArea() {
        return stateServiceInterface.getStateArea();
    }

    @Override
    public long requestRegionCount() {
        return stateServiceInterface.regionCount();
    }

    @Override
    public int requestResidentsAverageAge() {
        return stateServiceInterface.getResidentAverageAge();
    }

    @Override
    public List<String> requestResByLettersNumber() {
        System.out.println("Enter number from 5 to 10");
        int letterNum = menu.sc.nextInt();
        List<String> residentNamesList = stateServiceInterface.getResByLettersNumber(letterNum);
        return residentNamesList;
    }

    @Override
    public List<String> requestResNamesByFirstChar() {
        System.out.println("Enter letter");
        char letter = menu.sc.next().charAt(0);
        List<String> namesCharList = stateServiceInterface.getResNamesByFirstChar(letter);
        return namesCharList;
    }
}
