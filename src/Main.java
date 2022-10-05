import java.util.Random;


public class Main {
    public static void main(String[] args) {



        System.out.println(check(18,15.5));// Можно идти гулять
        System.out.println(check(55,3)); //Можно идти гулять
        System.out.println(check(12,-22)); //Оставайтесь дома
        System.out.println(check(16,23.5));//Можно идти гулять




        System.out.println(check(generateRandomAge(),15.5));
        System.out.println(check(generateRandomAge(),3));
        System.out.println(check(generateRandomAge(),-22));
        System.out.println(check(generateRandomAge(),23));


    }

    public static String check(int age, double temperature) {

        if ((age>= 20 && age <= 45) && (temperature >= -20 && temperature <= 30)) {
            return"Можно идти гулять";

        }
        if ((age < 20) && (temperature >= 0 && temperature <= 28)) {
            return"Можно идти гулять";
        }

        if ((age > 45) && (temperature >= -10 && temperature <= 25)) {

            return"Можно идти гулять";
        }
        else{
            return"Оставайтесь дома";


        }
    }
    public static int generateRandomAge(){

        Random random = new Random();
        return random.nextInt(80);
        


    }
}
