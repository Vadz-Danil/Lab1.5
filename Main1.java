
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(new Student("Markov", "Evgeny",1, true));
        bst.insert(new Student("Orlova", "Ekaterina",2,false));
        bst.insert(new Student("Zubko", "Taras",3,true));
        bst.insert(new Student("Petrus", "Viktor",4,false));
        bst.insert(new Student("Volkov", "Petro",5,false));
        System.out.println("Всі студенти:");
        bst.print();
        String searchingName = "Taras";
        bst.find(searchingName);
    }
