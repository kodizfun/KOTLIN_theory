fun main() {

    println("----------------- Opérateurs logiques ---------------------")

    // opérateurs logiques
    // ==, !=, >, >=, <, <=, &&, ||, !
    var firstUserAge = 44
    var secondUserAge = 11

    println(firstUserAge == secondUserAge)
    println(firstUserAge != secondUserAge)
    println(firstUserAge > secondUserAge)
    println(firstUserAge >= secondUserAge)
    println(firstUserAge < secondUserAge)
    println(firstUserAge <= secondUserAge)
    println("-----------------------------------------")
    println(firstUserAge > secondUserAge && firstUserAge >= 18)
    println(firstUserAge < secondUserAge || firstUserAge >= 18)
    println(!(firstUserAge >= 18))


    println("----------------- Opérateur if ---------------------")


    // opérateur if
    // Si l'utilisateur 1 est majeur il peut passer son permis de conduire
    if (firstUserAge >= 18) {
        println("Vous pouvez tenter l'examen.")
    }

    println("----------------- Opérateurs if, else ---------------------")

    // opérateurs if, else
    // Si l'utilisateur 2 est majeur il peut passer son permis de conduire, sinon il doit attendre d'être majeur
    if (secondUserAge >= 18) {
        println("Vous pouvez tenter l'examen.")
    } else {
        println("Désolé, vous devez encore patienter jusqu'à votre majorité.")
    }

    println("----------------- Opérateur if, else-if ---------------------")

    // opérateurs if, else-if
    // Si l'utilisateur 2 a au delà de 18 il peut passer son permis de conduire
    // Sinon s'il a pile 18 ans lui rappeler qu'il est tout juste majeur et qu'il peut passer son permis de conduire
    // Sinon il doit attendre sa majorité
    if (secondUserAge > 18) {
        println("Vous pouvez tenter l'examen.")
    } else if (secondUserAge == 18) {
        println("Vous êtes tout juste majeur, vous pouvez tenter l'examen.")
    } else {
        println("Désolé, vous devez encore patienter jusqu'à votre majorité.")
    }

    println("----------------- Opérateur when ---------------------")

    // opérateur when
    when {
        secondUserAge > 18 -> println("Vous pouvez tenter l'examen.")
        secondUserAge == 18 -> println("Vous tout juste majeur, vous pouvez tenter l'examen.")
        else -> println("Désolé, vous devez encore patienter jusqu'à votre majorité.")
    }


    println("----------------- Challenge ---------------------")

    // Écrire une fonction qui affiche un conseil d'habillement en fonction de la météo.
    // Utiliser deux paramètres en entrée : isRaining et isCold.
    // La fonction nous conseille de prendre ou non un parapluie et nous conseille de mettre ou non un manteau
    getAdvice(isRaining = true, isCold = false)
}

fun getAdvice(isRaining: Boolean, isCold: Boolean) {
    if (isRaining) {
        println("Il pleut, prenez un parapluie")
    } else {
        println("Il ne pleut pas, pas besoin de parapluie")
    }

    if (isCold) {
        println("Il fait froid, mettez un manteau")
    } else {
        println("Il ne fait pas froid, pas besoin de manteau")
    }
}


