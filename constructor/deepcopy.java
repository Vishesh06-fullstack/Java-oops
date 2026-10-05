public class deepcopy {
    
    int marks[];
    deepcopy(int m[]){
        marks = new int[m.length];
        for(int i = 0 ; i < m.length ; i++){
            marks[i] = m[i];
        }
    }

    // deep copy constructor
    deepcopy(deepcopy d){
        this.marks = new int[d.marks.length];
        for(int i = 0 ; i < d.marks.length ; i++){
            this.marks[i] = d.marks[i];
        }
        
    }

    void show(){
        for(int i = 0 ; i < marks.length ; i++){
            System.out.println("Marks: " + marks[i]);
        }
    }

    public static void main(String[] args) {
        int m[] = {10 , 20 , 30};
        deepcopy d1 = new deepcopy(m);
        deepcopy d2 = new deepcopy(d1);
        d2.marks[0] = 50;
        d1.show();
        d2.show();
    }
}
