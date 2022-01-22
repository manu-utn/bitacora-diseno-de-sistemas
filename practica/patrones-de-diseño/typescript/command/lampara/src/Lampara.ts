export class Lampara{
    private encendido:boolean = false

    public getEncendido():boolean{
        return this.encendido
    }

    public accionEncender(): void{
        this.encendido = true
    }

    public accionApagar(): void{
        this.encendido = false
    }
}
