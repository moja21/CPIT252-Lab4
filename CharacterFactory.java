
package com.mycompany.factorybuilder;

public class CharacterFactory {

    
    public static Characters createCharacter(CharacterTypes type, String name) {
        if (name.equalsIgnoreCase("Legolas")) {
            return new Archer(name);
        }
        if (name.equalsIgnoreCase("Frodo")) {
            return new FlagBearer(name);
        }
        if (name.equalsIgnoreCase("Aragorn")) {
            return new Knight(name);
        }
        return null;

    }

}
