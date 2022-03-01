package com.joseloya.Monster;

public class Monster implements IMonster {
    private String name;

    public Monster(String name){
        this.name = name;
    }

    @Override
    public String attack(){
        return "!^_&^$@+%$* I don't know how to attack!";
    }
}
