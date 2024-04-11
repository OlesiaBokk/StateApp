package cy.olesiabokk.stateapp.controller;

import cy.olesiabokk.stateapp.model.entity.Citizen;
import cy.olesiabokk.stateapp.model.service.StateService;
import cy.olesiabokk.stateapp.view.View;

import java.util.ArrayList;

public class ControllerImpl implements Controller {
    public StateService stateService;
    public View view;
    public Menu menu = new Menu();

    public void setStateService(StateService stateService) {
        this.stateService = stateService;
    }

    public void setViewInterface(View view) {
        this.view = view;
    }

    public void select() {
        boolean flag = true;
        while (flag) {
            int number = menu.getUserNumber();
            switch (number) {
                case 1 -> view.printStateName();
                case 2 -> view.printCapitalName();
                case 3 -> view.printStateArea();
                case 4 -> view.printRegionCount();
                case 5 -> view.printResidentsAverageAge();
                case 6 -> view.printResByLettersNumber();
                case 7 -> view.printResNamesByFirstChar();
                case 0 -> {
                    System.out.println("Bye bye!");
                    flag = false;
                }
            }
        }
    }

    @Override
    public String requestStateName() {
        return stateService.getStateName();
    }

    @Override
    public String requestCapitalName() {
        return stateService.getCapital();
    }

    @Override
    public int requestStateArea() {
        return stateService.getStateArea();
    }

    @Override
    public long requestRegionCount() {
        return stateService.regionCount();
    }

    @Override
    public int requestResidentsAverageAge() {
        return stateService.getResidentAverageAge();
    }

    @Override
    public ArrayList<Citizen> requestResByLettersNumber() {
        System.out.println("Enter number from 5 to 10");
        int letterNum = menu.sc.nextInt();
        return stateService.getResByLettersNumber(letterNum);
    }

    @Override
    public ArrayList<Citizen> requestResNamesByFirstChar() {
        System.out.println("Enter letter");
        char letter = menu.sc.next().charAt(0);
        return stateService.getResNamesByFirstChar(letter);
    }
}
