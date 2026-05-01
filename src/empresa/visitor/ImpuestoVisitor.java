package empresa.visitor;

import empresa.modelo.ProductoFisico;
import empresa.modelo.ProductoDigital;

public class ImpuestoVisitor implements Visitor {

    @Override
    public void visit(ProductoFisico productoFisico) {
        double impuestoBase = productoFisico.getPrecio() * 0.19;
        double impuestoEnvio = productoFisico.getCostoEnvio() * 0.02;
        double impuestoTotal = impuestoBase + impuestoEnvio;
        double total = productoFisico.getPrecio() + impuestoTotal;

        System.out.println("Producto físico: " + productoFisico.getNombre());
        System.out.println("Precio: $" + productoFisico.getPrecio());
        System.out.println("Impuesto base 19%: $" + impuestoBase);
        System.out.println("Impuesto adicional envío 2%: $" + impuestoEnvio);
        System.out.println("Impuesto total: $" + impuestoTotal);
        System.out.println("Total con impuesto: $" + total);
        System.out.println("--------------------------------");
    }

    @Override
    public void visit(ProductoDigital productoDigital) {
        double impuestoTotal = productoDigital.getPrecio() * 0.19;
        double total = productoDigital.getPrecio() + impuestoTotal;

        System.out.println("Producto digital: " + productoDigital.getNombre());
        System.out.println("Precio: $" + productoDigital.getPrecio());
        System.out.println("Impuesto 19%: $" + impuestoTotal);
        System.out.println("Total con impuesto: $" + total);
        System.out.println("--------------------------------");
    }
}
