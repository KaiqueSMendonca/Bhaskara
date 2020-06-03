package bhaskara;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Bhaskara {


    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor de a: ");
        float a = entrada.nextFloat();
        System.out.print("Digite o valor de b: ");
        float b = entrada.nextFloat();
        System.out.print("Digite o valor de c: ");
        float c = entrada.nextFloat();
        float delta = (float) (pow(b,2)-(4*a*c));
        float raiz = (float) sqrt(delta);
        float x1 = (float) ((-(b)+raiz)/(2*a)); 
        float x2 = (float) ((-(b)-raiz)/(2*a)); 
        
        if (a==0)
            System.out.println("O valor de a é inválido");
        else{
            if (delta>0)
                System.out.println("As raizes são: "+x1+" e "+x2);
            else 
                if (delta==0)
                    System.out.println("A única raiz é: "+x1);
                else
                    System.out.println("Não possui resultados reais");
        }
        
    }
    
}
