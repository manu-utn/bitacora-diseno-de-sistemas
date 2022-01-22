import {Contacto} from "./Contacto"
import {IContactosAdapter} from "./IContactosAdapter"
import { WhatsappContactsApi } from "./WhatsappContactsApi"

export class WhatsappContactsAdapter implements IContactosAdapter{
    // private api:WhatsappContactsApi = WhatsappContactsApi

    // constructor(api:WhatsappContactsApi){
    //     this.api = api
    // }

    public getContactos(): Contacto[]{
        return this.parseContactsXml(WhatsappContactsApi.getContactosXml())
    }

    private parseContactsXml(contactosXml:string):Contacto[]{
        let contactos: Contacto[] = []

        // emulamos que estaban en el xml
        contactos.push(new Contacto("matias"))
        contactos.push(new Contacto("fede"))
        // magia ...

        return contactos
    }
}
