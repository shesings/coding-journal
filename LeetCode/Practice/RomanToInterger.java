class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        // Idea: use a Map
        HashMap<Character, Integer> romanValues = new HashMap<Character, Integer>();
        // set up the map with the roman values
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);
        System.out.println("check HashMap: " + romanValues);
        // and then read each character
        System.out.println(s);
        char[] charArray = s.toCharArray();
        for(char c : charArray) {
            System.out.println("Printing characters: " + c);
            System.out.println(romanValues.get(c).intValue());
            //int a = romanValues.get(c).intValue();



            sum += romanValues.get(c).intValue();
            System.out.println("sum: " + sum);
            //sum += a;
        }
        // roman += sum

        return sum;
    }
}