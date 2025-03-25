import java.util.Arrays;

public static void main(String[] args){
    Student[] students = new Student[20];
    students[0] = new Student("Ivanov", "Ivan",1, true);
    students[1] = new Student("Petrov", "Petr",2, false);
    students[2] = new Student("Sidorov", "Alexey",3, true);
    students[3] = new Student("Smirnova", "Anna",3, false);
    students[4] = new Student("Kuznetsov","Mikhail" ,5, true);
    students[5] = new Student("Vasilyeva", "Olga",6, false);
    students[6] = new Student("Andreev","Andrey" ,7, true);
    students[7] = new Student("Fedorov","Sergey" ,8, true);
    students[8] = new Student("Egorova", "Elena",9, false);
    students[9] = new Student("Popov","Viktor" ,10, true);
    students[10] = new Student("Novikova", " Maria",11, false);
    students[11] = new Student("Sokolov", "Dmitry",12, true);
    students[12] = new Student("Mikhailov", "Vasily",13, true);
    students[13] = new Student("Alexeeva", "Irina",14, false);
    students[14] = new Student("Nikolaev", "Anton",15, true);
    students[15] = new Student("Kravtsov", "Denis",16, true);
    students[16] = new Student("Lebedeva","Tatyana" ,17, false);
    students[17] = new Student("Gusev", "Igor",18, true);
    students[18] = new Student("Orlova", "Ekaterina",19, false);
    students[19] = new Student("Markov", "Evgeny",20, true);
    Arrays.sort(students,(s1,s2) -> Boolean.compare(s2.militaryTraining,s1.militaryTraining));
    System.out.println("Відстортований масив студентів:");
    StudentSearch search = new StudentSearch();
    search.print(students);

    int searchNumber = 7;
    Student result = StudentSearch.search(students,searchNumber);
    if (result != null && result.militaryTraining) {
        System.out.println("Студент з номером залікової книжки " + searchNumber + " проходить військову підготовку.");
    }
    else {
        System.out.println("Студент з номером залікової книжки " + searchNumber + " не проходить військову підготовку.");
    }
}