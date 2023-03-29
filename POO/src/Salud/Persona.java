package Salud;

import java.util.Scanner;
public class Persona {

   //Atributos
    private String tipoDoc; 
    private int documento;
    private String nombre;
    private String apellido;
    //Atributos reto 1
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private double pesoActual;

    // reto 3
    public Persona(String tipoDoc, int documento, String nombre, String apellido) {
        this.tipoDoc = tipoDoc;
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    // reto 3
    public Persona(){
}
    public String getTipoDoc() {
        return tipoDoc;
}
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
}
    public int getDocumento() {
        return documento;
}
    public void setDocumento(int documento) {
        this.documento = documento;
}
    public String getNombre() {
        return nombre;
}
    public void setNombre(String nombre) {
        this.nombre = nombre;
}
    public String getApellido() {
        return apellido;
}
    public void setApellido(String apellido) {
        this.apellido = apellido;
}
    //Metodos
    public void pedirDatos(){
        Scanner datos=new Scanner(System.in);
        System.out.println("Digite su tipo de documento");
        tipoDoc=datos.next();
        System.out.println("Digite su numero de documento");
        documento=datos.nextInt();
        System.out.println("Digite su nombre");
        nombre=datos.next();
        System.out.println("Digite su apellido");
        apellido=datos.next();
    /* 
    codigo reto 1 y 2
    System.out.println("Digite su peso");
    peso=datos.nextDouble();
    System.out.println("Digite su estatura");
    estatura=datos.nextDouble();
    System.out.println("Digite su edad");
    edad=datos.nextInt();
    System.out.println("Digite su sexo");
    sexo=datos.next();
    */
    datos.close();
    }
        public void mostrarPersona(){
        System.out.println("Su tipo de documento es "+tipoDoc);
        System.out.println("Su numero de documento es "+documento);
        System.out.println("Su nombre es "+nombre);
        System.out.println("Su apellido es "+apellido);
    /*  
    codigo reto 1 y 2
    System.out.println("Su peso es "+peso);
    System.out.println("Su estatura es "+estatura);
    System.out.println("Su edad es "+edad);
    System.out.println("Su sexo es "+sexo);
    */
   }

 /* codigo reto 2 */
        public double calcularImc(double peso, double estatura){
        pesoActual=peso/(estatura*estatura);
  
        return pesoActual;

    /*if (pesoActual<20){
        System.out.println("el peso está por debajo de lo ideal");
    }
    else if (pesoActual >= 20 && pesoActual <= 25){
        System.out.println("el peso es ideal");
    }
    else{
        System.out.println("Tiene sobrepeso");
    }*/

   }
/* 
   public void mayorEdad(){
    if (edad>=18){
        System.out.println("Usted es mayor de edad");
    }
    else{
        System.out.println("Usted es menor de edad");
    
    }
    
   }
   */

}
