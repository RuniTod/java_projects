import java.util.Scanner;
import java.util.SplittableRandom;


/*
* класс для запуска калькулятора, scanner поддерживает ввод пользователя
* */
public class Runner{
    public static void main(String[] ags){
        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit ="no";
            while (!exit.equals("yes")){
                System.out.println("Enter : first arg");
                String first = reader.next();
                System.out.println("Enter : second arg");
                String second = reader.next();
                calc.add(Integer.valueOf(first),Integer.valueOf(second));
                System.out.println("Result: " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit : yes/no");
                exit = reader.next();
            }
        } finally {
            reader.close();
        }
    }
}