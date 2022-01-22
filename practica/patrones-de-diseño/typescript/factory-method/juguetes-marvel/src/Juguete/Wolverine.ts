import { Juguete } from "./Juguete"

export class Wolverine implements Juguete {
    public hablar(): string {
        return "Argh..!"
    }

    public caminar(): void {
        // ...
    }

    public getNombre(): string {
        return "Wolverine"
    }
}
