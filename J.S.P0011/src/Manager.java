
import java.math.BigInteger;


public class Manager {
    Validation check = new Validation();
   
    public String BaseToDecimal(String input, int base) {
        String HEX = "0123456789ABCDEF";
        BigInteger baseInt =new BigInteger(Integer.toString(base));
        String result = "";
        BigInteger value = new BigInteger("0");
        BigInteger temp = baseInt.divide(baseInt);
        for(int i= input.length()-1;i>=0;i--){
            BigInteger digitBase = new BigInteger(Integer.toString(HEX.indexOf(input.charAt(i))));
            value = value.add(digitBase.multiply(temp));
            temp = temp.multiply(baseInt);
        }
        result = value.toString();
        return result;
    }

    public String reverse(String str) {
        String string = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            string += str.charAt(i);
        }
        return string;
    }

    public String decimalToBase(String decimal, int base) {
        String HEX ="0123456789ABCDEF";
        String str = "";
        BigInteger baseInt = new BigInteger(Integer.toString(base));
        BigInteger strDecimal = new BigInteger(decimal);
        if(decimal.equals("0"))  return "0";
        while(!strDecimal.equals(new BigInteger("0"))){
            BigInteger remainder = strDecimal.remainder(baseInt);
            char value = HEX.charAt(remainder.intValue());
            str+= value+"";
            strDecimal = strDecimal.divide(baseInt);
        }
        return reverse(str);
    }

    public String binaryToHexa(String binary) {
       String decimal = BaseToDecimal(binary, 2);
        String hexa = decimalToBase(decimal, 16);
        return hexa;
    }

    public String hexaToBinary(String hexa) {
        String decimal = BaseToDecimal(hexa, 16);
        String binary = decimalToBase(decimal, 2);
        return binary;
    }
    
    
    public int menu() {
        System.out.println("1. Convert from binary");
        System.out.println("2. Convert from decimal");
        System.out.println("3. Convert from hexadecimal");
        System.out.println("4. Exit");
        int input = check.checkIntInput(1, 4, "Enter choice: ");
        return input;
    }

    public int displayConvert(String from, String case1, String case2) {
        System.out.println("1. Convert from " + from + " to " + case1);
        System.out.println("2. Convert from " + from + " to " + case2);
        int input = check.checkIntInput(1, 2, "Enter choice: ");
        return input;
    }
        
}
