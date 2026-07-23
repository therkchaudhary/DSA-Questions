public class Student {
    //Attributes
//    public int id;
//    public int age;
//    public String name;
//    public int nos;
//    private String gf;


    private int id;
    private int age;
    private String name;
    private int nos;
    private String gf;

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int a){
        //extra layer of authentication.
        if(age < 100)
            this.age = a;
        return;
    }


    //Default constructor // attribute --> garbage
    public Student(){
        System.out.println("Student Default constructor called");
    }

    //Parameterised constructor
    public Student(int id, int age, String name, int nos, String gf){
        System.out.println("Student Parameterised constructor Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    //copy constructor
    public Student(Student srcobj){ //srcobj --> A
        System.out.println("Student copy constructor Called");
        this.id = srcobj.id;
        this.age = srcobj.age;
        this.name = srcobj.name;
        this.nos = srcobj.nos;
    }

    //Methods / Behaviours
    public void stude(){
        System.out.println(name + " Studeying");
    }

    public void sleep(){
        System.out.println(name + " Sleeping");
    }

    public void bunk(){
        System.out.println(name + " Bunking");
    }

    private void gfChatting(){
        System.out.println(name + " gfChatting");
    }

}
