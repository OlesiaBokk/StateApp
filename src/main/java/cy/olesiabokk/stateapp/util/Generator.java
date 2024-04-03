package cy.olesiabokk.stateapp.util;

import java.util.Random;

public class Generator {
    private Random random = new Random();

    private char getRandomChar() {
        return (char) (random.nextInt(26) + 'a');
    }

    private int getRandomNumber() {
        return random.nextInt();
    }
    public String generateName() {
        int randomNum = getRandomNumber();
        if (randomNum < 5 || randomNum > 10) {
            randomNum = (4 + random.nextInt(11 - 4));
        }
        char[] strName = new char[randomNum];
        for (int i = 0; i < strName.length; i++) {
            strName[i] = getRandomChar();
        }
        return String.valueOf(strName);
    }

    public int generateCitizenAge(){
        int randomAge = getRandomNumber();
        if(randomAge > 100 || randomAge == 0){
            randomAge = (1 + random.nextInt(100 - 1));
        }
        return randomAge;
    }
}
