package CompSci2.ProjectTheIdea;
import java.util.Random;

class testidea1{
    public static void main(String[] args){
        Random r = new Random();

        TelemetryCollector tCollector = new TelemetryCollector();
       
        for(Integer i=0;i<1000;i++){
            tCollector.AddEntry(i.toString(), r.nextInt(9000));
        }
        
        tCollector.AddEntry("This",1);
        //tCollector.AddSentCount("This",90000);
        tCollector.AddSentCount("999",9000000);
        tCollector.printAll();
    }
}