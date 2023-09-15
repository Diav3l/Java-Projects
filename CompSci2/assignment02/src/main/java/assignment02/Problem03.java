/*Cole Gordnier
 * 9/6/2023
 * Converts a binary string to an integer in decimal form throws a NumberFormatException if not given binary string
 */
package assignment02;
class Problem03part1 {

    void bin2Dec(String binaryString) throws NumberFormatException{
        try {
            System.out.println(Integer.parseInt(binaryString,2));
        } catch (Exception NumberFormatException) {
            throw new NumberFormatException("Not a binary number");
        } 
    }
}

//Converts a binary string to an integer in decimal form throws a custom BinaryFormatException if not given binary string
class Problem03part2{
   
    void binary2Decimal(String binaryString) throws BinaryFormatException{
        try {
            System.out.println(Integer.parseInt(binaryString,2));
        } catch (Exception BinaryFormatException) {
            throw new BinaryFormatException("Not a binary number");
        } 
    }
}

/*in order to not throw an error on compile coustom exceptions need to extend RuntimeException.
Alternatively the code that calls the method with a coustom exception needs to be in a try catch.
Extending RuntimeException seemed to be the more elegant solution but please tell me if this is a bad practice.*/
class BinaryFormatException extends RuntimeException{
    public BinaryFormatException() {}

    public BinaryFormatException(String message){
        super(message);
    }
}
