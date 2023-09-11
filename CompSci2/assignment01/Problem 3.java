package CompSci2.assignment01;
class test3{//tmp
    public static void main(String[] args){
        MyInteger I1 = new MyInteger(73708);
        
        System.out.println(I1.isEven());
        System.out.println(I1.isOdd());
        System.out.println(I1.isPrime());
        //System.out.println(I1.isEven(5));
        //System.out.println(I1.isOdd(5));
        //System.out.println(I1.isPrime(5));
        System.out.println(I1.equals(5));
        System.out.println(I1.equals(73708));
    }
}

class MyInteger{
    int value;
    
    
    MyInteger(int newValue){
        value=newValue;
    }


    int getValue(){
        return value;
    }


    boolean isEven(){
        if(value%2==0){
            return true;
        }
        return false;
    }


    boolean isOdd(){
        if(value%2==0){
            return false;
        }
        return true;
    }


    boolean isPrime(){
        for(int i=2;i<value;i++){
            if (value%i==0){
                return false;
            }
        }
        return true;
    }

    static boolean isEven(int newValue){
        if(newValue%2==0){
            return true;
        }
        return false;
    }


    static boolean isOdd(int newValue){
        if(newValue%2==0){
            return false;
        }
        return true;
    }


    static boolean isPrime(int newValue){
        for(int i=2;i<newValue;i++){
            if (newValue%i==0){
                return false;
            }
        }
        return true;
    }

    boolean equals(int newValue){
        if(this.value == newValue){
            return true;
        }
        return false;
    }
}