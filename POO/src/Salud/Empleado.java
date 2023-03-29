package Salud;

public class Empleado extends Persona{
    private String cargo, departamento;
    private double valorHora, horasTrabajadas;

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, String cargo, String departamento, double valorHora, double horasTrabajadas) {
        super(tipoDoc,documento,nombre,apellido);
        this.cargo=cargo;
        this.departamento=departamento;
        this.valorHora=valorHora;
        this.horasTrabajadas=horasTrabajadas;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public double getvalorHora() {
        return valorHora;
    }
    public void setvalorHora(double valorHora) {
        this.valorHora = valorHora;
    }
    public double getHorastrabajadas() {
        return horasTrabajadas;
    }

    public void sethorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas=horasTrabajadas;
    }

    public void calcularHonorarios() {
    
        double valortotal=(valorHora*horasTrabajadas),reteica=(0.00966*valortotal),valorhonorarios=(valortotal-reteica);
        System.out.println("El valor de su honorario es: "+valorhonorarios);
    }
        public void mostrarEmpleado(){
        System.out.println("Estos son los datos dijitados del empleado: \n1.Código: "+getTipoDoc()+"\n2.Documento: "+getDocumento()+"\n3.Nombre: "+getNombre()+"\n4.Apellido: "+getApellido()+"\n5.Cargo: "+cargo +"\n6.Departamento: "+departamento +"\n7.Horas: "+horasTrabajadas +"\n8.Valor: "+valorHora);
    }
}