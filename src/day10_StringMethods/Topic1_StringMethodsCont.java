package day10_StringMethods;

public class Topic1_StringMethodsCont {
    public static void main(String[] args) {
        /*

Method	              Description                                                     	Return Type
charAt()	          Returns the character at the specified index (position)	        char
concat()	          Appends a string to the end of another string	                    String
contains()	          Checks whether a string contains a sequence of characters	        boolean
endsWith()	          Checks whether a string ends with the specified character(s)	    boolean
equals()	          Compares two strings. Returns true if the strings are equal,
                      and false if not	                                                boolean
equalsIgnoreCase()	  Compares two strings, ignoring case considerations	            boolean
indexOf()	          Returns the position of the first found occurrence
                      of specified characters in a string	                            int
isEmpty()	          Checks whether a string is empty or not	                        boolean
lastIndexOf()	      Returns the position of the last found occurrence of
                      specified characters in a string	                                int
length()	          Returns the length of a specified string	                        int
replace()	          Searches a string for a specified value, and returns
                      a new string where the specified values are replaced	            String
replaceFirst()	      Replaces the first occurrence of a substring that matches the
                      given regular expression with the given replacement	            String

startsWith()	      Checks whether a string starts with specified characters	        boolean
substring()	          Extracts the characters from a string,
                      beginning at a specified start position,
                      and through the specified number of character	                    String
toLowerCase()	      Converts a string to lower case letters	                        String
toUpperCase()	      Converts a string to upper case letters	                        String
trim()	              Removes whitespace from both ends of a string	                    String

     */

//      replace()	          Searches a string for a specified value, and returns
//                            a new string where the specified values are replaced	            String

        String name ="Ziya";
        String Rename=name.replace('Z','Y');
        System.out.println("the new value after replace "+Rename);
        System.out.println("the value of name: "+name);

        String name1="AndrewAnd";
        String Rename1= name1.replace("And","Ziya");
        System.out.println("the new value of Rename1: "+Rename1);

//      replaceFirst()	   Replaces the first occurrence of a substring that matches the
//      given regular expression with the given replacement	                                              String

        String name2="AmerAmAm";
        String Rename2= name2.replaceFirst("Am","Pn");
        System.out.println("the value for Rename2: "+Rename2);

//      startsWith()	      Checks whether a string starts with specified characters	        boolean

        String name3 = "Eloise";
        boolean Checkname3= name3.startsWith("E");
        System.out.println("Does name3 starts with E: "+Checkname3);

    }
}
