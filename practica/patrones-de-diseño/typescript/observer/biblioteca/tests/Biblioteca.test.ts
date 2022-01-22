/*
 * Correcciones
 * 1. el patrón observer debería apuntar a eventos, no es tan relevante el sujeto/persona
 * si no el tema en particular al que se quieren suscribir
 *
 * Ej. en vez de Invitado y Estudiante, se debería enfocar a LibrosLiteratura,
 * LibrosComedia, etc... es decir a un tema/categoría en particular de interés
 *
 *
 * 2. el patron observer también se enfoca en avisarle a los observadores,
 * como una notificacion que hay novedades del evento al que se suscribió,
 * no está enfocado a cambiar el estado del observer con información.
 * Osea sólo le avisa, y lo que haga el observer luego de recibir el aviso
 * es problema del observer.
 *
 * Ej. el observable le avisa al observer que hay novedades,
 * el observer sólo necesita esa notificación y quizás se manda un correo,
 * o se muestra un mensaje por pantalla, ó se activa algún procedimiento..
 * Se podría ver similar a un trigger de gdd, que espera que ocurra un evento en particular,
 * sólo esperan el evento.. No es tan relevante que le mandemos un objeto con datos, ..
 */

import {BibliotecaMedrano} from "../src/BibliotecaMedrano"
import {EstudianteObserver} from "../src/EstudianteObserver"
import {Libro, LibroComun} from "../src/Libro"

describe('Biblioteca Tests', () => {
    let biblioteca: BibliotecaMedrano
    let matias: EstudianteObserver
    let fede: EstudianteObserver

    beforeEach(() => {
        biblioteca = new BibliotecaMedrano()
        matias = new EstudianteObserver("matias", biblioteca)
        matias.suscribirse(biblioteca)

        fede = new EstudianteObserver("fede", biblioteca)
        fede.suscribirse(biblioteca)
    })

    test('Si la biblioteca publica un libro, los estudiantes reciben la notificacion', () => {
        biblioteca.publicarLibro(new LibroComun("Los fernandez"))

        expect(fede.getNotificacion().getTitulo()).toBe("Los fernandez")
        expect(matias.getNotificacion().getTitulo()).toBe("Los fernandez")
    })
})
