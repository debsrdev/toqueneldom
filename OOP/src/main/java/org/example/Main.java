import org.example.dragonball.Sayajins;
import org.example.dragonball.Human;

public class Main {
    public static void main(String[] args) {
        Sayajins goku = new Sayajins("Goku", "sí", "negro", 6, 12);
        System.out.println(goku.getAge());
        goku.setAge(24); //Goku age in the second dragon ball (dragon ball z)
        System.out.println(goku.getAge());
        Sayajins vegeta = new Sayajins("Vegeta", "sí", "negro", 5, 17);
        vegeta.setAge(29); //Vegeta age in the second dragon ball (dragon ball z)

        System.out.println(goku.introduce());
        System.out.println(vegeta.introduce());

        Human bulma = new Human("Bulma", 16,"una chica", "radar del dragón", "amiga y futura pareja");
        bulma.setAge(28); //Bulma age in the second dragon ball (dragon ball z)
        Human maestroKami = new Human("Maestro Kame", 3000,"un señor mayor", "bastón mágico", "mestre");

        System.out.println(bulma.introduce());
        System.out.println(maestroKami.introduce());
    }
}
