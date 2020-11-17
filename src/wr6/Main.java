package wr6;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Cat cat1 = new Cat("Василий");
        Cat cat2 = new Cat("Амур");

        Sobaka dog1 = new Sobaka("Бакстер");
        Sobaka dog2 = new Sobaka("Граф");

        cat1.info();
        cat2.info();

        System.out.println();

        dog1.info();
        dog2.info();

        System.out.println();

        dog1.run(400);
        dog1.swim(5);
        dog1.jump(0.3);

        System.out.println();

        cat1.run(1700);
        cat1.swim(5);
        cat1.jump(1.7);

    }
}
class Pets{
    String name;
    String type;
    int maxRun;
    int maxSwim;
    double maxJump;
    public Random rnd=new Random();


    public Pets(String name)
    {
        this.name=name;
    }
    public void run(int rasstojanije)
    {
        if (this.maxRun>=rasstojanije)
        {
            System.out.println(this.type + "\n "+ this.name + "\n" + rasstojanije + "\n");
        }
        else {
            System.out.println(this.type +"\n"+this.name+"\nне может бежать так далеко");

        }
    }
    public void jump(double visota){
        if (this.maxJump>=visota)
        {
            System.out.println(this.type + "\n "+ this.name + "\n" + visota + "\n");
        }
        else {
            System.out.println(this.type +"\n"+this.name+"\nне может прыгать так далеко");

        }
    }
    public void swim(int rasstojanije){
        if (this.maxSwim>=rasstojanije)
        {
            System.out.println(this.type + "\n "+ this.name + "\n" + rasstojanije + "\n");
        }
        else {
            System.out.println(this.type +"\n"+this.name+"\nне может плыть так далеко");

        }

    }

    public void info(){
        System.out.println(this.type + "\n " + this.name + "\nБег в метрах" +this.maxRun+"\nВысота прыжка в метрах"+this.maxJump+"\nМакстмальная дистанция пдавания в метрах"+this.maxSwim);
    }
}

class Sobaka extends Pets{


    public Sobaka(String name) {
        super(name);
        this.maxRun = rnd.nextInt(300) + 300;
        this.maxSwim = rnd.nextInt(6) + 5;
        this.maxJump = Math.random() * (0.5-0.1) + 0.1;
        this.type="Dog";
    }
}

class Cat extends Pets
{
    public Cat(String name)
    {
        super(name);
        this.maxJump=Math.random()*(2.0-0.5)+0.5;
        this.type="Cat";
        this.maxRun=rnd.nextInt(40)+160;

//public void swim(){

// }

    }

}