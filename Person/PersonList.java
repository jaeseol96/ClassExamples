public class PersonList {
    private final int MAX_CLASS_CAPACITY = 100;
    private int numEnrolled;
    private Person[] students;

    public PersonList() {
        numEnrolled = 0;
        students = new Person[MAX_CLASS_CAPACITY];
    }

    public void addStudent(Person newStudent) {
        if (numEnrolled < students.length) {
            students[numEnrolled++] = newStudent;
        } else {
            System.out.println("No room in the class");
        }
        // since they are referrencing same array, no need to return a new array,
    }

    public void deleteStudent(Person toDelete) {
        int currIndex = numEnrolled - 1;
        while (currIndex >= 0 && !students[currIndex].equals(toDelete)) {
            currIndex--;
        }

        if (currIndex < 0) {
            System.out.println("Person not found in list ");

        } else { // if person is found,
            while (currIndex < (numEnrolled - 1)) {
                students[currIndex] = students[currIndex + 1];
                currIndex++;
            }
            students[numEnrolled] = null; // not necessary, but not wrong
            numEnrolled--;
        }
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < numEnrolled; i++) {
            result += students[i] + "\n";
        }
        return result;
    }

}
