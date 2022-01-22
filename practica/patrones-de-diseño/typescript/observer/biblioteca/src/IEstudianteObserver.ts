import { Libro } from "./Libro"
import { BibliotecaObservable } from "./BibliotecaObservable"

export interface IEstudianteObserver{
    update(libro?: Libro):void
    suscribirse(biblioteca: BibliotecaObservable):void
    desuscribirse(biblioteca: BibliotecaObservable):void

    getNombre(): string
}
