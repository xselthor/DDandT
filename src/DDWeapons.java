public class DDWeapons implements DDWeaponsInterface {

    double weight;
    double range;
    double maxRange;
    int priceSZ;
    int priceSS;
    int priceSM;

    @Override
    public int LongSword(boolean freeHand) {

        range = 1.5;
        weight = 1.5;
        priceSZ = 15;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();
        if (freeHand) {
            return dice.rollD10();
        } else {
            return dice.rollD8();
        }
    }

    @Override
    public int shortSword() {

        range = 1.5;
        weight = 1.0;
        priceSZ = 15;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();
        return dice.rollD6();
    }

    @Override
    public int warHammer(boolean freeHand) {

        range = 1.5;
        weight = 1;
        priceSZ = 15;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();
        if (freeHand) {
            return dice.rollD10();
        } else {
            return dice.rollD8();
        }
    }

    @Override
    public int twoHandSword() {

        range = 1.5;
        weight = 3;
        priceSZ = 10;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();
        return 2 * dice.rollD6();
    }

    @Override
    public int dagger() {

        range = 1.5;
        weight = 0.5;
        priceSZ = 2;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();

        return dice.rollD4();
    }

    @Override
    public int shortBow() {

        range = 24;
        maxRange = 96;
        priceSZ = 25;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();

        return dice.rollD6();
    }

    @Override
    public int longBow() {

        range = 45;
        maxRange = 180;
        priceSZ = 50;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();

        return dice.rollD8();
    }

    @Override
    public int handCrossbow() {

        range = 36;
        maxRange = 180;
        priceSZ = 50;
        priceSS = 0;
        priceSM = 0;

        DDDice dice = new DDDice();

        return dice.rollD6();
    }
}
