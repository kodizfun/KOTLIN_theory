import kotlin.random.Random

fun main() {

    println("----------------- Boucle While ---------------------")

    // boucle while (tant que)
    var counter = 0
    val maxCounter = 12
    while(counter <= maxCounter) {
        println("Compteur : $counter")
        counter++ // !!! Attention à bien incrémenter le compteur sinon boucle infinie
    }

    println("----------------- Boucle Do-While ---------------------")

    // boucle do-while (faire, tant que)
    var counter2 = 0
    val maxCounter2 = 12
    do {
        println("Compteur 2 : $counter2")
        counter2++ // Attention à bien incrémenter le compteur sinon boucle infinie
    } while (counter2 <= maxCounter2)


    println("----------------- Boucle For-In (range) ---------------------")
    val range = 0..12
    for(number in range) {
        println("Number : $number")
    }

    println("----------------- Boucle For-In (list) ---------------------")

    val names = listOf("Pierre", "Paul", "Jacques")
    for(name in names) {
        println("Name : $name")
    }

    println("----------------- Boucle For-In (index) ---------------------")

    for(index in names.indices) {
        println("Index $index : ${names[index]}")
    }


    println("----------------- Challenge ---------------------")

    // Créer une fonction showRandomNumbers() qui génère 10 valeurs Int aléatoirement entre 1 et 100 :
    // - affiche ces valeurs
    // - affiche aussi la quantité de nombres pairs
    // Tips :
    // - import kotlin.random.Random
    // - utiliser Random.nextInt(min, max)
    // - utiliser une boucle while ou do-while,utiliser l'operateur modulo "%" pour récupérer le reste d'une division exemple 14%2 est égale à 0

    showRandomNumbers()
}

fun showRandomNumbers() {
    var counter = 0
    var countEvenNumbers = 0
    do {
        val randomNumber = Random.nextInt(1, 100)
        println("Random $counter : $randomNumber")
        if (randomNumber%2 == 0) {
            countEvenNumbers++
        }
        counter++
    } while (counter < 10)

    println("Il y a $countEvenNumbers nombre(s) pair(s).")
}
