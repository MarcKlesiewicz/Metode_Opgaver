
public class Opgave_3 {
    public static void main(String[] args) {

        midterste(6, 10, 8);
    }

    public static void midterste(int num1, int num2, int num3) {


        if(num2>num1 && num1>num3 || num3>num1 && num1>num2){
            System.out.print(num1+" is a middle number");
        }

        if(num1>num2 && num2>num3 || num3>num2 && num2>num1){
            System.out.print(num2+" is a middle number");
        }
       
        if(num1>num3 && num3>num2 || num2>num3 && num3>num1){
            System.out.print(num3+" is a middle number");
        }
    }
}