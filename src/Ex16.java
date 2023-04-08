import java.util.Scanner;
import java.lang.Math;

public class Ex16 {
    public static void main(String[] args) throws Exception {
       int area;
       double litros,latas,preco; 
    Scanner reader = new Scanner(System.in);   
       System.out.print("Digite em metros quadrados o tamanho da área a ser pintada: ");
            area = reader.nextInt();
    
        litros = area / 3;
        latas = Math.ceil(litros / 18);
        preco = latas * 80.00;

        System.out.println("Você terá que comprar " + latas + " latas de tinta");
        System.out.println("E o valor ficará R$ " + preco);
    }
}
