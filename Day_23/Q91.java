public class Q91 {
    public static void main(String[] args) {
        String str1= "listen";
        String str2= "silent";
        boolean isAnagram = true;
        if (str1.length()!= str2.length()) {
            isAnagram = false;
        } else {
            for (int i= 0; i< str1.length(); i++) {
                int count1=0;
                int count2=0;
                char ch =str1.charAt(i);
                for (int j =0; j< str1.length();j++) {
                    if (str1.charAt(j)== ch)
                        count1++;

                    if (str2.charAt(j)== ch)
                        count2++;
                }
                if (count1!= count2) {
                    isAnagram= false;
                    break;
                }
            }
        }
        if (isAnagram) {
            System.out.println("Strings are Anagrams");
        } else {
            System.out.println("Strings are Not Anagrams");
        }
    }
}