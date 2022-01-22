export abstract class Libro{
    protected titulo?:string

    public getTitulo(){
        return this.titulo
    }
}

export class LibroNull extends Libro{
    public getTitulo() {
        return "No existe este libro"
    }
}

export class LibroComun extends Libro{
    constructor(titulo: string) {
        super()
        this.titulo = titulo
    }
}
