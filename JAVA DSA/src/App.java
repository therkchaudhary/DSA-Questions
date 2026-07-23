public class App {
    static void main(String[] args) throws Exception {
        //Default construstor------------------------------------------
//        Student A = new Student();
//        A.id = 1;
//        A.name = "Rahul";
//        A.age = 14;
//        A.nos = 5;
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//
//        A.bunk();
//        A.sleep();
//        A.stude();

        //Parametrised Constructor ---------------------------------
//        Student A = new Student(1, 12, "Rahul", 3, "Tina");
//        System.out.println(A.name);
//        System.out.println(A.age);
//        System.out.println(A.id);
//        System.out.println(A.nos);
//
//        A.bunk();
//        A.sleep();
//        A.stude();

        //Copy Constructor------------------------------------------
//        Student B = new Student(A);
//        System.out.println(B.name);
//        System.out.println(B.age);
//        System.out.println(B.id);
//        System.out.println(B.nos);
//
//        B.sleep();

        //Encapsulation---------------------------------------------
        Student A = new Student(1, 12, "Rahul", 3, "Tina");
        System.out.println(A.getName());
        System.out.println(A.getAge());
        A.setAge(6789);
        System.out.println(A.getAge());
//        System.out.println(A.id);
//        System.out.println(A.nos);
//        System.out.println(A.gf);

//        A.bunk();
//        A.sleep();
//        A.stude();
//        A.gfChatting();
    }
}