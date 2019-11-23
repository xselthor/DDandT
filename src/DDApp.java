import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DDApp {
    private static Object ArrayList;

    public static void main(String[] args){

        DDHero hero = new DDHero();
        hero.genHero("Hektor");

        DDMonsters monster = new DDMonsters();

        monster.genMonstersList(50);

//        System.out.println(monster.monstersList.size());
//        System.out.println(monster.monstersList.get(30).name);
//
//        String[] namesB = {"zog", "tur", "nur"};
//
//        System.out.println(namesB.length);
//
//        Random r = new Random();
        for(int i = 0; i<20;i++){
            System.out.println(monster.monstersList.get(i).species+" "+monster.monstersList.get(i).name);
        }


        //hero.showHeroStat();
/*
        List<DDMonsters> monsters = new ArrayList<>();

        for(int i=0; i<5; i++){

            DDMonsters monster = new DDMonsters();
            monster.goblin();
            monsters.add(monster);
        }

        System.out.println(monsters.size());
*/

/*

        for (var element :  monsters) {
            System.out.println(element.name+element.species+element.pw);
        }
*/
/*

        System.out.println(monsters.get(0).name);
        monsters.remove(2);
        System.out.println(monsters.size());
*/

    }


}
