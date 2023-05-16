package by.itacademy.katerinashidlovskaya.javabasics.oop;

public class Main {
    public static void main(String[] args) {

        Cupboard cupboard = new Cupboard();
        cupboard.type = "Для офиса";
        cupboard.height = 180;
        cupboard.width = 120;
        cupboard.material = "ЛДСП";

        Shelf shelf = new Shelf();
        shelf.number = 14;
        shelf.material = "ЛДСП";
        shelf.hasIllumination = true;

        Door door = new Door();
        door.number = 2;
        door.type = "Распашные";
        door.material = "Стекло";
        door.hasDoorKnob = true;
        door.hasMirror = false;
    }
}