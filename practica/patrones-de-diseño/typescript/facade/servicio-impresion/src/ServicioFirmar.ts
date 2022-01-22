import {Documento} from "./Documento"

export class ServicioFirmar{
    public static firmar(documento: Documento):void{
        documento.setFirmado(true)
    }
}
