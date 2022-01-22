package model.pedido;

import java.util.List;
import java.util.Set;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.OrderColumn;

import model.Categoria;
import model.TipoDeCoccion;

@Entity
class Pedido {
    @ElementCollection
    // @JoinColumn(name="id_pedido")
    private List<TipoDeCoccion> coccionesPreferidas;

    // - Es importante el orden en que eligieron las categorías
    @ElementCollection
    // @JoinColumn(name="id_pedido")
    @OrderColumn(name = "prioridad")
    private List<Categoria> categoriasPreferidas;

    @OneToOne
    private TipoDePedido tipoDePedido;

    public Set recomendar(){
        return null;
        // piezasPosibles = CatalogoDePiezas
        //     .buscarSegunPreferencias(coccionesPreferidas, categoriasPreferidas);
        // return tipoDePedido.armarSet(piezasPosibles)
    }
}
