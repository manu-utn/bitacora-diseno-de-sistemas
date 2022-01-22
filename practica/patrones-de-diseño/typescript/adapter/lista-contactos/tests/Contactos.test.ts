import { Contacto } from "../src/Contacto"
import {WhatsappContactsAdapter} from "../src/WhatsappContactsAdapter"
import {TelegramContactsAdapter} from "../src/TelegramContactsAdapter"

describe('Contactos Tests', () => {
    let contactos: Contacto[]
    let whatsapp: WhatsappContactsAdapter
    let telegram: TelegramContactsAdapter

    beforeEach(() => {
        contactos = []
        whatsapp = new WhatsappContactsAdapter()
        telegram = new TelegramContactsAdapter()
    })

    test('Podemos agregar contactos de whatsapp', () => {
        contactos = contactos.concat(whatsapp.getContactos())
        expect(contactos.length).toBe(2)
    })

    test('Podemos agregar contactos de telegram', () => {
        contactos = contactos.concat(telegram.getContactos())
        expect(contactos.length).toBe(1)
    })

    test('Podemos agregar contactos de whatsapp + telegram', () => {
        contactos = contactos.concat(telegram.getContactos())
        contactos = contactos.concat(whatsapp.getContactos())
        expect(contactos.length).toBe(3)
    })
})
