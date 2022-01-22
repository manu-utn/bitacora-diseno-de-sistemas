import {Documento} from "./Documento"
import {ServicioFirmar} from "./ServicioFirmar"
import {ServicioValidar} from "./ServicioValidar"

interface IServicioImpresion {
    imprimirFirmadoYValidado(documento: Documento): void
}

export class ServicioImpresion implements IServicioImpresion{
    private cantidadImpresionesPendientes:number = 0

    public imprimirFirmadoYValidado(documento: Documento): void{
        ServicioFirmar.firmar(documento)
        ServicioValidar.validar(documento)

        this.encolarImpresion()
    }

    public encolarImpresion():void{
        this.cantidadImpresionesPendientes+=1
    }

    public getCantidadImpresionesPendientes():number{
        return this.cantidadImpresionesPendientes
    }
}
