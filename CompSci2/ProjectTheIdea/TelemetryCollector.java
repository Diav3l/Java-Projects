//import java.util.Arrays;
package CompSci2.ProjectTheIdea;
public class TelemetryCollector {
    private Media[] list = new Media[0];

    void AddEntry(String name, long packetssent){
        int length = list.length;
        Media[] tmp = new Media[list.length];

        for(int i=0;i<list.length;i++){
            tmp[i] = list[i];
        }

        list = new Media[length+1];

        for(int i=0;i<tmp.length;i++){
            list[i] = tmp[i];
        }
        list[length] = new Media(name,packetssent);
    }


    void AddSentCount(String name, long incriment){
        for(Media m: list){
            if(m.getName().equals(name)){
                m.AddPacketsSent(incriment);
            }
        }
    }


    void printAll(){
        for(Media m: list){
            System.out.println("Media : "+ m.getName()+"  Packets Sent :"+m.getPacketsSent());
        }
    }


    class Media{
        private String Name;
        private long PacketsSent;
        Media(String name, long packetssent){
            this.Name = name;
            this.PacketsSent = packetssent;
        }


        String getName(){
            return Name;
        }


        long getPacketsSent(){
            return this.PacketsSent;
        }


        void AddPacketsSent(long Incriment){
            System.out.println("this ran4");
            this.PacketsSent+=Incriment;
        }
    }
}
