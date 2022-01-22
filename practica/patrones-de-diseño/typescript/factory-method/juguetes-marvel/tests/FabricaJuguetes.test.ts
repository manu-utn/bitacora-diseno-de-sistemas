import {FabricaDisney} from "../src/FabricaJuguetes/FabricaDisney"
import {FabricaLego} from "../src/FabricaJuguetes/FabricaLego"
import {Juguete} from "../src/Juguete/Juguete"
import {TipoJuguete} from "../src/Juguete/TipoJuguete"

describe('Fabrica de Juguetes Tests', () => {
    let fabricaDisney: FabricaDisney
    let fabricaLego: FabricaLego

    beforeEach(() => {
        fabricaDisney = new FabricaDisney()
        fabricaLego = new FabricaLego()
    })

    test('Disney puede crear a thanos como juguete', () => {
        const thanos: Juguete = fabricaDisney.crearJuguete(TipoJuguete.THANOS)

        expect(thanos.getNombre().toLocaleLowerCase()).toBe("thanos")
    })

    test('Lego puede crear a wolverine como juguete', () => {
        const wolverine: Juguete = fabricaDisney.crearJuguete(TipoJuguete.WOLVERINE)

        expect(wolverine.getNombre().toLocaleLowerCase()).toBe("wolverine")
    })

    test('Lego no puede crear a thanos como juguete', () => {
        const thanos: Juguete = fabricaLego.crearJuguete(TipoJuguete.THANOS)

        // se podría haber manejado la excepción, por el momento sólo usamos el patrón NullObject (?)
        expect(thanos.getNombre().toLocaleLowerCase()).toBe("este juguete no existe")
    })
})
