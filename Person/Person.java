public class Person {
    private String name;
    private int age;
    private Job currJob;
    private Person child;
    private Person spouse;
    private static int pop = 0;

    public Person(String name) {
        this.name = name;
        this.age = 0;
        this.spouse = null;
        pop++;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.spouse = null;
        currJob = null;
        child = null;
        pop++;
    }

    public static int population() {
        return pop;
    }

    public boolean equals(Person p) {
        return this.name.equals(p.name) && this.age == p.age;
    }

    public void getJob(Job j) {
        if (this.currJob == null) {
            currJob = j;
        } else {
            System.out.println("Quit old job first");
        }
    }

    public void quitJob() {
        if (currJob != null) {
            currJob = null;
        } else {
            System.out.println("You don't have a job");
        }
    }

    public void adoptChild(Person c) {
        if (child == null) {
            child = c;
        } else {
            System.out.println("Orphan your other kid first");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person clone() {
        Person newP = new Person(this.name, this.age);
        return newP;
    }

    public void hasBirthday() {
        this.age++;
    }

    public String toString() {
        String toPrint = "Name: " + name + "\nAge: " + age;
        if (currJob != null) {
            toPrint += currJob.toString();
        }
        if (child != null) {
            toPrint += "\nChildren:\n" + child.toString();
        }
        return toPrint;
    }

}
