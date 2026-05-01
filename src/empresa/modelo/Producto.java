package empresa.modelo;

import empresa.visitor.Visitor;

public interface Producto {

    String getNombre();

    double getPrecio();

    void accept(Visitor visitor);
}
