package Oct2024.ex_2810_strings;

public class labstr1 {
    public static void main(String ags[])
    {
        String str1 = "I love my country";
        String str2 = "All Indians are my brothers and sisters";

        //String myStr = "Hello";
        char res_charAt = str1.charAt(8);
        System.out.println("CharAt is "+res_charAt);

        int res_codept = str1.codePointAt(8);
        System.out.println("Unicode value of char is code point -> "+res_codept);

        int result_codeptbefore = str2.codePointBefore(8);
        System.out.println("Code point before- unicode of char before the specified one " +result_codeptbefore);

        int res_codeptcount = str1.codePointCount(3,8);
        System.out.println("code point cunt-> "+res_codeptcount);

        System.out.println("str compare to str1 - str2");
        System.out.println(str1.compareTo(str2));
        System.out.println("str compare str2 to str1");
        System.out.println(str2.compareTo(str1));

        System.out.println("concat");
        System.out.println(str1.concat(str2));

        System.out.println("contains");
        System.out.println(str1.contains("hell"));
        System.out.println(str2.contains("ar"));

        System.out.println(str1.contentEquals("lo"));

       //replace
        String str_mod = str1.replace('y','i');
        System.out.println(str_mod);

        //touppercase
        System.out.println(str1.toUpperCase());
        //to lower case
        System.out.println(str1.toLowerCase());

        //length
        System.out.println(str2.length());

        //



    }
}
