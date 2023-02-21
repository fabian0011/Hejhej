
import java.util.*;

public class Logic {

    static HashMap<String, String> myHashMap;

    Logic() {
        myHashMap = new HashMap<>();
        myHashMap.put("A", "*-");
        myHashMap.put("B", "-***");
        myHashMap.put("C", "-*-*");
        myHashMap.put("D", "-**");
        myHashMap.put("E", "*");
        myHashMap.put("F", "**-*");
        myHashMap.put("G", "--*");
        myHashMap.put("H", "****");
        myHashMap.put("I", "**");
        myHashMap.put("J", "*---");
        myHashMap.put("K", "-*-");
        myHashMap.put("L", "*-**");
        myHashMap.put("M", "--");
        myHashMap.put("N", "-*");
        myHashMap.put("O", "---");
        myHashMap.put("P", "*--*");
        myHashMap.put("Q", "----");
        myHashMap.put("R", "*-*");
        myHashMap.put("S", "***");
        myHashMap.put("T", "-");
        myHashMap.put("U", "**-");
        myHashMap.put("V", "***-");
        myHashMap.put("W", "*--");
        myHashMap.put("X", "-**-");
        myHashMap.put("Y", "-*--");
        myHashMap.put("Z", "--**");
        myHashMap.put("*-", "A");
        myHashMap.put("-***", "B");
        myHashMap.put("-*-*", "C");
        myHashMap.put("-**", "D");
        myHashMap.put("*", "E");
        myHashMap.put("**-*", "F");
        myHashMap.put("--*", "G");
        myHashMap.put("****", "H");
        myHashMap.put("**", "I");
        myHashMap.put("*---", "J");
        myHashMap.put("-*-", "K");
        myHashMap.put("*-**", "L");
        myHashMap.put("--", "M");
        myHashMap.put("-*", "N");
        myHashMap.put("---", "O");
        myHashMap.put("*--*", "P");
        myHashMap.put("----", "Q");
        myHashMap.put("*-*", "R");
        myHashMap.put("***", "S");
        myHashMap.put("-", "T");
        myHashMap.put("**-", "U");
        myHashMap.put("***-", "V");
        myHashMap.put("*--", "W");
        myHashMap.put("-**-", "X");
        myHashMap.put("-*--", "Y");
        myHashMap.put("--**", "Z");

    }

    public String translateEnglish(String englishToMorse) {
        String translated = "";
        for (int i = 0; i < englishToMorse.length(); i++) {
            if(myHashMap.get(String.valueOf(englishToMorse.charAt(i)))== null) {
            } else {
            translated = translated + myHashMap.get(String.valueOf(englishToMorse.charAt(i)).toUpperCase()) + " ";
        }
        }
        return translated;
    }

    public String translateMorse(String morseToEnglish) {
        String translated = "";
        String[] morse = morseToEnglish.split(" ");
        for (int i = 0; i < morse.length; i++) {
            if(myHashMap.get(morse[i])== null) {
            } else { translated = translated + myHashMap.get(morse[i]);
            }
        }
        return translated;

    }

}









