import {RadioDigital} from "../src/RadioDigital"
import {TelevisorViejo} from "../src/TelevisorViejo"
import {TelevisorViejoAdapter} from "../src/TelevisorViejoAdapter"

describe('Dispositivos Tests', () => {

    test('La radio digital se enciende', () => {
        const radioDigital:RadioDigital = new RadioDigital()
        radioDigital.encender();

        expect(radioDigital.estaEncendido()).toBe(true)
    })

    test('El adaptador para televisores viejos permite encenderlo', () => {
        const televisorViejito:TelevisorViejo = new TelevisorViejo()
        const televisorViejoAdaptado:TelevisorViejoAdapter = new TelevisorViejoAdapter(televisorViejito)

        televisorViejoAdaptado.encender()

        expect(televisorViejoAdaptado.estaEncendido()).toBe(true)
    })
})
