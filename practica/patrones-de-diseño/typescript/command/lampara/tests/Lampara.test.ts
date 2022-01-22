import { Lampara } from "../src/Lampara"
import { SwitchLampara } from "../src/SwitchLampara"
import { CommandEncender } from "../src/Command"

describe('Lampara Tests', () => {
    test('La lampara se enciende', () => {
        const lamparaModerna: Lampara = new Lampara()
        const botonEncender = new CommandEncender(lamparaModerna);
        const unSwitch: SwitchLampara = new SwitchLampara(botonEncender)

        unSwitch.presionarSwitch()

        expect(lamparaModerna.getEncendido()).toBe(true)
    })

    test('La lampara queda apagada', () => {
        const lamparaModerna: Lampara = new Lampara()

        expect(lamparaModerna.getEncendido()).toBe(false)
    })
})
