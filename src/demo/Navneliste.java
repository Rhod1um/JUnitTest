package demo;

import java.util.ArrayList;

public class Navneliste {

    private ArrayList <String> names = new ArrayList<>();

    public void addNames(String name){
        names.add(name);
    } //skal have ny metode til at teste da denne er void. De andre klasser /calculator, equalizer)
    // har metoder der returnere noget
    //og derfor man kan kalde dem og teste dem direkte i testklassen. men er den void skal man lave en
    //ny metode som returnere noget man vil teste

    public int getSize(){
        int size = names.size();
        return size;
    }
}
