public class Person {
    
    private String name;
    private String surname;
    private String CNP;

    public Person(String name, String surname, String CNP){
        this.name = name;
        this.surname = surname;
        this.CNP = CNP;
    }

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
