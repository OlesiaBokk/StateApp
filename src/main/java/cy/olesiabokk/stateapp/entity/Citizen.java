package cy.olesiabokk.stateapp.entity;

import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

public class Citizen {
    private long id;
    private static AtomicLong counter = new AtomicLong(0);

    private String name;
    private String surname;
    private int age;
    private State state;

    public Citizen() {
        this.id = createID();
        this.name = createName();
        this.surname = createName();
    }

    private static long createID() {
        return counter.addAndGet(1);
    }

    private String createName() {
        char[] strName = new char[getRandomNumber()];
        for (int i = 0; i < strName.length; i++) {
            strName[i] = getRandomChar();
        }
        return name = String.valueOf(strName);
    }

    private char getRandomChar() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }

    private int getRandomNumber() {
        Random random = new Random();
        return (4 + random.nextInt(11 - 4));
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
