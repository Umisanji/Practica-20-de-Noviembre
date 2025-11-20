public class EmpleadoFL extends Empleado implements Beneficiable {
    private int horasTrabajadas;
    private double tarifaHora;
    
    public EmpleadoFL(String nombre, String id, double salarioBase, int horasTrabajadas, double tarifaHora) {
        super(nombre, id, horasTrabajadas * tarifaHora);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }
    
    @Override
    public double calcularSalario() {
        return (horasTrabajadas*tarifaHora) + calcularBonificacion();
    }

    @Override
    public double calcularBonificacion() {
        if(horasTrabajadas > 160) {
            return ((this.salarioBase)*0.05);
        }
        return 0.0;
    }

    @Override
    public double aplicarDescuento() {
        return (calcularSalario() * 0.03);
    }
    
}