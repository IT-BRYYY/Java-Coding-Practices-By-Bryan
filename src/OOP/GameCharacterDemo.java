package OOP;

abstract class GameCharacterBase {
    protected String name;

    GameCharacterBase(String name) {
        this.name = name;
    }

    abstract void attack();
}

interface Defendable {
    void defend();
}

interface Healable {
    void heal();
}

class WarriorCharacter extends GameCharacterBase
        implements Defendable, Healable {

    WarriorCharacter(String name) {
        super(name);
    }

    @Override
    void attack() {
        System.out.println(name + " attacks the enemy!");
    }

    @Override
    public void defend() {
        System.out.println(name + " blocks the attack!");
    }

    @Override
    public void heal() {
        System.out.println(name + " restores health!");
    }
}

public class GameCharacterDemo {
    public static void main(String[] args) {
        WarriorCharacter warrior =
                new WarriorCharacter("Knight");

        warrior.attack();
        warrior.defend();
        warrior.heal();
    }
}