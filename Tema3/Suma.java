public class Suma{
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;

        int resultado = sumar(num1, num2, num3);

        System.out.println(resultado);
    }

    public static int sumar(int a, int b, int c){
        return a + b + c;
    }

}
