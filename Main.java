import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String hexadecimalNum;
        int characterPosition = 0;
        int A = 10;
        int B = 11;
        int C = 12;
        int D = 13;
        int E = 14;
        int F = 15;
        double curVal;
        long finalVal = 0;


        System.out.print("Enter a hexadecimal number: ");
        hexadecimalNum = scnr.next();

        if ((hexadecimalNum.charAt(0) == '0') && hexadecimalNum.charAt(1) == 'x') {

            hexadecimalNum = hexadecimalNum.substring(2);
        }

        while (characterPosition < hexadecimalNum.length()) {

            curVal = 0;

            if (Character.isUpperCase(hexadecimalNum.charAt(characterPosition))){
                curVal = ((int)hexadecimalNum.charAt(characterPosition)- 55) * Math.pow(16, (hexadecimalNum.length() - characterPosition - 1));
            }
            else if (Character.isLowerCase(hexadecimalNum.charAt(characterPosition))){

                curVal = ((int)hexadecimalNum.charAt(characterPosition)- 87) * Math.pow(16, (hexadecimalNum.length() - characterPosition -1));
            }
            else if (Character.isDigit(hexadecimalNum.charAt(characterPosition))){

                curVal = ((int)hexadecimalNum.charAt(characterPosition)- 48) * Math.pow(16, (hexadecimalNum.length() - characterPosition - 1));
            }

            finalVal += curVal;             //calculates all the addition of the values aka the decimal number

            characterPosition = characterPosition + 1;  //moves character position one to the right

            }
        System.out.println("Your number is " + finalVal + " in decimal");

    }
}
