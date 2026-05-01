package empresa;

import java.util.ArrayList;
import java.util.List;

import empresa.modelo.Producto;
import empresa.modelo.ProductoFisico;
import empresa.modelo.ProductoDigital;
import empresa.visitor.Visitor;
import empresa.visitor.ImpuestoVisitor;
import empresa.visitor.ReporteVisitor;
import empresa.visitor.DescuentoVisitor;

public class Main {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new ProductoFisico("Laptop Lenovo", 2500000, 2.5, 35000));
        productos.add(new ProductoFisico("Teclado mecánico", 280000, 0.8, 15000));
        productos.add(new ProductoDigital("Antivirus Pro", 120000, "LIC-ANT-2026", 365));
        productos.add(new ProductoDigital("Curso Java Avanzado", 180000, "LIC-JAVA-2026", 180));

        Visitor impuestoVisitor = new ImpuestoVisitor();
        Visitor reporteVisitor = new ReporteVisitor();
        Visitor descuentoVisitor = new DescuentoVisitor();

        System.out.println("=== IMPUESTOS ===");
        procesarProductos(productos, impuestoVisitor);

        System.out.println();
        System.out.println("=== REPORTES ===");
        procesarProductos(productos, reporteVisitor);

        System.out.println();
        System.out.println("=== DESCUENTOS ===");
        procesarProductos(productos, descuentoVisitor);
    }

    private static void procesarProductos(List<Producto> productos, Visitor visitor) {
        for (Producto producto : productos) {
            producto.accept(visitor);
        }
    }
}
