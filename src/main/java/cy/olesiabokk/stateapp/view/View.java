package cy.olesiabokk.stateapp.view;

import cy.olesiabokk.stateapp.controller.ControllerInterface;

public class View implements ViewInterface {
    public ControllerInterface controller;
    public View(ControllerInterface controller){
        this.controller = controller;
    }

    @Override
    public void printStateName() {
        System.out.println("State name: " + controller.requestStateName());
    }

    @Override
    public void printCapitalName() {
        System.out.println("Capital name: " + controller.requestCapitalName());
    }

    @Override
    public void printStateArea() {
        System.out.println("State area = " + controller.requestStateArea());
    }

    @Override
    public void printRegionCount() {
        System.out.println("Region amount = " + controller.requestRegionCount());
    }

    @Override
    public void printResidentsAverageAge() {
        System.out.println("Resident average age = " + controller.requestResidentsAverageAge());
    }

    @Override
    public void printResByLettersNumber() {
        System.out.println("Resident list by letters number: " + controller.requestResByLettersNumber().toString());
    }

    @Override
    public void printResNamesByFirstChar() {
        System.out.println("Resident list by first letter: " + controller.requestResNamesByFirstChar().toString());
    }

    @Override
    public String toString() {
        return "Resident name = ";
    }
}
