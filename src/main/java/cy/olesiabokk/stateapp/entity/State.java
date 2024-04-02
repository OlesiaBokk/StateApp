package cy.olesiabokk.stateapp.entity;

public class State {
    private static State instance;

    private  State() {}

    public static State getInstance(){
        if (instance == null){
            instance = new State();
        }
        return instance;
    }
}
