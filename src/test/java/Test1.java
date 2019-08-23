import java.util.Scanner;

public class Test1 {
    public static void main (String[]args){
        Scanner s = new Scanner(System.in);

        // if statement
        int num =12;
        if(num % 2==0){
            System.out.println("even number");}
            else{
            System.out.println("odd number");}

            // nested if statement
            int age = 23;
            int weight = 45;
            if(age>=18){
                if(weight>50){
                    System.out.println("you can donate blood");
                }
                System.out.println("you cant donate blood");
            }

            // switch statement
            int day =3;
            switch (day){
                case 0 : System.out.println("Monday"); break;
                case 1 : System.out.println("Tuesday"); break;
                case 3 : System.out.println("Wednesday"); break;
                case 4: System.out.println("Thursday"); break;
                default:System.out.println("nothing");break;

            }

            String name ="kamani";
            double feet = 4.8;
            System.out.println(name+"'s height is "+feet  );



    }
}
