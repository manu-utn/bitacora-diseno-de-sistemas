import { Contacto } from "./Contacto"
import { IContactosAdapter } from "./IContactosAdapter"
import { TelegramContactsApi } from "./TelegramContactsApi"

export class TelegramContactsAdapter implements IContactosAdapter {
    // Nota: la tecnología nos limita el no poder usarlo de esta manera,
    // deberíamos usarlo en una variable común, fuera de la instancia de una clase

    // private static api: TelegramContactsApi

    // constructor(api: TelegramContactsApi) {
    //     this.api = api
    // }

    public getContactos(): Contacto[] {
        // return this.parseContactsJson(api.getContactosJson())

        return this.parseContactsJson(TelegramContactsApi.getContactosJson())
    }

    private parseContactsJson(contactosJson: string): Contacto[] {
        let contactos: Contacto[] = []

        // emulamos que estaban en el xml
        contactos.push(new Contacto("carlitos"))
        // magia ...

        return contactos
    }
}
