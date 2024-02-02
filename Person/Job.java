public class Job {
    private String jobTitle;
    private double salary;

    public Job(String jt, double salary) {
        this.jobTitle = jt;
        this.salary = salary;

    }

    public String toString() {
        return " Title: " + jobTitle + "\nSalary: $" + salary;
    }

}
