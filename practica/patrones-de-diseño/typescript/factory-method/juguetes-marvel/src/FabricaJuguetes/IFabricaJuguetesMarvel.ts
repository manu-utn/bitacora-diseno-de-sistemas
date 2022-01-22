import {Juguete} from "../Juguete/Juguete"
import {TipoJuguete} from "../Juguete/TipoJuguete"

export interface IFabricaJuguetesMarvel{
    // crearJuguete(tipo:string): Juguete

    // otra alternativa sería pasarle un Enum,
    // pero no lo hicimos porque no podía compararlo
    crearJuguete(tipo: TipoJuguete):Juguete
}
