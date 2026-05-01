package empresa.visitor;

import empresa.modelo.ProductoFisico;
import empresa.modelo.ProductoDigital;

public interface Visitor {

    void visit(ProductoFisico productoFisico);

    void visit(ProductoDigital productoDigital);
}
