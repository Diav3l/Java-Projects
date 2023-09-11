package CompSci2.assignment01;
import java.util.Random;
import java.util.Arrays;
//tmp
class test2{
    static int[] array = new int[100000];
    static Random r = new Random();
    public static void main(String[]args){
        fillWithRandom();
        Stopwatch sw = new Stopwatch();
        selectionSort();
        sw.stop();
        System.out.println("It took "+ (int)sw.getElapsedTime()+"ms to sort 100000 number in the array");
    }


    static void fillWithRandom(){
        for(int i=0;i<100000;i++){
            array[i] = r.nextInt(100001);
        }
    }


    static void selectionSort(){
        for(int i=0; i<array.length;i++){
            int minIndex = i;
            for(int I=i+1;I<array.length;I++){
                if(array[I]<array[minIndex]){
                    minIndex=I;
                }
                int tmp = array[i];
                array[i] = array[I];
                array[I] = tmp;
            }
        }
    }


    static void fastSort(){
        Arrays.sort(array);
    }

    
    static void Print(){
        for(int i=0;i<100000;i++){
            System.out.print("["+array[i]+"]");
        }
    }
}


class Stopwatch{
    private double startTime, endTime;
    

    Stopwatch(){
        startTime = System.currentTimeMillis();
    }


    void start(){
        startTime = System.currentTimeMillis();
    }

    
    void stop(){
        endTime = System.currentTimeMillis();
    }


    double getElapsedTime(){
        return (endTime-startTime);
    }


    double getStartTime(){
        return startTime;
    }


    double getEndTime(){
        return endTime;
    }
}