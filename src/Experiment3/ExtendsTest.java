package Experiment3;

public class ExtendsTest {
    public static void main(String[] args) {
        String name = "波斯猫";
        Cat cat = new Cat(name);
        cat.shout();
    }
}

class Animal {
    String animalName;
    public void shout(){
        System.out.println(Animal.this.animalName+"发出叫声");
    }
}

class Cat extends Animal{
    public Cat(String catName){
        Cat.this.animalName = catName;
    }
}
