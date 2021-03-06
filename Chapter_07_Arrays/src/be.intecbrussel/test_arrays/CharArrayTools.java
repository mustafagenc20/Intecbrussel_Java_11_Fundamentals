package be.intecbrussel.test_arrays;

public class CharArrayTools {

    public char[][] generateDictionary(int number){
        char[][] dictionary = new char[26][number];
        char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        for (int i = 0; i < alphabet.length ; i++) {
            dictionary[i][0] = alphabet[0];
            dictionary[i][1] = alphabet[0];
            dictionary[i][2] = alphabet[i];
        }


        return dictionary;
    }

    public char[] sort(char[] arr){
        char[] temp = {0};
        int counter = arr.length;
        do{
            for (int i = 1; i < arr.length; i++) {
                 if (Character.toLowerCase(arr[i-1]) >= Character.toLowerCase(arr[i])){
                        temp[0] = arr[i-1];
                        arr[i-1] = arr[i];
                        arr[i] = temp[0];
                    }
                }
            counter--;
        } while(counter > 0);
        return arr;
    }

    public char[] filterAlphabet(char[] arr){
        char [] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char [] newArr = new char [arr.length];
        int counter = 0;
        for (char letter:alphabet
             ) {
            for (int i = 0; i < arr.length ; i++) {
                if(letter == arr[i]){
                    newArr[counter] = letter;
                    counter++;
                }
            }
        }
        return newArr;
    }
}
