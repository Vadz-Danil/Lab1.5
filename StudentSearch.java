public class StudentSearch {
    public static Student search(Student[] arr,int key){
        return find(arr,0,arr.length-1,key);
    }

    private static Student find(Student[] arr, int left, int right, int key) {
        if (left > right || key < arr[left].recordBookNumber || key > arr[right].recordBookNumber) {
            return null;
        }
        int mid = left + (key - arr[left].recordBookNumber) * (right - left) / (arr[right].recordBookNumber - arr[left].recordBookNumber);

        if (arr[mid].recordBookNumber == key) {
            return arr[mid];
        }
        if (arr[mid].recordBookNumber > key) {
            return find(arr, left, mid - 1, key);
        }
        else {
            return find(arr, mid + 1, right, key);
        }
    }
    public void print(Student[] arr){
        for (Student student : arr) {
            System.out.println(student);
        }
    }

}
