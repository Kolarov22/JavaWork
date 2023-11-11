package Homeworks;

public class Student {
    String name;
    int points;
    public Student(String nume, int puncte){
        this.name=nume;
        this.points=puncte;
    }
    public String getName(){
        return this.name;

    }
    public void addExam(int mark){
        this.points+=mark;

    }
    public void getTotal(){
        System.out.println(this.points);

    }
    public void getMeanMark( Student student ){
        float avg;
        avg=(this.points+student.points)/2;
        System.out.println(avg);

        


    }
    public static void main(String[] args) {
        Student Student1 = new Student( "Andrei", 30 );
        Student Student2 = new Student ( "Radu" , 50 );
        /*System.out.println(Student1.getName());
        Student1.addExam(10);
        Student1.getTotal();
        */
        Student1.getMeanMark(Student2);
        
    }

    
}
