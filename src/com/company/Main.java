package com.company;

public class Main {

    public static void main(String[] args) {
	OrcSoldier orcSoldier = new OrcSoldier();
	ElfSoldier elfSoldier = new ElfSoldier();
	Bomb bomb = new Bomb();

	System.out.println("The orc says: " + orcSoldier.speak());
    System.out.println("The elf says: " + elfSoldier.speak());
    System.out.println(orcSoldier.eat());
    System.out.println(elfSoldier.eat());
    System.out.println(orcSoldier.shoot());
    System.out.println(elfSoldier.shoot());
    System.out.println(bomb.toString());
    System.out.println(orcSoldier.headbutt());
    System.out.println(elfSoldier.headbutt());
    // And so on...

    }

}
