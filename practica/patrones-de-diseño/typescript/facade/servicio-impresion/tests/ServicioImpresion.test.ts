import { Documento } from "../src/Documento"
import { ServicioImpresion } from "../src/ServicioImpresion"

describe('Tests', () => {
    let servicioImpresion: ServicioImpresion

    beforeEach(() => {
        servicioImpresion = new ServicioImpresion()
    })

    test('Imprimir dos documentos, implíca que hay dos impresiones pendientes', () => {
        servicioImpresion.imprimirFirmadoYValidado(new Documento("Un documento"))
        servicioImpresion.imprimirFirmadoYValidado(new Documento("Otro documento"))

        expect(servicioImpresion.getCantidadImpresionesPendientes()).toBe(2)
    })

    test('Un documento impreso debe estar firmado y validado', () => {
        let documentoLegal: Documento = new Documento("Documento importante")

        servicioImpresion.imprimirFirmadoYValidado(documentoLegal)

        expect(documentoLegal.estaFirmado()).toBe(true)
        expect(documentoLegal.estaValidado()).toBe(true)
    })
})
