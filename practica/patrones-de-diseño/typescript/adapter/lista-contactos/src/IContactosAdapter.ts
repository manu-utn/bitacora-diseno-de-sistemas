import {Contacto} from "./Contacto"

export interface IContactosAdapter{
    getContactos(): Contacto[]
}
