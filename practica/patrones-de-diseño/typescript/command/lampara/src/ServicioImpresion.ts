class Documento{
    private nombre: string
}

interface IServicioImpresion {
    imprimirFirmadoYValidado(documento: Documento): void
}

export class ServicioImpresion implements IServicioImpresion{
    private cantidadImpresionesPendientes:number = 0

    public imprimirFirmadoValidado(documento: Documento):void{
        this.encolarImpresion()
    }

    private encolarImpresion():void{
        this.cantidadImpresionesPendientes+=1
    }

    public getCantidadImpresionesPendientes():number{
        return this.cantidadImpresionesPendientes
    }
}
