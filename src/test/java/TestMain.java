import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class TestMain {


    @Test
    public void correctBlsToGal() {
        Assertions.assertEquals(168.0, Main.result("bls -> gal", 4.0));
    }

    @Test
    public void correctBlsToL() {
        Assertions.assertEquals(317.94, Main.result("bls -> l", 2.0));
    }

    @Test
    public void incorrectBlsToL() {
        Assertions.assertNotEquals(100.0, Main.result("bls -> l", 2.0));
    }

    @Test
    public void correctGalToBls() {
        Assertions.assertEquals(0.24, Main.result("gal -> bls", 10.0));
    }

    @Test
    public void correctGalToL() {
        Assertions.assertEquals(7.57, Main.result("gal -> l", 2.0));
    }

    @Test
    public void correctLToBls() {
        Assertions.assertEquals(1.26, Main.result("l -> bls", 200.0));
    }

    @Test
    public void correctLToGal() {
        Assertions.assertEquals(1.32, Main.result("l -> gal", 5.0));
    }

    @Test
    public void incorrectType() {
        Assertions.assertEquals(-1.0, Main.result("idk -> something", 10.0));
    }
}
