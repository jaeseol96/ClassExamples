public class PersonTest {
    public static void main(String[] args) {
        PersonList comp1020Class = new PersonList();

        setInitial(comp1020Class);
        System.out.println(comp1020Class);
        System.out.println();
        testAdd(comp1020Class);
        System.out.println(comp1020Class);
        System.out.println();
        testDelete(comp1020Class);
        System.out.println(comp1020Class);
        System.out.println("End");
    }

    public static void testDelete(PersonList pl) {
        Person toDelete = new Person("Student 1", 20);
        pl.deleteStudent(toDelete);
    }

    public static void testAdd(PersonList pl) {
        Person newPerson = new Person("Student 4", 20);
        pl.addStudent(newPerson);
    }

    public static void setInitial(PersonList pl) {
        Person p1 = new Person("Student 1", 20);
        Person p2 = new Person("Student 2", 21);
        Person p3 = new Person("Student 3", 19);
        pl.addStudent(p1);
        pl.addStudent(p2);
        pl.addStudent(p3);
    }

}