public class EmpleadoTC extends Empleado implements Beneficiable {
    private int antiguedad;
    private String departamento;

    public EmpleadoTC(String nombre, String id, double salarioBase, int antiguedad, String departamento) {
        super(nombre, id, salarioBase);
        this.antiguedad = antiguedad;
        this.departamento = departamento;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + calcularBonificacion();
    }
    
    @Override
    public double calcularBonificacion() {
        return (salarioBase*0.10)*antiguedad;
    }

    @Override
    public double aplicarDescuento() {
        return ((calcularSalario() + calcularBonificacion())*.05);
    }
}  
