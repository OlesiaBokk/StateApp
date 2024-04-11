package cy.olesiabokk.stateapp.main;

import cy.olesiabokk.stateapp.controller.ControllerImpl;
import cy.olesiabokk.stateapp.model.service.StateServiceImpl;
import cy.olesiabokk.stateapp.view.ViewImpl;

public class Main {
    public static void main(String[] args) {
        StateServiceImpl stateServiceImpl = new StateServiceImpl();
        ControllerImpl controllerImpl = new ControllerImpl();
        ViewImpl viewImpl = new ViewImpl(controllerImpl);
        controllerImpl.setStateService(stateServiceImpl);
        controllerImpl.setViewInterface(viewImpl);
        controllerImpl.menu.sayHello();
        controllerImpl.menu.printICanDo();
        controllerImpl.select();
    }


}
