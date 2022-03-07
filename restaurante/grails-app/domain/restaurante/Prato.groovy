package restaurante
class Prato extends Produto{

    Integer qtdPessoas

    static constraints = {
        qtdPessoas min:1
    }
    static mapping = {
        discriminator  value: "PRATO"
    }
}
