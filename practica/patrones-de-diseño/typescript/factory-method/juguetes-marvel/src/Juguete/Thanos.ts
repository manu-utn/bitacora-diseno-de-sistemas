import {Juguete} from "./Juguete"

export class Thanos implements Juguete{
    public hablar(): string{
        return "Mi derecho es liderar este planeta..!"
    }

    public caminar(): void{
        // ...
    }

    public getNombre(): string{
        return "Thanos"
    }
}
