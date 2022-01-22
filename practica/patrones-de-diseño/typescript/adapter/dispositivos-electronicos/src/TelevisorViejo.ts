export class TelevisorViejo{
    private perillaIzquierda:boolean = false
    private perillaDerecha: boolean = false
    private encendido:boolean =false

    public girarPerillaIzquierda():void{
        this.perillaIzquierda = true
    }

    public girarPerillaDerecha(): void {
        this.perillaDerecha = true
    }

    public presionarBoton(): void {
        if(this.perillaIzquierda){
            this.encendido = true
        }else if(this.perillaDerecha){
            this.encendido = false
        }
    }

    public estaEncendido(): boolean {
        return this.encendido
    }
}
