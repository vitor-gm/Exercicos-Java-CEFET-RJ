package List_01.ex15;



public class Main {

    public static void main(String[] args) {

        int[] numeros = LerArray.lerArray();
        Ordernar.ordernarDecrescente(numeros);
        System.out.println("----------");
        Ordernar.ordernarCrescnte(numeros);


    }
}
