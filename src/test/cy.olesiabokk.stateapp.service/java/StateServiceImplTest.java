import cy.olesiabokk.stateapp.model.entity.Citizen;
import cy.olesiabokk.stateapp.model.service.StateServiceImpl;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class StateServiceImplTest {
    TestEntityGenerator testEntityGenerator = new TestEntityGenerator();
    StateServiceImpl stateService = new StateServiceImpl(testEntityGenerator);

    @BeforeClass
    public StateServiceImpl createData() {
        return stateService;
    }

    @Test
    public void positiveResidentAgeTest() {
        Assert.assertEquals(stateService.getResidentAverageAge(), 34);
    }

    @Test
    public void singleResByLetterNumber() {
        ArrayList<Citizen> citList = stateService.getResByLettersNumber(7);
        Assert.assertEquals(citList.size(), 1);
        Assert.assertEquals(citList.get(0).getName().length(), 7);
    }

    @Test
    public void threeResByLetterNumber() {
        ArrayList<Citizen> citList = stateService.getResByLettersNumber(6);
        Assert.assertEquals(citList.size(), 3);
        Assert.assertEquals(citList.get(1).getName().length(), 6);
    }

    @Test
    public void overborderResByLetterNumber(){
        ArrayList<Citizen> citList = stateService.getResByLettersNumber(20);
        Assert.assertEquals(citList.size(), 0);
    }

    @Test
    public void zeroResByLetterNumber(){
        ArrayList<Citizen> citList = stateService.getResByLettersNumber(0);
        Assert.assertEquals(citList.size(), 0);
    }

    @Test
    public void negativeNumResByLettersNumber(){
        ArrayList<Citizen> citList = stateService.getResByLettersNumber(-1);
        Assert.assertEquals(citList.size(), 0);
    }

    @Test
    public void positiveResNamesByFirstChar(){
        ArrayList<Citizen> citList = stateService.getResNamesByFirstChar('a');
        Assert.assertEquals(citList.size(), 2);
        Assert.assertEquals(citList.getFirst().getName().charAt(0), 'a');
    }

    @Test
    public void unicodeCharResNamesByFirstChar(){
        ArrayList<Citizen> citList = stateService.getResNamesByFirstChar('\u0067');
        Assert.assertEquals(citList.size(), 1);
    }

    @Test
    public void negativeResNamesByFirstChar(){
        ArrayList<Citizen> citList = stateService.getResNamesByFirstChar('r');
        Assert.assertEquals(citList.size(), 0);
    }

    @Test
    public void unicodeNegativeResNamesByFirstChar(){
        ArrayList<Citizen> citList = stateService.getResNamesByFirstChar('\u0050');
        Assert.assertEquals(citList.size(), 0);
    }

    @Test
    public void nonLetterSymbResNamesByFirstChar(){
        ArrayList<Citizen> citList = stateService.getResNamesByFirstChar('+');
        Assert.assertEquals(citList.size(), 0);
    }

    @Test
    public void nullSymbResNamesByFirstChar(){
        ArrayList<Citizen> citList = stateService.getResNamesByFirstChar('\u0000');
        Assert.assertEquals(citList.size(), 0);
    }

    @AfterClass
    public void tierDown() {
        stateService = null;
    }
}
