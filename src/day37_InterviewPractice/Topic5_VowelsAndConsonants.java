package day37_InterviewPractice;

public class Topic5_VowelsAndConsonants {
    public static void main(String[] args) {
//        "Interview"       vowels = 4, consonants = 5
//        "class chat!"      vowels = 2, consonants =7
        String MyWord = "class chat!";
        int VowelsCount = 0;
        int ConsonantsCount = 0;
        MyWord= MyWord.toLowerCase();
        for (int i = 0; i < MyWord.length(); i++) {
            char MyChar = MyWord.charAt(i);  //i
            // i n t e r v i e w

            // if it is vowel increase the vowelCount;
            //if it is not vowel increase the consonantCount;
            if(IsVowel(MyChar)  ){
                VowelsCount++;
            }
            else{
                //check if it is consonant or not
                //if(MyChar >= 97 && MyChar<=122){
                if(MyChar >= 'a' && MyChar<='z'){
                    ConsonantsCount++;
                }
            }


        }

        System.out.printf("we have %d vowel",VowelsCount);
        System.out.println("");
        System.out.printf("we have %d Consonant",ConsonantsCount);
        System.out.println("");
        System.out.printf("we have %d special character", MyWord.length()-VowelsCount-ConsonantsCount);
        System.out.println("*********************");


//        Based on your Word : -Your Word-, you have -vowelcount- Vowes and -consonantcount- Consonant.
//                Also, based on your word - your word- you have -specialcharcount- SpecialChar.
        System.out.printf("Based on your Word : %s , you have %d Vowes and %d Consonant. %nAlso, based on your word %s you have %d SpecialChar.",MyWord,VowelsCount,ConsonantsCount,MyWord,VowelsCount,ConsonantsCount);
    }

    public static boolean IsVowel(char param1){
        if (param1 == 'a' || param1 == 'e' ||param1 == 'i' || param1 == 'o' ||param1 == 'u'){
            return true;
        }
        return false;
    }
}
