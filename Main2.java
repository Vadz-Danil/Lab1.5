 public static void main(String[] args) {
    BST1 bst1 = new BST1();
     bst1.insert(new Student("Markov", "Evgeny",1, true));
     bst1.insert(new Student("Orlova", "Ekaterina",2,false));
     bst1.insert(new Student("Zubko", "Taras",3,true));
     bst1.insert(new Student("Petrus", "Viktor",4,false));
     String searchingName = "Evgeny";
     bst1.find(searchingName);
}
