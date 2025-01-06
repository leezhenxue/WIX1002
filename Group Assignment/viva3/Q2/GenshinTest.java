package viva3;

public class GenshinTest {

    public static void main(String[] args) {
        Hero amber = new Hero("Amber", "Pyro", 80.0);
        Hero kaeya = new Hero("Kaeya", "Cryo", 60.0);
        Hero lisa = new Hero("Lisa", "Electro", 100.0);
        Hero barbara = new Hero("Barbara", "Hydro", 40.0);

        Hero[] heroList = {amber, kaeya, lisa, barbara};
        HeroParty party = new HeroParty(heroList);
        party.sortList();

        System.out.println("List of heroes based on power: ");
        for (Hero hero : heroList) {
            System.out.println(hero.getName());
        }

        Monster mitachurl = new Monster("Mitachurl", 10, 10, 10, 10,
                80.0);

        System.out.println("\nHeroes that will win against "
                + mitachurl.getName());
        party.battleWinners(mitachurl);

        System.out.println();
        Monster cryoRegisvine = new Monster("Cryo Regisvine", 20, 20, 20,
                40, 200.0);
        party.battleBoss(cryoRegisvine);
    }
}
