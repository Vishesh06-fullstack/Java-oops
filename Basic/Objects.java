public class Objects {
    
    static class Pen{
        String color;
        String type;

        void setColor(String c){
            this.color = c;
        }

        void setType(String t){
            this.type = t;
        }
    }
        public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.setColor("blue");
        pen1.setType("ballpoint");


        System.out.println("Pen color : " + pen1.color);
        System.out.println("Pen type : " + pen1.type);
    }
}
