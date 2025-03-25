public class Student {
    String Surname;
    String Name;
    int recordBookNumber;
    boolean militaryTraining;

    public Student(String surname,String name, int recordBookNumber, boolean militaryTraining) {
        this.Surname = surname;
        this.Name = name;
        this.recordBookNumber = recordBookNumber;
        this.militaryTraining = militaryTraining;
    }
    public String getName() {
        return Name;
    }
    @Override
    public String toString() {
        return String.format("%-15s %-10s %-6d %-5b", Surname,Name, recordBookNumber, militaryTraining);
    }
}
