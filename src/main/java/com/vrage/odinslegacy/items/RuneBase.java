package com.vrage.odinslegacy.items;

public class RuneBase extends ItemBase{
    String runeType;

    public RuneBase(String runeWorld){
        super();
        runeType = runeWorld;
    }

    public RuneBase(){
        super();
        runeType = "";
    }

    public String getRuneType(){
        return runeType;
    }
}
