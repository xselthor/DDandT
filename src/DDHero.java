import java.util.ArrayList;
import java.util.List;

public class DDHero extends DDBaseStat implements DDHeroInterface, DDBaseAction {

    byte lvl;
    int SZ;
    int SS;
    int SM;

    List<String> backpack = new ArrayList<>();

    String leftHand;
    String rightHand;
    String Head;
    String Chest;
    String Legs;
    String Shoes;

    void DDHero(){

        lvl = 1;
    }

    @Override
    public void showHeroStat() {

        System.out.print("| Klasa: "+species+" Imię: "+name+" LVL: "+lvl+" |\n| Sił: " + sil+"("+modificator(sil)+")"+ " ZRC: " + zrc+"("+modificator(zrc)+")"+ " KON: " + kon+"("+modificator(kon)+")"+ " INT: " + mdr+"("+modificator(mdr)+")"+ " CHA: " + cha+"("+modificator(cha)+")");
        System.out.println("\n| Pancerz: "+ kp+" Wytrzymalośći: "+pw+" Szybkość: "+speed);
        System.out.println("---------------------------------------------------------");
    }

    @Override
    public void choseClass() {

    }

    @Override
    public void genHero(String nme) {
        species = "Warrior";
        name = nme;
        sil = 16;
        zrc = 9;
        kon = 15;
        inte = 11;
        mdr = 13;
        cha = 14;
        pd = 0;
        kp = 17;
        speed = 9;

        DDDice dice = new DDDice();
        pw = 12;
    }

    @Override
    public void attack() {

    }

    @Override
    public void search() {

    }

    @Override
    public void healing() {

    }
}
