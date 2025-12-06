// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
       inscritos.add(usuario)
       println("O usuário ${usuario.nome} na formação $nome")
    }
}

fun main() {
    val kotlinEstrutural =  ConteudoEducacional("Paradgma Estrutural", 90)
    val oo = ConteudoEducacional("Paradgma Orientado a Objetos", 90)
    
    val formacaoKt = Formacao(
        "Formação Kotlin Mobile",
        conteudos = listOf(kotlinEstrutural, oo),
        Nivel.DIFICIL
    )
    
    val usuario1 = Usuario("Raí")
    val usuario2 = Usuario("Luana")
    val usuario3 = Usuario("Lula")
    
    formacaoKt.matricular(usuario1)
    formacaoKt.matricular(usuario2)
    formacaoKt.matricular(usuario3)
    
    println("Inscritos na formação:")
    formacaoKt.inscritos.forEach { println(it.nome) }
}
