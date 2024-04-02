package cy.olesiabokk.stateapp.entity;

public class District {
    private static District instance;

    private District(){}

    public static District getInstance(){
        if(instance == null){
            instance = new District();
        }
        return instance;
    }
}
