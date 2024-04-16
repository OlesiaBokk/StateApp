package cy.olesiabokk.stateapp.model.entity;

public class Capital extends City {
    private static Capital instance;

    private Capital(String name) {
        super(name);
    }

    public static Capital getInstance(String name) {
        if (instance == null) {
            instance = new Capital(name);
        }
        return instance;
    }
}
