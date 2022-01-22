import { Juguete } from "../Juguete/Juguete"
import { Thanos } from "../Juguete/Thanos"
import { Wolverine } from "../Juguete/Wolverine"
import { NullJuguete } from "../Juguete/NullJuguete"
import { TipoJuguete } from "../Juguete/TipoJuguete"
import {IFabricaJuguetesMarvel} from "./IFabricaJuguetesMarvel"

export class FabricaDisney implements IFabricaJuguetesMarvel {
    // usamos Enum por parámetro, pero podríamos pasarle un String
    crearJuguete(tipo: TipoJuguete): Juguete{
        switch(tipo){
            case TipoJuguete.THANOS:
                return new Thanos()
                break
            case TipoJuguete.WOLVERINE:
                return new Wolverine()
                break
            default:
                return new NullJuguete()
                break
                // throw new Error('Este juguete no existe') // <-- otra alternativa
        }
    }
}
