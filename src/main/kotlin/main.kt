fun main() {

    // ----------------------------
    // DÉCLARATION MINIMALE
    // ----------------------------
    class Person

    val person1 = Person()
    val person2 = Person()

    println("person1 est de type Person ? : ${person1 is Person}")
    println("person2 est de type Person ? : ${person2 is Person}")
    println("affichage de l'objet person1 : $person1")
    println("affichage de l'objet person2 : $person2")
    println("person1 et person2 sont la même personne ? : ${person1 == person2}")
    println("person1 et person2 occupent la même adresse mémoire ? : ${person1 === person2}")
    println("----------")
    val person3 = person2
    println("person3 est de type Person ? : ${person3 is Person}")
    println("affichage de l'objet person3 : $person3")
    println("person2 et person3 sont la même personne ? : ${person2 == person3}")
    println("person2 et person3 occupent la même adresse mémoire ? : ${person2 === person3}")






    // ----------------------------
    // DATA CLASS
    // ----------------------------
    /*    data class Person(val name: String, var age: Int, var isAuthenticated: Boolean)

        val person1 = Person("Pierre", 43, false)
        val person2 = Person("Pierre", 43, false)


        // fonction toString() auto-implémentée
        println("résultat de la fonction toString() pour person1 : $person1")
        println("résultat de la fonction toString() pour person2 : $person2")

        println("----------")

        // fonction de hash permet la comparaison d'objets par rapport à la valeur de leurs propriétés
        println("résultat de la fonction hashCode() pour person1 : ${person1.hashCode()}")
        println("résultat de la fonction hashCode() pour person2 : ${person2.hashCode()}")

        println("----------")

        // fonction de copy
        val person3 = person2.copy()
        println("résultat de la fonction toString() pour person3 : $person3")
        println("résultat de la fonction hashCode() pour person3 : ${person3.hashCode()}")
        println("person2 et person3 ont les mêmes propriétés ? : ${person2 == person3}")
        println("person2 et person3 occupent la même adresse mémoire ? : ${person2 === person3}")*/






    // ----------------------------
    // MÉTHODES D'INSTANCE
    // ----------------------------
/*    class Person(
        val name: String,
        var age: Int,
        var isAuthenticated: Boolean
    ) {

        fun introduce() {
            println("Bonjour, je suis $name et j'ai $age ans.")
        }

        fun getStatus() {
            println(if (isAuthenticated) "Connected :)" else "Not connected :(")
        }
        fun signIn() {
            println("Signing in...")
            isAuthenticated = true
            println("Authenticated ? : $isAuthenticated")
        }

        fun signOut() {
            println("Signing out...")
            isAuthenticated = false
            println("Authenticated ? : $isAuthenticated")
        }
    }

    val person1 = Person("Pierre", 43, false)
    person1.introduce()
    println("Status de person1")
    person1.getStatus()
    println("----------")
    person1.signIn()
    println("Status de person1")
    person1.getStatus()
    println("----------")
    person1.signOut()
    println("Status de person1")
    person1.getStatus()*/






    // ----------------------------
    // HÉRITAGE & POLYMORPHISME
    // ----------------------------
/*    open class Person(
        protected val name: String,
        protected var age: Int,
        protected var isAuthenticated: Boolean
    ) {
        fun introduce() {
            println("Bonjour, je suis $name et j'ai $age ans.")
        }

        open fun getStatus() {
            println(if (isAuthenticated) "Connected :)" else "Not connected :(")
        }
        open fun signIn() {
            println("Signing in...")
            isAuthenticated = true
            println("Authenticated ? : $isAuthenticated")
        }

        open fun signOut() {
            println("Signing out...")
            isAuthenticated = false
            println("Authenticated ? : $isAuthenticated")
        }
    }
    class User(
        name: String,
        age: Int,
        isAuthenticated: Boolean
    ): Person(name, age, isAuthenticated) {
    }

    class Contributor(
        name: String,
        age: Int,
        isAuthenticated: Boolean
    ): Person(name, age, isAuthenticated) {
        override fun getStatus() {
            println(if (isAuthenticated) "Contributor is connected :)" else "Contributor is not connected :(")
        }
        override fun signIn() {
            println("Contributor is signing in...")
            isAuthenticated = true
            println("Contributor authenticated ? : $isAuthenticated")
        }

        override fun signOut() {
            println("Contributor is signing out...")
            isAuthenticated = false
            println("Contributor authenticated ? : $isAuthenticated")
        }
    }

    val user1 = User("Pierre", 43, false)
    user1.introduce()
    println("Status de user1")
    user1.getStatus()
    println("----------")
    user1.signIn()
    println("Status de user1")
    user1.getStatus()
    println("----------")
    user1.signOut()
    println("Status de user1")
    user1.getStatus()
    println("\n")

    val contributor1 = Contributor("Paul", 28, false)
    contributor1.introduce()
    println("Status de contributor1")
    contributor1.getStatus()
    println("----------")
    contributor1.signIn()
    println("Status de contributor1")
    contributor1.getStatus()
    println("----------")
    contributor1.signOut()
    println("Status de contributor1")
    contributor1.getStatus()*/






    // ----------------------------
    // INTERFACE
    // ----------------------------
/*    open class Person(
        protected val name: String,
        protected var age: Int,
        protected var isAuthenticated: Boolean
    ) {
        fun introduce() {
            println("Bonjour, je suis $name et j'ai $age ans.")
        }

        open fun getStatus() {
            println(if (isAuthenticated) "Connected :)" else "Not connected :(")
        }
        open fun signIn() {
            println("Signing in...")
            isAuthenticated = true
            println("Authenticated ? : $isAuthenticated")
        }

        open fun signOut() {
            println("Signing out...")
            isAuthenticated = false
            println("Authenticated ? : $isAuthenticated")
        }
    }
    class User(
        name: String,
        age: Int,
        isAuthenticated: Boolean
    ): Person(name, age, isAuthenticated), Reader {
        override fun readArticle() {
            println("Reading article...")
        }
    }

    class Contributor(
        name: String,
        age: Int,
        isAuthenticated: Boolean
    ): Person(name, age, isAuthenticated), Reader, Writer {
        override fun getStatus() {
            println(if (isAuthenticated) "Contributor is connected :)" else "Contributor is not connected :(")
        }
        override fun signIn() {
            println("Contributor is signing in...")
            isAuthenticated = true
            println("Contributor authenticated ? : $isAuthenticated")
        }

        override fun signOut() {
            println("Contributor is signing out...")
            isAuthenticated = false
            println("Contributor authenticated ? : $isAuthenticated")
        }

        override fun readArticle() {
            println("Reading another contributor article...")
        }

        override fun writeArticle() {
            println("Writing article...")
        }
    }

    val user1 = User("Pierre", 43, false)
    user1.introduce()
    user1.readArticle()

    println("\n")

    val contributor1 = Contributor("Paul", 28, false)
    contributor1.introduce()
    contributor1.readArticle()
    contributor1.writeArticle()

    println("\n")

    println("user1 peut lire les articles ? : ${user1 is Reader}")
    println("user1 peut écrire des articles ? : ${user1 as Any? is Writer}")
    println("contributor1 peut lire les articles ? : ${contributor1 is Reader}")
    println("contributor1 peut écrire des articles ? : ${contributor1 is Writer}")*/
}

interface Reader {
    fun readArticle()
}

interface Writer {
    fun writeArticle()
}
