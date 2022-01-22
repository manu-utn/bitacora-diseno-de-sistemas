import { Juguete } from "./Juguete"

export class NullJuguete implements Juguete {
    public hablar(): string {
        return ""
    }

    public caminar(): void {
        // ...
    }

    public getNombre(): string {
        return "Este juguete no existe"
    }
}
