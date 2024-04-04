package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.entity.interfaces.General;
import cy.olesiabokk.stateapp.util.Generator;

public class City implements General {
    private String name;
    private static String capital;
    private Generator generator = new Generator();

    public City() {
        this.name = generator.generateName();
        if(capital == null){
            this.capital = generator.generateName();
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
