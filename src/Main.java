public class Main {
    public static void main(String[] args) {
        //qisa metn bu formada yailir

        /* uzun metn ise bele yazilir */
        
        
        //Bunlar variables-lerdi yeni deyisenler
        int year = 2026;
        float price = 10.50f;
        boolean register = true;
        char character = 'C';
        String name = "Ali";
        

        // 1 deyisenin final qiymetini vermek ucun final-dan istifade edirik
        final int money = 50;
      
      
        /* data typlar ise primitive olanlar int, String, float, char, boolen-dir.
       non-primitive data typlar ise String( coxlu chardan ibaret Array demek olar),
        Array ve Objectdir
        */

        // var deyisenin tipini biz qeyd etmesek bele ozu teyin edir
        var x = 5; // burda x int oldu
        var y = 10.99; // burda y double oldu
        var z = true; // burda z boolean oldu
        System.out.println("Bu x-in qiymeti: " + x);
        System.out.println("Bu y-in qiymeti: " + y);
        System.out.println("Bu z-in qiymeti: " + z);

        // Casting cevirme anayisidir int-->float (widening), float-->int(narrowing, tehlukeli)

        //Widening
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("Boyultme emeliyyatinin neticesi: " + myDouble);

        //Narrowing
        float myFloat = 9.99f;
        int myNewInt = (int) myFloat;
        System.out.println("Kicilme emeliyyatinin neticesi: " + myNewInt);


        // Stringin uzunluqunu olcmek ucun .length() istifade olunur
        String myString = "İzdrasde";
        System.out.println("Metnin uzunluqu: " + myString.length());

        // Verilen Stringde her sey boyuk yazilsin istiyirsense .toUpperCase
        System.out.println("Butun herfler boyukle yazilir: " + myString.toUpperCase());

        // Balaca olsun istiyirsense .toLowerCase
        System.out.println("Butun herfler kicik yazilir: " + myString.toLowerCase());
        
        // Stringin icinde her hansisa herfin ve ya sozun yerini, movqeyini tapmaq ucun .indexOf()
        String newString = "El bilir ki sen menimsen";
        System.out.println("1-ci yerde duran e-in qiymeti: " + newString.indexOf("e"));

        // mueyyen movqeni bilib, hemin movqede duran hansi char-disa bize qaytarir
        String neseBirSey ="afbhsabfsba.mcbxzlhjl";
        System.out.println("Verilen reqemde duran char: " + neseBirSey.charAt(6));

        // 2 String-in bir biriine beraber olb olmadiqini yoxlamaq ucun .equlas() istifade olunur
        String firstEmploye = "Ali";
        String secondEmployee = "Ali";
        System.out.println("2 iscinin adi eynidirmi?: " + firstEmploye.equals(secondEmployee));

        String firstEmployeeSurname = "Mukhtarli";
        String secondEmployeeSurname = "Mammadli";
        System.out.println("Bes soyadlari eynidirmi?: " + firstEmployeeSurname.equals(secondEmployeeSurname));


        // Stringin evvelinde ve sonunda olan bosluqu silmek ucun .trim() istifade olunur
        String trim = "Ali Mukhtarli";
        System.out.println("Bu stringin trimsiz hali: [   " + trim + "   ]"  );
        System.out.println("Bu ise trimli hali: [" +     trim.trim() + "]");

        //Neyise bir birine birlesdirmek ucun .concat()
        String nameConcat = "Ali";
        String surNameConcat = "Mukhtarli";
        String idConcat = "--6220221";
        System.out.println("Concat istifade edende bele birlesdirmek olr: " + nameConcat.concat(surNameConcat).concat(idConcat));

       /* biz Stringin icinde qosa noqte acib nese yaza bilmediyimiz ucun ve basa hansisa
        xususi isare isletmek ucun qarsisina \ isareni qoymaliyiq*/
        String xususiIsare = "Salam menim adim \"Ali Mukhtarli\"-dir";
        System.out.println("Indi \\ sayesinde dirnaq icinde dirnaq yaza bildim: " + xususiIsare);

       //Normal if-den ferqli ve qisa formada yazilis qaydasi 
       int time = 50;
       String result = (time == 50)? "Vaxt tamam olub" : "Vaxt tam deyil";
       System.out.println(result);

    // ve ya bir basa printin icindede yaza bilersen
    System.out.println((time<= 40)? "Artiq limiti asdiniz": "Siz davam ede bilersiniz");
    
    //ic ice (Nested)-de ise 
    int il = 2025;
    String message = (il==2026)? "Tarix dogrudur"
                   : (il<2026)? "Tarix geridedir"
                   :"Tarix ondedir";
    System.out.println(message);

    // Coxlu if else isletmekdense switch istifade etmek daha rahatdir
    int gun = 6;
    switch(gun){
        case 1: 
            System.out.println("1-ci gundur");
            break;
        case 2:
            System.out.println("2-ci gundur");
            break;
        case 3:
            System.out.println("3-cu gundur");
            break;
        case 4:
            System.out.println("4-cu gundur");
            break;
        case 5:
            System.out.println("5-ci gundur");
            break;
        case 6:
            System.out.println("6-ci gundur");
            break;
        case 7:
            System.out.println("7-ci gundur");
            break;
    } 



    }



}