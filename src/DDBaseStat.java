public abstract class DDBaseStat implements DDBaseStatInterface {

    String species; // nazwa
    String name;
    byte sil; // sila
    byte zrc; // zrecznosc
    byte kon; // kondycja
    byte inte; // inteligencja
    byte mdr; // madrosc
    byte cha; // charyzma
    int pd; // punkty doswiadczenia

    int kp; // klasa pancerza
    int pw; // punkty wytrzymalosci
    int speed; // szybkosc

    @Override
    public int modificator(int stat) {

        if(stat == 1){
            return -5;
        }else if(stat >= 2 && stat <= 3){
            return -4;
        }else if(stat >= 4 && stat <= 5){
            return  -3;
        }else if(stat >= 6 && stat <= 7){
            return  -2;
        }else if(stat >= 8 && stat <= 9){
            return  -1;
        }else if(stat >= 10 && stat <= 11){
            return  0;
        }else if(stat >= 12 && stat <= 13){
            return  1;
        }else if(stat >= 14 && stat <= 15){
            return  2;
        }else if(stat >= 16 && stat <= 17){
            return  3;
        }else if(stat >= 18 && stat <= 19){
            return  4;
        }else if(stat >= 20 && stat <= 21){
            return  5;
        }else if(stat >= 22 && stat <= 23){
            return  6;
        }else if(stat >= 24 && stat <= 25){
            return  7;
        }else if(stat >= 26 && stat <= 27){
            return  8;
        }else if(stat >= 28 && stat <= 29) {
            return 9;
        }else if(stat == 20){
            return  10;
        } else return 0;
    }
}
