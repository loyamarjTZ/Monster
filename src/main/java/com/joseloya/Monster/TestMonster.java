package com.joseloya.Monster;

public class TestMonster {
    public static void main(String[] args) {

        //monster array
        Monster[] monsters = {
                new FireMonster("r2u2"),
                new WaterMonster("u2r2"),
                new StoneMonster("r2u2"),
                new CookieMonster("cookie")
        };
        MonsterHandler.handleMonsters(monsters);

    }
}
