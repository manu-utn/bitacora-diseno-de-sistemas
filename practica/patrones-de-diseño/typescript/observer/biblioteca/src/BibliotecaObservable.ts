import {IEstudianteObserver} from "./IEstudianteObserver"
import {Libro, LibroNull} from "./Libro"

// eventos: Ej. nuevosLibros


export abstract class BibliotecaObservable{
    private estudiantes: IEstudianteObserver[]
    private libroDisponible: Libro  // <----------------------------

    constructor(){
        this.estudiantes = []
        this.libroDisponible = new LibroNull()
    }

    public agregarObserver(estudiante: IEstudianteObserver):void{
        this.estudiantes.push(estudiante)
    }

    public removerObserver(estudiante: IEstudianteObserver):void{
        this.estudiantes = this.estudiantes
            .filter(unEstudiante => unEstudiante.getNombre() != estudiante.getNombre())
    }

    public notificar(): void {  // <----------------------------
        this.estudiantes
            .forEach(estudiante => estudiante.update(this.libroDisponible))
    }

    public publicarLibro(nuevoLibro: Libro){
        this.libroDisponible = nuevoLibro

        this.notificar()
    }

    public getNotificacion(): Libro { // <----------------------------
        return this.libroDisponible
    }
}
