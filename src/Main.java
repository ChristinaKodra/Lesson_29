public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        int x=1;
        while ( x < 5){
            System.out.println("You are the best!");
            x=x+2 ;
        }

        int result =0;
      for (int k=1; k<=10; k++){

            result= result +k;
        }
        System.out.println("Sum from 1 till 10 =" + result);

        int result_1 =0;
        for (int i=2; i<=10; i=i+2){
            result_1= result_1 +i;
        }
            System.out.println("Sum from 1 till 10 =" + result_1);

        int result2 =0;
        for (int i=1; i<=10; i++) {
            if (i % 2 == 0) {
                result2 = result2 + i;}
            else {
                System.out.println("Нечетное число"+i);
            }

        }
        System.out.println("Sum from 1 till 10 =" + result2);


         int y =15;
         do {
             System.out.println(y);
             y--;

         } while (y>12);

        while (y>12);

        {
            System.out.println(y);
            y--;

        }

        String [] names = new String[] {"Sveta", "Tim", "Alisa", "Evgen"};

        String name1= "Sveta";
        String name2= "Tim";
        String name3= "Alisa";
        String name4= "Evgen";
        System.out.println("Hello " + name2);

        System.out.println("Hello " + names[2]);

        for (int f=0; f< names.length; f++)
        {
            System.out.println(names[f]+",You are the best ");
        }













    }
}