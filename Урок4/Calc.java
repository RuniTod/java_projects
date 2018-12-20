public class Calc{
    public static void main(String[] arg){
        System.out.println("Calc....");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        double summ = first + second;
        System.out.println("Summ - " + summ);
        summ = first * second;
        System.out.println("* - " + summ);
        summ = first / second;
        System.out.println("/ - " + summ);
        summ = (int)Math. pow(first, second);
        System.out.println("^ - ${summ}");
    }
}