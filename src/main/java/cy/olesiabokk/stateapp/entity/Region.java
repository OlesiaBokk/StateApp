package cy.olesiabokk.stateapp.entity;

public class Region {
    private static Region instance;

    private Region() {
    }

    public static Region getInstance() {
        if (instance == null) {
            instance = new Region();
        }
        return instance;
    }
}
