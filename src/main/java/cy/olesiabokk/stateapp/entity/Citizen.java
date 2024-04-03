package cy.olesiabokk.stateapp.entity;

import cy.olesiabokk.stateapp.util.Generator;

import java.util.concurrent.atomic.AtomicLong;

public class Citizen {
    private static AtomicLong counter = new AtomicLong(0);
    private final long id;
    private String name;
    private String surname;
    private int age;
    private City city;
    private State state;

    public Citizen() {
        Generator generator = new Generator();
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
