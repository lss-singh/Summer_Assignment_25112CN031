public class Q99 {
    public static void main(String[] args) {
        String[] names ={"Ravi", "Amit", "Suresh", "Priya", "Neha"};
        for (int i= 0; i< names.length -1; i++) {  // bubble Sort
            for (int j=0; j<names.length-i-1; j++) {
                if (names[j].compareTo(names[j+1]) > 0) { // compareTo compares string according to its ASCII value
                    String temp=names[j];
                    names[j] =names[j+1];
                    names[j+1]= temp;
                }
            }
        }
        System.out.println("Names in Alphabetical Order:");
        for (String name : names) {
            System.out.println(name);
        }
        //sc.close();
    }
}
/* 0 → both strings are equal
Positive value (> 0) → string1 comes after string2 alphabetically
Negative value (< 0) → string1 comes before string2 alphabetically */