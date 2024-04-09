package cy.olesiabokk.stateapp.model.entity;

import cy.olesiabokk.stateapp.model.entity.interfaces.General;
import cy.olesiabokk.stateapp.model.util.Generator;

import java.util.concurrent.atomic.AtomicLong;

public class Citizen implements General {
    private static AtomicLong counter = new AtomicLong(0);
    private final long id;
    private String name;
    private String surname;
    private int age;

    private City city;
    private State state;
    private Generator generator = new Generator();

    public Citizen() {
        this.id = createID();
        this.name = generator.generateName();
        this.surname = generator.generateName();
        this.age = generator.generateCitizenAge();
        this.state = State.getInstance();
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
}
