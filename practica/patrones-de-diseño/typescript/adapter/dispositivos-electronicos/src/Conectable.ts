export abstract class Conectable{
    private encendido:boolean = false

    public encender():void{
        this.encendido = true
    }

    public apagar():void{
        this.encendido = false
    }

    public estaEncendido():boolean{
        return this.encendido
    }
}
