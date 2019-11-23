import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DDMonsters extends DDBaseStat implements DDMonstersInterface {

    List<DDMonsters> monstersList = new ArrayList<>();

    @Override
    public String genMonsterName() {

        String[] namesA = {"Ball", "Nor", "Set", "Ur", "Mag", "Ug", "Zur", "Not", "Gul", "Zorg"};
        String[] namesB = {"zog", "tur", "nur"};
        String[] namesC = {"sot", "mot", "dur", "mul", "rug", "mo", "ar", "po", "wer"};

        Random los = new Random();

        String name = "";

        switch (los.nextInt(3) + 1) {
            case 1:
                name = namesA[los.nextInt(namesA.length)];
                break;
            case 2:
                name = namesA[los.nextInt(namesA.length)] + namesB[los.nextInt(namesB.length)];
                break;
            case 3:
                name = namesA[los.nextInt(namesA.length)] + namesB[los.nextInt(namesB.length)] + namesC[los.nextInt(namesC.length)];
                break;
        }

        return name;
    }

    @Override
    public void genMonstersList(int hawMany) {

        for (int i = 0; i < hawMany; i++) {

            DDMonsters monster = new DDMonsters();

            DDDice dice = new DDDice();

            switch (dice.rollUni(5)) {
                case 1:
                    monster.mmGoblin();
                    break;
                case 2:
                    monster.mmGnoll();
                    break;
                case 3:
                    monster.mmSzkielet();
                    break;
                case 4:
                    monster.mmKobold();
                    break;
                case 5:
                    monster.mmOrk();
                    break;
            }

            monstersList.add(monster);
        }
    }

    @Override
    public void showMonsterStat() {
        System.out.print("| Gatunek: " + species + " Imię: " + name + " |\n| Sił: " + sil + " ZRC: " + zrc + " KON: " + kon + " INT: " + mdr + " CHA: " + cha);
        System.out.println("| Pancerz: " + kp + " Wytrzymalośći: " + pw + " Szybkość: " + speed);
        System.out.println("----------------------------------------------------");
    }

    @Override
    public void mmGoblin() {
        species = "Goblin";
        name = genMonsterName();
        sil = 8;
        zrc = 14;
        kon = 10;
        inte = 10;
        mdr = 8;
        cha = 8;
        pd = 50;
        kp = 15;
        speed = 9;

        DDDice dice = new DDDice();
        pw = 2 * dice.rollD6();
    }

    @Override
    public void mmSzkielet() {
        species = "Szkielet";
        name = genMonsterName();
        sil = 10;
        zrc = 14;
        kon = 15;
        inte = 6;
        mdr = 8;
        cha = 5;
        pd = 50;
        kp = 13;
        speed = 9;

        DDDice dice = new DDDice();
        pw = 2 * dice.rollD8() + 4;
    }

    @Override
    public void mmGnoll() {
        species = "Gnoll";
        name = genMonsterName();
        sil = 14;
        zrc = 12;
        kon = 11;
        inte = 6;
        mdr = 10;
        cha = 7;
        pd = 100;
        kp = 15;
        speed = 9;

        DDDice dice = new DDDice();
        pw = 5 * dice.rollD8();
    }

    @Override
    public void mmKobold() {
        species = "Kobold";
        name = genMonsterName();
        sil = 7;
        zrc = 15;
        kon = 9;
        inte = 8;
        mdr = 7;
        cha = 8;
        pd = 25;
        kp = 12;
        speed = 9;

        DDDice d = new DDDice();
        pw = 2 * d.rollD6() - 2;
    }

    @Override
    public void mmOrk() {
        species = "Ork";
        name = genMonsterName();
        sil = 16;
        zrc = 12;
        kon = 16;
        inte = 7;
        mdr = 11;
        cha = 10;
        pd = 100;
        kp = 13;
        speed = 9;

        DDDice d = new DDDice();
        pw = 2 * d.rollD8() + 6;
    }

    @Override
    public void mmTroll() {
        species = "Troll";
        name = genMonsterName();
        sil = 18;
        zrc = 13;
        kon = 20;
        inte = 7;
        mdr = 9;
        cha = 7;
        pd = 1800;
        kp = 15;
        speed = 9;

        DDDice d = new DDDice();
        pw = 8 * d.rollD10() + 40;

    }
}
