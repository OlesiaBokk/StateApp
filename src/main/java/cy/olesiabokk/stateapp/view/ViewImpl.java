package cy.olesiabokk.stateapp.view;

import cy.olesiabokk.stateapp.controller.Controller;
import cy.olesiabokk.stateapp.model.entity.Citizen;

import java.util.ArrayList;

public class ViewImpl implements View {
    public Controller controller;

    public ViewImpl(Controller controller) {
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
        ArrayList<Citizen> citizens = controller.requestResByLettersNumber();
        for (Citizen citizen : citizens) {
            System.out.println(citizen.toString());
        }
    }

    @Override
    public void printResNamesByFirstChar() {
        ArrayList<Citizen> citizens = controller.requestResNamesByFirstChar();
        for (Citizen citizen: citizens) {
            System.out.println(citizen.toString());
        }
    }
}
