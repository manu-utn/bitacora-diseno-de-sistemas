import {Lampara} from "./Lampara"

export interface Command{
    ejecutar():void
}

export class CommandEncender implements Command{
    private receptor: Lampara

    constructor(lampara: Lampara){
        this.receptor = lampara
    }

    public ejecutar():void{
        this.receptor.accionEncender()
    }
}
