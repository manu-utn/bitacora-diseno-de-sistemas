package model.pedido;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorColumn;
import model.Pieza;
import java.util.List;
import java.util.Set;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo_pedido")
abstract class TipoDePedido {
    public Set armarSet(List<Pieza> piezasPosibles) {
        return null;
    }
}
