import java.util.Arrays;

class Permutations {
    public static void main(String[] args){
        if (args.length != 2){
            System.out.println("Invalid Input");
            return;
        }
        String string1 = args[0];
        String string2 = args[1];    

        if (string1.length() != string2.length()){
            System.out.println("false");
            return;
        }

        char arr1[] = string1.toCharArray();
        char arr2[] = string2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
