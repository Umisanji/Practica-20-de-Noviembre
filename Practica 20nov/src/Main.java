import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        EmpleadoFL emp1 = new EmpleadoFL("Juan Perez", "E001", 0.0, 170, 15.0);
        EmpleadoTC emp2 = new EmpleadoTC("Ana Gomez", "E002", 3000.0, 5, "Ventas");
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(emp1);
        empleados.add(emp2);

        for (Empleado emp : empleados) {
            System.out.println(emp.mostrarInfo());
            System.out.println("---------------------------");
        }
    }
}
