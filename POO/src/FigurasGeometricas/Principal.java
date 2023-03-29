package FigurasGeometricas;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        float lado,base,altura,radio;
        int decision, inicializar=1;

        while (inicializar == 1) {
            System.out.println("Ingrese cual es la figura la cual quiere calcular el area");
            System.out.println("1 Cuadrado");
            System.out.println("2 Triangulo");
            System.out.println("3 Rectangulo");
            System.out.println("4 Circulo");
            decision=lectura.nextInt();

            if(decision==1){
                System.out.println("Ingrese el lado del cuadrado");
                lado=lectura.nextFloat();

                Cuadrado Cuadrado1=new Cuadrado(lado);
                Cuadrado1.calcularArea();
            }
            else if(decision==2){
                System.out.println("Ingrese la base del triangulo");
                base=lectura.nextInt();

                System.out.println("Ingrese la altura del triangulo");
                altura=lectura.nextInt();

                Triangulo Triangulo1=new Triangulo(base, altura);
                Triangulo1.calcularArea();
            }
            else if(decision==3){
                System.out.println("Ingrese la base del rectangulo");
                base=lectura.nextInt();

                System.out.println("Ingrese la altura del rectangulo");
                altura=lectura.nextInt();

                Rectangulo Rectangulo1=new Rectangulo(base, altura);
                Rectangulo1.calcularArea();
            }
            else if(decision==4){
                System.out.println("Ingrese el radio del circulo");
                radio=lectura.nextFloat();

                Circulo Circulo1=new Circulo(radio);
                Circulo1.calcularArea();
            }

            System.out.println("Si desea calcular otra figura, por favor digite S para sí");
            inicializar=lectura.nextInt();
        }
        lectura.close();
    }
}