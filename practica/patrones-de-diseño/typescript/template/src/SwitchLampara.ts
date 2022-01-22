import {Command} from "./Command"

export class SwitchLampara{
    private command: Command

    constructor(command: Command){
        this.command = command
    }

    public presionarSwitch(): void{
        this.command.ejecutar()
    }
}
