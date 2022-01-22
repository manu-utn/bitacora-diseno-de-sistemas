import {Documento} from "./Documento"

export class ServicioValidar{
    public static validar(documento: Documento):void{
        documento.setValidado(true)
    }
}
