import {IEstudianteObserver} from "./IEstudianteObserver"
import {BibliotecaObservable} from "./BibliotecaObservable"
import {Libro, LibroNull} from "./Libro"

export class EstudianteObserver implements IEstudianteObserver{
    private nombre:string
    private libroDisponible: Libro
    private biblioteca: BibliotecaObservable

    constructor(nombre:string, biblioteca: BibliotecaObservable){
        this.nombre = nombre
        this.biblioteca = biblioteca
        this.libroDisponible= new LibroNull()
    }

    public update(nuevoLibro: Libro):void{
        // this.libroDisponible= nuevoLibro
    }

    // NO <--
    public suscribirse(biblioteca: BibliotecaObservable){
        biblioteca.agregarObserver(this)
    }

    public desuscribirse(biblioteca: BibliotecaObservable) {
        biblioteca.removerObserver(this)
    }

    public getNombre():string{
        return this.nombre
    }

    // no deberia
    public getNotificacion(): Libro{ // <----------------------------
        return this.libroDisponible
        // return this.biblioteca.getNotificacion()
    }
}
