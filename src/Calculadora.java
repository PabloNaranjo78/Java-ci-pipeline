import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        int tecla;
        int num1,num2;

        System.out.println("Bienvenido a la calculadora");

        while(menu) {
            System.out.println("Pulse: \n -->1: Sumar\n -->2: Restar \n -->3: Multiplicar\n -->4: Dividir");
            tecla = Integer.parseInt(scanner.next());
            System.out.println("Digite los dos números");
            switch (tecla){
                case 1:
                    System.out.print("->");
                    num1 = Integer.parseInt(scanner.next());
                    System.out.print("->");
                    num2 = Integer.parseInt(scanner.next());
                    System.out.println("= "+sumar(num1,num2));
                case 2:
                    System.out.print("->");
                    num1 = Integer.parseInt(scanner.next());
                    System.out.print("->");
                    num2 = Integer.parseInt(scanner.next());
                    System.out.println("= "+restar(num1,num2));
                case 3:
                    System.out.print("->");
                    num1 = Integer.parseInt(scanner.next());
                    System.out.print("->");
                    num2 = Integer.parseInt(scanner.next());
                    System.out.println("= "+mult(num1,num2));
                case 4:
                    System.out.print("->");
                    num1 = Integer.parseInt(scanner.next());
                    System.out.print("->");
                    num2 = Integer.parseInt(scanner.next());
                    System.out.println("= "+div(num1,num2));
            }
        }
    }

    public static int sumar(int num1, int num2){
        return num1 + num2;
    }

    public static int restar(int num1, int num2){
        return num1 - num2;
    }

    public static int div(int num1, int num2){
        if (num2 !=0){
            return num1/num2;
        }else{
            return -1;
        }
    }

    public static int mult(int num1, int num2){
        return num1*num2;
    }
}
