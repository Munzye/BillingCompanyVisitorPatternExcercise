package empresa.visitor;

import empresa.modelo.ProductoFisico;
import empresa.modelo.ProductoDigital;

public class ReporteVisitor implements Visitor {

    @Override
    public void visit(ProductoFisico productoFisico) {
        double total = productoFisico.getPrecio() + productoFisico.getCostoEnvio();

        System.out.println("Reporte de producto físico");
        System.out.println("Nombre: " + productoFisico.getNombre());
        System.out.println("Precio: $" + productoFisico.getPrecio());
        System.out.println("Peso: " + productoFisico.getPeso() + " kg");
        System.out.println("Costo de envío: $" + productoFisico.getCostoEnvio());
        System.out.println("Total: $" + total);
        System.out.println("--------------------------------");
    }

    @Override
    public void visit(ProductoDigital productoDigital) {
        double total = productoDigital.getPrecio();

        System.out.println("Reporte de producto digital");
        System.out.println("Nombre: " + productoDigital.getNombre());
        System.out.println("Precio: $" + productoDigital.getPrecio());
        System.out.println("Licencia: " + productoDigital.getLicencia());
        System.out.println("Días de expiración: " + productoDigital.getDiasExpiracion());
        System.out.println("Total: $" + total);
        System.out.println("--------------------------------");
    }
}
