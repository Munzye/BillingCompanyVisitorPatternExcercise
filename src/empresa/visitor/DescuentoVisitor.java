package empresa.visitor;

import empresa.modelo.ProductoFisico;
import empresa.modelo.ProductoDigital;

public class DescuentoVisitor implements Visitor {

    @Override
    public void visit(ProductoFisico productoFisico) {
        double descuento = productoFisico.getPrecio() * 0.05;
        double precioFinal = productoFisico.getPrecio() - descuento;

        System.out.println("Descuento producto físico: " + productoFisico.getNombre());
        System.out.println("Precio original: $" + productoFisico.getPrecio());
        System.out.println("Descuento 5%: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("--------------------------------");
    }

    @Override
    public void visit(ProductoDigital productoDigital) {
        double descuento = productoDigital.getPrecio() * 0.10;
        double precioFinal = productoDigital.getPrecio() - descuento;

        System.out.println("Descuento producto digital: " + productoDigital.getNombre());
        System.out.println("Precio original: $" + productoDigital.getPrecio());
        System.out.println("Descuento 10%: $" + descuento);
        System.out.println("Precio final: $" + precioFinal);
        System.out.println("--------------------------------");
    }
}
