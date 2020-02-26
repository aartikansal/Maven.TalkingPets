package io.zipcoder.polymorphism;


public class Cat extends Pet {
    public Cat(){
            setName("Default Name");
        }

        public Cat(String name){
            setName(name);
        }

    public String speak() {

        return "meow";
    }
}


