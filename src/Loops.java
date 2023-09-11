import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {


       /* int toplam= 0;

        for (int i=0; i<=10; i++)
        {
            if (i%2==1)
             toplam+=i ;

        } System.out.println("toplam:"+ toplam);


        for(int i=0; i<=20; i++)
        {
            if (i%2==0)
            {
                System.out.println("fazilet");

            }

            else if (i%2==1)
            {
                System.out.println(i);
            }
        }



        int i = 0;

        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.println("fazilet");
                ;
            }

          else


            {System.out.println("senol");}

            i++;
        }*/

 Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:");
 int girilenSayi= scan.nextInt();


 if (girilenSayi%2==0)
 {
     System.out.println("sayi asal degildir");
 }

 else if (girilenSayi%3==0)
 {
     System.out.println("sayi asal degildir");
 }

 else if (girilenSayi%5==0)
 {
     System.out.println("girilen sayi asal degildir.");
 }

 else

     System.out.println("sayi asaldir");
 }


    }
}