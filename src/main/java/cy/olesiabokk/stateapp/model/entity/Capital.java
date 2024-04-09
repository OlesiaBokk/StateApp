package cy.olesiabokk.stateapp.model.entity;

public class Capital extends City {
    private static Capital instance;

    private Capital() {
        super();
    }

    public static Capital getInstance() {
        if (instance == null) {
            instance = new Capital();
        }
        return instance;
    }
}
