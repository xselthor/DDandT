import java.util.Random;

public class DDDice implements DDDiceInterface {

    @Override
    public int rollUni(int d) {
        Random r = new Random();
        return r.nextInt(d)+1;
    }

    @Override
    public int rollD4() {
        Random r = new Random();
        return r.nextInt(4)+1;
    }

    @Override
    public int rollD6() {
        Random r = new Random();
        return r.nextInt(6)+1;
    }

    @Override
    public int rollD8() {
        Random r = new Random();
        return r.nextInt(8)+1;
    }

    @Override
    public int rollD10() {
        Random r = new Random();
        return r.nextInt(10)+1;

    }

    @Override
    public int rollD100() {
        Random r = new Random();
        return r.nextInt(100)+1;
    }

    @Override
    public int rollD20() {
        Random r = new Random();
        return r.nextInt(20)+1;
    }
}
