package cy.olesiabokk.stateapp.util;

import java.util.Random;

public class Generator {
    private final Random random = new Random();

    private char getRandomChar() {
        return (char) (random.nextInt(26) + 'a');
    }

    public int getRandomNumber() {
        return random.nextInt();
    }

    public int getRandomNumber(int from, int to) {
        int randomNum = getRandomNumber();
        if (randomNum < from || randomNum > to) {
            randomNum = (from + random.nextInt(to - from));
        }
        return randomNum;
    }

    public String generateName() {
        int randomNum = getRandomNumber(5, 10);
        char[] strName = new char[randomNum];
        for (int i = 0; i < strName.length; i++) {
            strName[i] = getRandomChar();
        }
        return String.valueOf(strName);
    }

    public int generateCitizenAge() {
        return getRandomNumber(0, 100);
    }
}
