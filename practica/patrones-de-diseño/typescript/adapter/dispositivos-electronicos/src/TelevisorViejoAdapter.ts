import { Conectable } from "./Conectable"
import {TelevisorViejo} from "./TelevisorViejo"

export class TelevisorViejoAdapter extends Conectable{
    private televisor: TelevisorViejo

    constructor(televisor: TelevisorViejo){
        super()
        this.televisor = televisor
    }

    public encender():void{
        this.televisor.girarPerillaIzquierda()
        this.televisor.presionarBoton()
    }

    public apagar(): void {
        this.televisor.girarPerillaDerecha()
        this.televisor.presionarBoton()
    }

    public estaEncendido(): boolean {
        return this.televisor.estaEncendido()
    }
}
