//import java.util.HashMap;

public class UniqueCharacter {

    public static void main(String[] args){
        if (args.length != 0) System.out.println(allUnique(args[0]));
        else System.out.println("Invalid Input");
    }

    public static boolean allUnique(String string){
        //HashMap<Character, Boolean> seenCharacters = new HashMap<Character, Boolean>();
        boolean[] seenCharacters = new boolean[256];
        for (char s : string.toCharArray()){
            //if (seenCharacters.containsKey(s)) return false;
            if (seenCharacters[s]) return false;
            else seenCharacters[s] = true;
        }
        return true;        
    }
}
