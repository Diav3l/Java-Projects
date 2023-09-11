package CompSci2.assignment01;
import java.util.ArrayList;



class test4{//tmp
    public static void main(String[]args){
        StackOfIntegers soi = new StackOfIntegers();

        soi.fillWithPrimes();
        //soi.printList();
        //System.out.println();
        soi.printBackwards();
    }


}


class StackOfIntegers{
    ArrayList<Integer> primes = new ArrayList<Integer>();


    void fillWithPrimes(){
        for(int i=2;i<120;i++){
            if(checkPrime(i)){
                primes.add(i);
            }
        }
    }


    boolean checkPrime(int num){
        for(int i=2;i<num;i++){
            if (num%i==0)
                return false;
        }
        return true;
    }


    void printList(){
        for(int i=0;i<primes.size();i++){
            System.out.print("["+ primes.get(i) +"]");
        }
    }


    void printBackwards(){
        for(int i=primes.size()-1;i>0;i--){
            System.out.print("["+ primes.get(i) +"]");
        }
    }


}