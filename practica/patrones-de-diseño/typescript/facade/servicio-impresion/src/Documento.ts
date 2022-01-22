export class Documento{
    private titulo:string
    private firmado:boolean
    private validado: boolean

    constructor(titulo:string){
        this.titulo = titulo
        this.firmado = false
        this.validado= false
    }

    public getTitulo():string{
        return this.titulo
    }

    public estaValidado(){
        return this.validado
    }

    public estaFirmado() {
        return this.validado
    }

    public setValidado(estado:boolean){
        this.validado=estado
    }

    public setFirmado(estado: boolean) {
        this.firmado= estado
    }
}
