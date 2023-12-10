import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Pokemon {
    String name;
    int generation;
    String type;
    int[] iv;

    public Pokemon(String name, int generation, String type, int[] iv) {
        this.name = name;
        this.generation = generation;
        this.type = type;
        this.iv = iv;
    }
}

public class PokemonSelector {
    public static void main(String[] args) {
        List<Pokemon> pokemonList = new ArrayList<>();
        pokemonList.add(new Pokemon("Bulbasaur", 1, "Grass/Poison", new int[]{45,49, 49, 65, 65, 45}));
        pokemonList.add(new Pokemon("Charmander", 1, "Fire", new int[]{39, 52, 43, 60, 50, 65}));
        pokemonList.add(new Pokemon("Squirtle", 1, "Water", new int[]{44, 48, 65, 50, 64, 43}));
        pokemonList.add(new Pokemon("Chikorita", 2, "Grass", new int[]{25, 20, 15, 10, 31, 25}));
        pokemonList.add(new Pokemon("Cyndaquil", 2, "Fire", new int[]{20, 15, 10, 31, 25, 20}));
        pokemonList.add(new Pokemon("Totodile", 2, "Water", new int[]{15, 10, 31, 25, 20, 15}));
        pokemonList.add(new Pokemon("ivysaur", 1, "grass/Poioson", new int[]{60, 62, 63, 80, 80, 60}));
        pokemonList.add(new Pokemon("venusaur", 1, "grass/Poioson", new int[]{80, 82, 83, 100, 100, 80}));
        pokemonList.add(new Pokemon("charmeleon", 1, "fire", new int[]{58, 64, 58, 80, 65, 80}));
        pokemonList.add(new Pokemon("charizard", 1, "fire/flying", new int[]{78, 84, 78, 109, 85, 100}));
        pokemonList.add(new Pokemon("wartortle", 1, "water", new int[]{59, 63, 80, 65, 80, 58}));
        pokemonList.add(new Pokemon("blastoise", 1, "water", new int[]{79, 83, 100, 85, 105, 78}));
        pokemonList.add(new Pokemon("caterpie", 1, "bug", new int[]{45, 30, 35, 20, 20, 45}));
        pokemonList.add(new Pokemon("bug", 1, "bug", new int[]{50, 20, 55, 25, 25, 30}));
        pokemonList.add(new Pokemon("butterfree", 1, "bug/flying", new int[]{60, 45, 50, 90, 80, 70}));
        pokemonList.add(new Pokemon("weedle", 1, "bug/Poioson", new int[]{40, 35, 30, 20, 20, 50}));
        pokemonList.add(new Pokemon("kakuna", 1, "bug/Poioson", new int[]{45, 25, 50, 25, 25, 35}));
        pokemonList.add(new Pokemon("beedrill", 1, "grass/Poioson", new int[]{65, 90, 40, 45, 80, 75}));
        pokemonList.add(new Pokemon("pidgey", 1, "normal/flying", new int[]{40, 45, 40, 35, 35, 56}));
        pokemonList.add(new Pokemon("pidgeotto", 1, "normal/flying", new int[]{63, 60, 55, 50, 50, 71}));
        pokemonList.add(new Pokemon("pidgeot", 1, "normal/flying", new int[]{83, 60, 75, 70, 70, 101}));
        pokemonList.add(new Pokemon("rattata", 1, "normal", new int[]{30, 56, 35, 25, 35, 72}));
        pokemonList.add(new Pokemon("raticate", 1, "normal", new int[]{55, 81, 60, 50, 70, 97}));
        pokemonList.add(new Pokemon("spearow", 1, "normal/flying", new int[]{40, 60, 30 ,31, 31, 70}));
        pokemonList.add(new Pokemon("fearow", 1, "normal/flying", new int[]{65, 90, 65, 61, 61, 100}));
        pokemonList.add(new Pokemon("ekans", 1, "Poioson", new int[]{35, 60, 44, 40, 54, 55}));
        pokemonList.add(new Pokemon("arbok", 1, "poison", new int[]{60, 95, 69, 65, 79, 80}));
        pokemonList.add(new Pokemon("pikachu", 1, "electric", new int[]{35, 55, 40, 50, 50, 90}));
        pokemonList.add(new Pokemon("raichu", 1, "electric", new int[]{60, 90, 55, 90, 80, 110}));
        pokemonList.add(new Pokemon("sandshrew", 1, "ground", new int[]{50, 75 ,85, 20, 30, 40}));
        pokemonList.add(new Pokemon("sandslash", 1, "ground", new int[]{75, 100, 110, 45, 55, 65}));
        pokemonList.add(new Pokemon("nidoran(female)", 1, "Poison", new int[]{55, 47, 52, 40, 40, 41}));
        pokemonList.add(new Pokemon("nidorina", 1, "Poison", new int[]{70, 62, 67, 55, 55, 56}));
        pokemonList.add(new Pokemon("nidoqueen", 1, "poison/ground", new int[]{90, 92, 87, 75, 85, 76}));
        pokemonList.add(new Pokemon("nidoran(male)", 1, "Poison", new int[]{46, 57, 40, 40, 40, 50}));
        pokemonList.add(new Pokemon("nidorino", 1, "Poison", new int[]{61, 72, 57, 55, 55, 65}));
        pokemonList.add(new Pokemon("nidoking", 1, "Poison/ground", new int[]{81, 102, 77, 85, 75, 85}));
        pokemonList.add(new Pokemon("clefairy", 1, "fairy", new int[]{70, 45, 48, 60, 65, 35}));
        pokemonList.add(new Pokemon("clefable", 1, "fairy", new int[]{95, 70, 73, 95, 90, 60}));
        pokemonList.add(new Pokemon("vulpix", 1, "fire", new int[]{38, 41, 40, 50, 65, 65}));
        pokemonList.add(new Pokemon("ninetales", 1, "fire", new int[]{73, 76, 75, 81, 100, 100}));
        pokemonList.add(new Pokemon("jigglypuff", 1, "fairy", new int[]{115, 45, 20, 45, 25, 20}));
        pokemonList.add(new Pokemon("wigglytuff", 1, "fairy", new int[]{140, 70, 45, 85, 50, 45}));
        pokemonList.add(new Pokemon("zubat", 1, "Poison/flying", new int[]{40, 45, 35, 30, 40, 55}));
        pokemonList.add(new Pokemon("golbat", 1, "Poison/flying", new int[]{75, 80, 70, 65, 75, 90}));
        pokemonList.add(new Pokemon("oddish", 1, "grass/Poison", new int[]{45, 50, 55, 75, 65, 30}));
        pokemonList.add(new Pokemon("gloom", 1, "grass/Poison", new int[]{60, 65, 70, 85, 75, 40}));
        pokemonList.add(new Pokemon("vileplume", 1, "grass/Poison", new int[]{75, 80, 85, 110, 90, 50}));
        pokemonList.add(new Pokemon("paras", 1, "bug/grass", new int[]{35, 70, 55, 45, 55, 25}));
        pokemonList.add(new Pokemon("parasect", 1, "bug/grass", new int[]{60, 95, 80, 60, 80, 30}));
        pokemonList.add(new Pokemon("venonat", 1, "bug/Poison", new int[]{60, 55, 50, 40, 55, 45}));
        pokemonList.add(new Pokemon("venomoth", 1, "bug/poison", new int[]{60, 62, 63, 80, 80, 60}));
        pokemonList.add(new Pokemon("diglett", 1, "ground", new int[]{10, 55, 25, 35, 45, 95}));
        pokemonList.add(new Pokemon("dugtrio", 1, "ground", new int[]{35, 100, 50, 50, 70, 120}));
        pokemonList.add(new Pokemon("meowth", 1, "normal", new int[]{40, 45, 35, 40, 40, 90}));
        pokemonList.add(new Pokemon("persian", 1, "normal", new int[]{65, 70, 60, 65, 65, 115}));
        pokemonList.add(new Pokemon("psyduck", 1, "water", new int[]{50, 52, 48, 65, 50, 55}));
        pokemonList.add(new Pokemon("golduck", 1, "water", new int[]{80, 82, 78, 95, 80, 85}));
        pokemonList.add(new Pokemon("mankey", 1, "fighting", new int[]{40, 80, 35, 35, 45, 70}));
        pokemonList.add(new Pokemon("primeape", 1, "fighting", new int[]{65, 105, 60, 60, 70, 85}));
        pokemonList.add(new Pokemon("growlithe", 1, "fire", new int[]{55, 70, 45, 70, 50, 60}));
        pokemonList.add(new Pokemon("arcanine", 1, "fire", new int[]{90, 110, 80, 100, 80, 95}));
        pokemonList.add(new Pokemon("poliwag", 1, "water", new int[]{40, 50, 40, 40, 40, 90}));
        pokemonList.add(new Pokemon("poliwhirl", 1, "water", new int[]{65, 65, 65, 50, 50, 90}));
        pokemonList.add(new Pokemon("poliwarath", 1, "water/fighting", new int[]{90, 95, 95, 70, 90, 70}));
        pokemonList.add(new Pokemon("abra", 1, "psychic", new int[]{25, 20, 15, 105, 55, 90}));
        pokemonList.add(new Pokemon("kadabra", 1, "psychic", new int[]{40, 35, 30, 120, 70, 105}));
        pokemonList.add(new Pokemon("alakazam", 1, "psychic", new int[]{55, 50, 45, 135, 95, 120}));
        pokemonList.add(new Pokemon("machop", 1, "fighting", new int[]{70, 80, 50, 35, 35, 35}));
        pokemonList.add(new Pokemon("machoke", 1, "fighting", new int[]{80, 100, 70, 50, 60, 45}));
        pokemonList.add(new Pokemon("machamp", 1, "fighting", new int[]{90, 130, 80, 65, 85, 55}));
        pokemonList.add(new Pokemon("bellsprout", 1, "grass/Poison", new int[]{50, 75, 35, 70, 30, 40}));
        pokemonList.add(new Pokemon("weepinbell", 1, "grass/Poison", new int[]{65, 90, 50, 85, 45, 55}));
        pokemonList.add(new Pokemon("victreebel", 1, "grass/Poison", new int[]{80, 105, 65, 100, 70, 70}));
        pokemonList.add(new Pokemon("tentacool", 1, "water/Poison", new int[]{40, 40, 35, 50, 100, 70}));
        pokemonList.add(new Pokemon("tentacruel", 1, "water/Poison", new int[]{80, 70, 65, 80, 120, 100}));
        pokemonList.add(new Pokemon("geodude", 1, "rock/ground", new int[]{40, 80, 100, 30, 30, 20}));
        pokemonList.add(new Pokemon("graveler", 1, "rock/ground", new int[]{55, 95, 115, 45, 45, 35}));
        pokemonList.add(new Pokemon("golem", 1, "rock/ground", new int[]{80, 120, 130, 55, 65, 45}));
        pokemonList.add(new Pokemon("ponyta", 1, "fire", new int[]{50, 85, 55, 65, 65, 90}));
        pokemonList.add(new Pokemon("rapidash", 1, "fire", new int[]{65, 100, 70, 80, 80, 105}));
        pokemonList.add(new Pokemon("slowpoke", 1, "water/psychic", new int[]{90, 65, 65, 40, 40, 15}));
        pokemonList.add(new Pokemon("slowbro", 1, "water/psychic", new int[]{95, 75, 110, 100, 80, 30}));
        pokemonList.add(new Pokemon("magnemite", 1, "electric/steel", new int[]{25, 35, 70, 95, 55, 45}));
        pokemonList.add(new Pokemon("magneton", 1, "electric/steel", new int[]{50, 60, 95, 120, 70, 70}));
        pokemonList.add(new Pokemon("farfetch'd", 1, "normal/flying", new int[]{52, 90, 55, 58, 62, 60}));
        pokemonList.add(new Pokemon("doduo", 1, "normal/flying", new int[]{35, 85, 45, 35, 35, 75}));
        pokemonList.add(new Pokemon("dodrio", 1, "normal/flying", new int[]{60, 110, 70, 60, 60, 110}));
        pokemonList.add(new Pokemon("seel", 1, "water", new int[]{65, 45, 55, 45, 70, 45}));
        pokemonList.add(new Pokemon("dewgong", 1, "water/ice", new int[]{90, 70, 80, 70, 95, 70}));
        pokemonList.add(new Pokemon("grimer", 1, "Poison", new int[]{80, 80, 50, 40, 50, 25}));
        pokemonList.add(new Pokemon("muk", 1, "Poison", new int[]{105, 105, 75, 65, 100, 50}));
        pokemonList.add(new Pokemon("shellder", 1, "water", new int[]{30, 65, 100, 45, 25, 40}));
        pokemonList.add(new Pokemon("cloyster", 1, "water/ice", new int[]{50, 95, 180, 85, 45, 70}));
        pokemonList.add(new Pokemon("gastly", 1, "ghost/Poison", new int[]{30, 35, 30, 100, 35, 80}));
        pokemonList.add(new Pokemon("haunter", 1, "ghost/Poison", new int[]{45, 50, 45, 115, 55, 95}));
        pokemonList.add(new Pokemon("gengar", 1, "ghost/Poison", new int[]{60, 65, 60, 130, 75, 110}));
        pokemonList.add(new Pokemon("onix", 1, "rock/ground", new int[]{35, 45, 160, 30, 45, 70}));
        pokemonList.add(new Pokemon("drowzee", 1, "psychic", new int[]{60, 48, 45, 43, 90, 42}));
        pokemonList.add(new Pokemon("hypno", 1, "psychic", new int[]{85, 73, 70, 73, 115, 67}));
        pokemonList.add(new Pokemon("krabby", 1, "water", new int[]{30, 105, 90, 25, 25, 50}));
        pokemonList.add(new Pokemon("kingler", 1, "water", new int[]{55, 130, 115, 50, 50, 75}));
        pokemonList.add(new Pokemon("voltrob", 1, "electric", new int[]{40, 30, 50, 55, 55, 100}));
        pokemonList.add(new Pokemon("electric", 1, "electric", new int[]{60, 50, 70, 80, 80, 150}));
        pokemonList.add(new Pokemon("exeggcute", 1, "grass/psychic", new int[]{60, 40, 80, 60, 45, 40}));
        pokemonList.add(new Pokemon("exeggutor", 1, "grass/Psychic", new int[]{95, 95, 85, 125, 75, 55}));
        pokemonList.add(new Pokemon("cubone", 1, "ground", new int[]{50, 50, 95, 40, 50, 35}));
        pokemonList.add(new Pokemon("ivysaur", 1, "grass/Poioson", new int[]{60, 62, 63, 80, 80, 60}));
        pokemonList.add(new Pokemon("marowak", 1, "ground", new int[]{60, 80, 110, 50, 80, 45}));
        pokemonList.add(new Pokemon("hitmonlee", 1, "fighting", new int[]{50, 120, 53, 35, 110, 87}));
        pokemonList.add(new Pokemon("hitmonchan", 1, "fighting", new int[]{50, 105, 79, 35, 110, 76}));
        pokemonList.add(new Pokemon("lickitung", 1, "normal", new int[]{90, 55, 75, 60, 75, 30}));
        pokemonList.add(new Pokemon("koffing", 1, "Poison", new int[]{40, 65, 95, 60, 45, 35}));
        pokemonList.add(new Pokemon("weezing", 1, "Poison", new int[]{65, 90, 120, 85, 70, 60}));
        pokemonList.add(new Pokemon("rhyhorn", 1, "ground/rock", new int[]{80, 85, 95, 30, 30, 25}));
        pokemonList.add(new Pokemon("rhydon", 1, "ground/rock", new int[]{105, 130, 120, 45, 45, 40}));
        pokemonList.add(new Pokemon("chansey", 1, "normal", new int[]{250, 5, 5, 35, 105, 50}));
        pokemonList.add(new Pokemon("tangela", 1, "grass", new int[]{65, 55, 115, 100, 40, 60}));
        pokemonList.add(new Pokemon("kangaskhan", 1, "normal", new int[]{105, 95, 80, 40, 80, 90}));
        pokemonList.add(new Pokemon("horsea", 1, "water", new int[]{30, 40, 70, 70, 25, 60}));
        pokemonList.add(new Pokemon("seadra", 1, "water", new int[]{55, 65, 95, 95, 45, 85}));
        pokemonList.add(new Pokemon("goldeen", 1, "water", new int[]{45, 67, 60, 35, 50, 63}));
        pokemonList.add(new Pokemon("seaking", 1, "water", new int[]{80, 92, 65, 65, 80, 68}));
        pokemonList.add(new Pokemon("staryu", 1, "water", new int[]{30, 45, 55, 70, 55, 85}));
        pokemonList.add(new Pokemon("starmie", 1, "water/psychic", new int[]{60, 75, 85, 100, 85, 115}));
        pokemonList.add(new Pokemon("mr.mime", 1, "psychic/fairy", new int[]{40, 45, 65, 100, 120, 90}));
        pokemonList.add(new Pokemon("scyther", 1, "bug/flying", new int[]{70, 110, 80, 55, 80, 105}));
        pokemonList.add(new Pokemon("jynx", 1, "ice/psychic", new int[]{65, 50, 35, 115, 95, 95}));
        pokemonList.add(new Pokemon("electrabuzz", 1, "electric", new int[]{65, 83, 57, 95, 85, 105}));
        pokemonList.add(new Pokemon("magmar", 1, "fire", new int[]{65, 95, 57, 100, 85, 93}));
        pokemonList.add(new Pokemon("pinsir", 1, "bug", new int[]{65, 125, 100, 55, 70, 85}));
        pokemonList.add(new Pokemon("tauros", 1, "normal", new int[]{75, 100, 95, 40, 70, 110}));
        pokemonList.add(new Pokemon("magikarp", 1, "water", new int[]{20, 10, 55, 15, 20, 80}));
        pokemonList.add(new Pokemon("gyarados", 1, "water/flying", new int[]{95, 125, 79, 60, 100, 81}));
        pokemonList.add(new Pokemon("lapras", 1, "water/ice", new int[]{130, 85, 80, 85, 95, 60}));
        pokemonList.add(new Pokemon("ditto", 1, "normal", new int[]{48, 48, 48, 48, 48, 48}));
        pokemonList.add(new Pokemon("eevee", 1, "normal", new int[]{55, 55, 50, 45, 65, 55}));
        pokemonList.add(new Pokemon("vaporeon", 1, "water", new int[]{130, 65, 60, 110, 95, 65}));
        pokemonList.add(new Pokemon("jolteon", 1, "electric", new int[]{65, 65, 60, 110, 95, 130}));
        pokemonList.add(new Pokemon("flareon", 1, "fire", new int[]{65, 130, 60, 95, 110, 65}));
        pokemonList.add(new Pokemon("porygon", 1, "normal", new int[]{65, 60, 70, 85, 75, 40}));
        pokemonList.add(new Pokemon("omanyte", 1, "rock/water", new int[]{35, 40, 100, 90, 55, 35}));
        pokemonList.add(new Pokemon("omastar", 1, "rock/water", new int[]{70, 60, 125, 115, 70, 55}));
        pokemonList.add(new Pokemon("kabuto", 1, "rock/water", new int[]{30, 80, 90, 55, 45, 55}));
        pokemonList.add(new Pokemon("kabutops", 1, "rock/water", new int[]{60, 115, 105, 65, 70, 80}));
        pokemonList.add(new Pokemon("aerodactyl", 1, "rock/flying", new int[]{80, 105, 65, 60, 75, 130}));
        pokemonList.add(new Pokemon("snorlax", 1, "normal", new int[]{160, 110, 65, 65, 110, 30}));
        pokemonList.add(new Pokemon("articuno", 1, "ice/flying", new int[]{90, 85, 100, 95, 125, 85}));
        pokemonList.add(new Pokemon("zapdos", 1, "electric/flying", new int[]{90, 90, 85, 125, 90, 100}));
        pokemonList.add(new Pokemon("moltres", 1, "fire/flying", new int[]{90, 100, 90, 125, 85, 90}));
        pokemonList.add(new Pokemon("dratini", 1, "dragon", new int[]{41, 64, 45, 50, 50, 50}));
        pokemonList.add(new Pokemon("dragonair", 1, "dragon", new int[]{61, 84, 65, 70, 70, 70}));
        pokemonList.add(new Pokemon("dragonite", 1, "dragon", new int[]{91, 134, 95, 100, 100, 80}));
        pokemonList.add(new Pokemon("mewtwo", 1, "psychic", new int[]{106, 110, 90, 154, 90, 130}));
        pokemonList.add(new Pokemon("mew", 1, "psychic", new int[]{100, 100, 100, 100, 100, 100}));
        pokemonList.add(new Pokemon("bayleef", 2, "grass", new int[]{60, 62, 80, 63, 80, 60}));
        pokemonList.add(new Pokemon("meganium", 2, "grass", new int[]{80, 82, 100, 83, 100, 80}));
        pokemonList.add(new Pokemon("quilava", 2, "fire", new int[]{58, 64, 58, 80, 65, 80}));
        pokemonList.add(new Pokemon("typhlosion", 2, "fire", new int[]{78, 84, 78, 109, 85, 100}));
        pokemonList.add(new Pokemon("croconaw", 2, "water", new int[]{65, 80, 80, 59, 63, 58}));
        pokemonList.add(new Pokemon("feraligatr", 2, "water", new int[]{85, 105, 100, 79, 83, 78}));
        pokemonList.add(new Pokemon("sentret", 2, "normal", new int[]{35, 46, 34, 35, 45, 20}));
        pokemonList.add(new Pokemon("furret", 2, "normal", new int[]{85, 76, 64, 45, 55, 90}));
        pokemonList.add(new Pokemon("hoothoot", 2, "normal/flying", new int[]{60, 30, 30, 36, 56, 50}));
        pokemonList.add(new Pokemon("noctowl", 2, "normal/flying", new int[]{100, 50, 50, 86, 90, 70}));
        pokemonList.add(new Pokemon("ledyba", 2, "bug/flying", new int[]{40, 20, 30, 40, 80, 55}));
        pokemonList.add(new Pokemon("ledian", 2, "bug/flying", new int[]{55, 35, 50, 55, 110, 85}));
        pokemonList.add(new Pokemon("spinarak", 2, "bug/poison", new int[]{40, 60, 40, 40, 40, 30}));
        pokemonList.add(new Pokemon("ariados", 2, "bug/poison", new int[]{70, 90, 70, 60, 70, 40}));
        pokemonList.add(new Pokemon("crobat", 2, "poison/flying", new int[]{85, 90, 80, 70, 80, 130}));
        pokemonList.add(new Pokemon("chinchou", 2, "water/electric", new int[]{75, 38, 38, 56, 56, 67}));
        pokemonList.add(new Pokemon("lanturn", 2, "water/electric", new int[]{125, 58, 58, 76, 76, 67}));
        pokemonList.add(new Pokemon("pichu", 2, "electric", new int[]{20, 40, 15, 35, 35, 60}));
        pokemonList.add(new Pokemon("cleffa", 2, "fairy", new int[]{50, 25, 28, 45, 55, 15}));
        pokemonList.add(new Pokemon("igglybuff", 2, "normal/fairy", new int[]{90, 30, 15, 40, 20, 15}));
        pokemonList.add(new Pokemon("togepi", 2, "fairy", new int[]{35, 20, 65, 40, 65, 20}));
        pokemonList.add(new Pokemon("togetic", 2, "fairy/flying", new int[]{55, 40, 85, 80, 105, 40}));
        pokemonList.add(new Pokemon("natu", 2, "psychic/flying", new int[]{40, 50, 45, 70, 45, 70}));
        pokemonList.add(new Pokemon("xatu", 2, "psychic/flying", new int[]{65, 75, 70, 95, 70, 95}));
        pokemonList.add(new Pokemon("mareep", 2, "electric", new int[]{55, 40, 40, 65, 45, 35}));
        pokemonList.add(new Pokemon("flaafy", 2, "electric", new int[]{70, 55, 55, 80, 60, 45}));
        pokemonList.add(new Pokemon("ampharos", 2, "electric", new int[]{90, 75, 85, 115, 90, 55}));
        pokemonList.add(new Pokemon("bellossom", 2, "grass", new int[]{75, 80, 95, 90, 100, 50}));
        pokemonList.add(new Pokemon("marill", 2, "water/fairy", new int[]{70, 20, 50, 20, 50, 40}));
        pokemonList.add(new Pokemon("azamarill", 2, "water/fairy", new int[]{100, 50, 80, 60, 80, 50}));
        pokemonList.add(new Pokemon("sudowoodo", 2, "rock", new int[]{70, 100, 115, 30, 65, 30}));
        pokemonList.add(new Pokemon("politoed", 2, "water", new int[]{90, 75, 75, 90, 100, 70}));
        pokemonList.add(new Pokemon("hoppip", 2, "grass/flying", new int[]{35, 35, 40, 35, 55, 50}));
        pokemonList.add(new Pokemon("skiploom", 2, "grass/flying", new int[]{55, 45, 50, 45, 65, 80}));
        pokemonList.add(new Pokemon("jumpluff", 2, "grass/flying", new int[]{75, 55, 70, 55, 95, 110}));
        pokemonList.add(new Pokemon("aipom", 2, "normal", new int[]{55, 70, 55, 40, 55, 85}));
        pokemonList.add(new Pokemon("sunkern", 2, "grass", new int[]{30, 30, 30, 30, 30, 30}));
        pokemonList.add(new Pokemon("surnflora", 2, "grass", new int[]{75, 75, 55, 105, 85, 30}));
        pokemonList.add(new Pokemon("yanma", 2, "bug/flying", new int[]{65, 65, 45, 75, 45, 95}));
        pokemonList.add(new Pokemon("wooper", 2, "water/ground", new int[]{55, 45, 45, 25, 25, 15}));
        pokemonList.add(new Pokemon("quagsire", 2, "water/ground", new int[]{95, 85, 85, 65, 65, 35}));
        pokemonList.add(new Pokemon("espeon", 2, "psychic", new int[]{65, 65, 60, 130, 95, 110}));
        pokemonList.add(new Pokemon("umbreon", 2, "dark", new int[]{95, 65, 110, 60, 130, 65}));
        pokemonList.add(new Pokemon("murkrow", 2, "dark/flying", new int[]{60, 85, 42, 85, 42, 91}));
        pokemonList.add(new Pokemon("slowking", 2, "water/psychic", new int[]{95, 75, 80, 100, 110, 30}));
        pokemonList.add(new Pokemon("misdreavus", 2, "ghost", new int[]{60, 60, 60, 85, 85, 85}));
        pokemonList.add(new Pokemon("unown", 2, "psychic", new int[]{48, 72, 48, 72, 48, 48}));
        pokemonList.add(new Pokemon("wobbuffet", 2, "psychic", new int[]{190, 33, 58, 33, 58, 33}));
        pokemonList.add(new Pokemon("girafarig", 2, "normal/psychic", new int[]{70, 80, 65, 90, 65, 85}));
        pokemonList.add(new Pokemon("pineco", 2, "bug", new int[]{50, 65, 90, 35, 35, 15}));
        pokemonList.add(new Pokemon("forretress", 2, "bug/steel", new int[]{75, 90, 140, 60, 60, 40}));
        pokemonList.add(new Pokemon("dunsparce", 2, "normal", new int[]{100, 70, 70, 65, 65, 45}));
        pokemonList.add(new Pokemon("gligar", 2, "ground/flying", new int[]{65, 75, 105, 35, 65, 85}));
        pokemonList.add(new Pokemon("steelix", 2, "steel/ground", new int[]{75, 85, 200, 55, 65, 30}));
        pokemonList.add(new Pokemon("snubbull", 2, "fairy", new int[]{60, 80, 50, 40, 40, 30}));
        pokemonList.add(new Pokemon("granbull", 2, "fairy", new int[]{90, 120, 75, 60, 60, 45}));
        pokemonList.add(new Pokemon("qwilfish", 2, "water/poison", new int[]{65, 95, 85, 55, 55, 85}));
        pokemonList.add(new Pokemon("scizor", 2, "bug/steel", new int[]{70, 130, 100, 55, 80, 65}));
        pokemonList.add(new Pokemon("schuckle", 2, "bug/rock", new int[]{20, 10, 230, 10, 230, 5}));
        pokemonList.add(new Pokemon("heracross", 2, "bug/fighting", new int[]{80, 125, 75, 40, 95, 85}));
        pokemonList.add(new Pokemon("sneasel", 2, "dark/ice", new int[]{55, 95, 55, 35, 75, 115}));
        pokemonList.add(new Pokemon("teddiursa", 2, "normal", new int[]{60, 80, 50, 50, 50, 40}));
        pokemonList.add(new Pokemon("ursaring", 2, "normal", new int[]{90, 130, 75, 75, 75, 55}));
        pokemonList.add(new Pokemon("slugma", 2, "fire", new int[]{40, 40, 40, 70, 40, 20}));
        pokemonList.add(new Pokemon("magcargo", 2, "fire/rock", new int[]{60, 50, 120, 90, 80, 30}));
        pokemonList.add(new Pokemon("swinub", 2, "ice/ground", new int[]{50, 50, 40, 30, 30, 50}));
        pokemonList.add(new Pokemon("piloswine", 2, "ice/ground", new int[]{100, 100, 80, 60, 60, 50}));
        pokemonList.add(new Pokemon("corsola", 2, "water/rock", new int[]{65, 55, 95, 65, 95, 35}));
        pokemonList.add(new Pokemon("remoraid", 2, "water", new int[]{35, 65, 35, 65, 35, 65}));
        pokemonList.add(new Pokemon("octillery", 2, "water", new int[]{75, 105, 75, 105, 75, 45}));
        pokemonList.add(new Pokemon("delibird", 2, "ice/flying", new int[]{45, 55, 45, 65, 45, 75}));
        pokemonList.add(new Pokemon("mantine", 2, "water/flying", new int[]{85, 40, 70, 80, 140, 70}));
        pokemonList.add(new Pokemon("skarmony", 2, "steel/flying", new int[]{65, 80, 140, 40, 70, 70}));
        pokemonList.add(new Pokemon("houndour", 2, "dark/fire", new int[]{45, 60, 30, 80, 50, 65}));
        pokemonList.add(new Pokemon("houndoom", 2, "dark/fire", new int[]{75, 90, 50, 110, 80, 95}));
        pokemonList.add(new Pokemon("kingdra", 2, "water/dragon", new int[]{75, 95, 95, 95, 95, 85}));
        pokemonList.add(new Pokemon("phanpy", 2, "ground", new int[]{90, 60, 60, 40, 40, 40}));
        pokemonList.add(new Pokemon("donphan", 2, "ground", new int[]{90, 120, 120, 60, 60, 50}));
        pokemonList.add(new Pokemon("porygon2", 2, "normal", new int[]{85, 80, 90, 105, 95, 60}));
        pokemonList.add(new Pokemon("stantler", 2, "normal", new int[]{73, 95, 62, 85, 65, 85}));
        pokemonList.add(new Pokemon("smeargle ", 2, "normal", new int[]{55, 20, 35, 20, 45, 75}));
        pokemonList.add(new Pokemon("tyrogue", 2, "fighting", new int[]{35, 35, 35, 35, 35, 35}));
        pokemonList.add(new Pokemon("hitmontop", 2, "fighting", new int[]{50, 95, 95, 35, 110, 70}));
        pokemonList.add(new Pokemon("smoochum", 2, "ice/psychic", new int[]{45, 30, 15, 85, 65, 65}));
        pokemonList.add(new Pokemon("elekid", 2, "electric", new int[]{45, 63, 37, 65, 55, 95}));
        pokemonList.add(new Pokemon("magby", 2, "fire", new int[]{45, 75, 37, 70, 55, 83}));
        pokemonList.add(new Pokemon("miltank", 2, "normal", new int[]{95, 80, 105, 40, 70, 100}));
        pokemonList.add(new Pokemon("blissey", 2, "normal", new int[]{255, 10, 10, 75, 135, 55}));
        pokemonList.add(new Pokemon("raikou", 2, "electric", new int[]{90, 85, 75, 115, 100, 115}));
        pokemonList.add(new Pokemon("entei", 2, "fire", new int[]{115, 115, 85, 90, 75, 100}));
        pokemonList.add(new Pokemon("suicune", 2, "water", new int[]{100, 75, 115, 90, 115, 85}));
        pokemonList.add(new Pokemon("larvitar", 2, "rock/ground", new int[]{50, 64, 50, 45, 50, 41}));
        pokemonList.add(new Pokemon("pupitar", 2, "rock/ground", new int[]{70, 84, 70, 65, 70, 51}));
        pokemonList.add(new Pokemon("tyranitar", 2, "rock/ground", new int[]{100, 134, 110, 95, 100, 61}));
        pokemonList.add(new Pokemon("lugia", 2, "psychic/flying", new int[]{106, 90, 130, 90, 154, 110}));
        pokemonList.add(new Pokemon("ho-oh", 2, "fire/flying", new int[]{106, 130, 90, 110, 154, 90}));
        pokemonList.add(new Pokemon("celebi", 2, "psychic/grass", new int[]{100, 100, 100, 100, 100, 100}));




















































































































































        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the desired Pokemon type: ");
        String selectedType = scanner.nextLine();

        int[] ivThreshold = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Enter the desired IV for stat " + (i + 1) + ": ");
            ivThreshold[i] = scanner.nextInt();
        }

        Pokemon chosenPokemon = choosePokemon(pokemonList, selectedType, ivThreshold);

        if (chosenPokemon != null) {
            System.out.println("Congratulations! You've chosen " + chosenPokemon.name +
                    " from Generation " + chosenPokemon.generation + ".");
        } else {
            System.out.println("No Pokemon found with the specified criteria.");
        }
    }

    private static Pokemon choosePokemon(List<Pokemon> pokemonList, String type, int[] ivThreshold) {
        List<Pokemon> matchingPokemon = new ArrayList<>();

        for (Pokemon pokemon : pokemonList) {
            if (pokemon.type.equals(type)) {
                boolean meetsCriteria = true;
                for (int i = 0; i < 6; i++) {
                    if (pokemon.iv[i] < ivThreshold[i]) {
                        meetsCriteria = false;
                        break;
                    }
                }
                if (meetsCriteria) {
                    matchingPokemon.add(pokemon);
                }
            }
        }

        if (matchingPokemon.isEmpty()) {
            return null;
        }

        Random random = new Random();
        return matchingPokemon.get(random.nextInt(matchingPokemon.size()));
    }
}


