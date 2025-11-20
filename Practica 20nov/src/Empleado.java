public abstract class Empleado {
    protected String nombre;
    protected String id;
    protected double salarioBase;

    public Empleado(String nombre, String id, double salarioBase) {
        this.nombre = nombre;
        this.id = id;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String mostrarInfo() {
        return "Empleado: " + nombre + "\n" +
                "ID: " + id + "\n" +
                "Salario Base: " + salarioBase + "\n" +
                "Salario final: " + calcularSalario() + "\n";
    }
}
