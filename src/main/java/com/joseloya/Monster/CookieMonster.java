package com.joseloya.Monster;

public class CookieMonster extends Monster{
    public CookieMonster(String name){super(name);}

    @Override
    public String attack(){
        return "Attack with cookies!";
    }
}
