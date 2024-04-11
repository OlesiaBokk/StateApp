package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;
import cy.olesiabokk.stateapp.model.util.Generator;

import java.util.concurrent.atomic.AtomicLong;

public class Citizen implements General {
    private static final AtomicLong counter = new AtomicLong(0);
    private final long id;
    private final String name;
    private final String surname;
    private final int age;
    private final State state;
    private final String cityName;
    private final String districtName;
    private final String regionName;

    public Citizen(State state, String cityName, String districtName, String regionName) {
        Generator generator = new Generator();
        this.id = createID();
        this.name = generator.generateName();
        this.surname = generator.generateName();
        this.age = generator.generateCitizenAge();
        this.state = state;
        this.cityName = cityName;
        this.districtName = districtName;
        this.regionName = regionName;
    }

    private static long createID() {
        return counter.addAndGet(1);
    }

    public long getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public State getState() {
        return state;
    }

    @Override
    public String toString() {
        return "Citizen id = " + id +
                ", name = " + name + '\'' +
                ", surname = " + surname + '\'' +
                ", age = " + age +
                ", state = " + state.getName() +
                ", city = " + cityName +
                ", district = " + districtName +
                ", region = " + regionName;
    }
}
