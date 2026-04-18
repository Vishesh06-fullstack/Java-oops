class Pen{
    private String color;
    private String type;


    void setColor(String c){
        this.color = c;
    }

    void setType(String t){
        this.type = t;
    }

    String getColor(){
        return this.color;
    }
    String getType(){
        return this.type;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setColor("pink");
        pen1.setType("gel");

        System.out.println("Pen color : " + pen1.getColor());
        System.out.println("Pen type : " + pen1.getType());
    }
}
