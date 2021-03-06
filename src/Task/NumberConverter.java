package Task;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NumberConverter {
    private static final NavigableMap<Integer, String> units;
    static {
        NavigableMap<Integer, String> initMap = new TreeMap<>();
        initMap.put(1000, "M");
        initMap.put(900, "CM");
        initMap.put(500, "D");
        initMap.put(400, "CD");
        initMap.put(100, "C");
        initMap.put(90, "XC");
        initMap.put(50, "L");
        initMap.put(40, "XL");
        initMap.put(10, "X");
        initMap.put(9, "IX");
        initMap.put(5, "V");
        initMap.put(4, "IV");
        initMap.put(1, "I");
        units = Collections.unmodifiableNavigableMap(initMap);
    }

    public String intToRoman(int number) {
        if (number >= 4000 || number <= 0)
            return null;
        StringBuilder result = new StringBuilder();
        for(Integer key : units.descendingKeySet()) {
            while (number >= key) {
                number -= key;
                result.append(units.get(key));
            }
        }
        return result.toString();
    }

    public int romanToInt(String romanNumber) {
        if (romanNumber.isEmpty())
            return 0;
        if (romanNumber.startsWith("X"))
            return 10 + romanToInt(romanNumber.substring(1));
        if (romanNumber.startsWith("IX"))
            return 9 + romanToInt(romanNumber.substring(2));
        if (romanNumber.startsWith("V"))
            return 5 + romanToInt(romanNumber.substring(1));
        if (romanNumber.startsWith("IV"))
            return 4 + romanToInt(romanNumber.substring(2));
        if (romanNumber.startsWith("I"))
            return 1 + romanToInt(romanNumber.substring(1));
        throw new RuntimeException("Incorrect value");
    }
}
