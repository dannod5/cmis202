import java.util.Arrays;
import java.util.List;

class Pokemon {
    String name;
    List<String> types;

    public Pokemon(String name, List<String> types) {
        this.name = name;
        this.types = types;
    }
}

public class PokemonRecommendation {
    public static double typeAdvantage(Pokemon attacker, Pokemon defender) {
        for (String attackType : attacker.types) {
            if (defender.types.contains(attackType)) {
                return 2.0;  // Super effective
            }
        }
        return 0.5;  // Not very effective
    }

    public static String recommendPokemon(Pokemon userPokemon, Pokemon opponentPokemon) {
        double advantage = typeAdvantage(userPokemon, opponentPokemon);

        if (advantage == 2.0) {
            return userPokemon.name + " is super effective against " + opponentPokemon.name + "!";
        } else if (advantage == 0.5) {
            return userPokemon.name + " is not very effective against " + opponentPokemon.name +
                    ". Consider using a different Pokémon.";
        } else {
            return userPokemon.name + " has a neutral effectiveness against " + opponentPokemon.name + ".";
        }
    }

    public static void main(String[] args) {
        // Define some example Pokémon
        Pokemon pikachu = new Pokemon("Pikachu", Arrays.asList("Electric"));
        Pokemon charizard = new Pokemon("Charizard", Arrays.asList("Fire", "Flying"));

        // Example usage
        String recommendation = recommendPokemon(pikachu, charizard);
        System.out.println(recommendation);
    }
}
