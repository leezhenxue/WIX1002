package viva3;

import java.util.Random;

public class HeroParty {
    private Hero[] heroList;
    
    public HeroParty(Hero[] heroList) {
        this.heroList = heroList;
    }
    
    //Bubble sort
    public void sortList() {
        Hero temp;
        boolean swapped;
        for(int i = 0; i < heroList.length; i++) {
            swapped = false;
            for(int j = 0; j < heroList.length - 1; j++) {
                if(heroList[j].getPower() > heroList[j + 1].getPower()) {
                    temp = heroList[j];
                    heroList[j] = heroList[j + 1];
                    heroList[j + 1] = temp;
                    swapped = true;
                }
            }
           
            if(!swapped){
                break;//Break the loop if nothing is swapped
            }
        }
    }
    
    public void battleWinners(Monster enemy) {
        for(Hero hero : heroList) {
            int elementResistance;
            double damageDealt;
            
            switch(hero.getElement()) {
                case "Pyro":
                    elementResistance = enemy.getPyroResistance();
                    break;
                case "Cyro":
                    elementResistance = enemy.getCryoResistance();
                    break;
                case "Hydro":
                    elementResistance = enemy.getHydroResistance();
                    break;
                case "Electro":
                    elementResistance = enemy.getElectroResistance();
                    break;
                default:
                    elementResistance = 0;
            }
            
            damageDealt = hero.getPower() * ((double)(100 - elementResistance)/100);
            
            if(damageDealt >= enemy.getHealthPoint()) {
                System.out.println(hero.getName());
            }
        }
    }
    
    public void battleBoss(Monster boss) {
        double maxDamageDealt = -1;
        String nameOfHero_1 = "";
        String nameOfHero_2 = "";
        
        for(int i = 0; i < heroList.length - 1; i++) {
            for(int j = i + 1; j < heroList.length; j++) {
                int elementResistanceFromHero_1;
                int elementResistanceFromHero_2;
                double damageDealtByHero_1;
                double damageDealtByHero_2;
                double extraDamage = 0;
                double totalDamageDealt;
                Hero hero_1;
                Hero hero_2;
                Random random = new Random();

                for (int k = 0; k < 2; k++) {
                    extraDamage = 0;
                    if(k == 0) {
                        hero_1 = heroList[i];
                        hero_2 = heroList[j];
                    }else{
                        hero_1 = heroList[j];
                        hero_2 = heroList[i];
                    }
                    switch (hero_1.getElement()) {
                        case "Pyro":
                            elementResistanceFromHero_1 = boss.getPyroResistance();
                            break;
                        case "Cyro":
                            elementResistanceFromHero_1 = boss.getCryoResistance();
                            break;
                        case "Hydro":
                            elementResistanceFromHero_1 = boss.getHydroResistance();
                            break;
                        case "Electro":
                            elementResistanceFromHero_1 = boss.getElectroResistance();
                            break;
                        default:
                            elementResistanceFromHero_1 = 0;
                    }

                    damageDealtByHero_1 = hero_1.getPower() * ((double) (100 - elementResistanceFromHero_1) / 100);
                    
                    switch (hero_2.getElement()) {
                        case "Pyro":
                            elementResistanceFromHero_2 = boss.getPyroResistance();
                            break;
                        case "Cyro":
                            elementResistanceFromHero_2 = boss.getCryoResistance();
                            break;
                        case "Hydro":
                            elementResistanceFromHero_2 = boss.getHydroResistance();
                            break;
                        case "Electro":
                            elementResistanceFromHero_2 = boss.getElectroResistance();
                            break;
                        default:
                            elementResistanceFromHero_2 = 0;
                    }

                    damageDealtByHero_2 = hero_2.getPower() * ((double) (100 - elementResistanceFromHero_2) / 100);

                    if (hero_1.getElement().equals("Pyro") && hero_2.getElement().equals("Hydro")) {
                        damageDealtByHero_1 *= 1.5;
                    } else if (hero_1.getElement().equals("Pyro") && hero_2.getElement().equals("Cryo")) {
                        damageDealtByHero_1 *= 2.0;
                    } else if (hero_1.getElement().equals("Pyro") && hero_2.getElement().equals("Electro")) {
                        extraDamage = random.nextInt(50, 101);
                    } else if (hero_1.getElement().equals("Hydro") && hero_2.getElement().equals("Electro")) {
                        extraDamage = random.nextInt(1, 21) * 5;
                    } else if (hero_1.getElement().equals("Electro") && hero_2.getElement().equals("Cryo")) {
                        damageDealtByHero_2 = hero_2.getPower() * ((double) (100 - elementResistanceFromHero_2 - 10) / 100);
                    }

                    totalDamageDealt = damageDealtByHero_1 + damageDealtByHero_2 + extraDamage;
                    if (totalDamageDealt > maxDamageDealt) {
                        maxDamageDealt = totalDamageDealt;
                        nameOfHero_1 = hero_1.getName();
                        nameOfHero_2 = hero_2.getName();
                    }
                }
            }
        }

        System.out.println("The pair with the highest damage: " + nameOfHero_1 + " and " + nameOfHero_2);
        System.out.printf("Total damage dealt: %.1f", maxDamageDealt);
    }
}
