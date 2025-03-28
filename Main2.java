 public static void main(String[] args) {
    BST1 bst1 = new BST1();
     bst1.insert(new Student("Markov", "Evgeny",1, true));
     bst1.insert(new Student("Orlova", "Ekaterina",2,false));
     bst1.insert(new Student("Zubko", "Taras",3,true));
     bst1.insert(new Student("Petrus", "Viktor",4,false));
     bst1.insert(new Student("Tarasiuk", "Vasyl",5,false));
     System.out.println("Усі студенти:");
     bst1.print();
     String searchingName = "Evgeny";
     bst1.find(searchingName);
}
