package cy.olesiabokk.stateapp.entity;

public class City {

    private static City instance;

    private City(){}

    public static City getInstance(){
        if(instance == null){
            instance = new City();
        }
        return instance;
    }
}
