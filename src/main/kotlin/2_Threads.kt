import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//Threads
fun main() {
    println("Task one")

    longRunningTask("Task Two")

    println("Task three")
}

private fun longRunningTask(value: String) {
    Thread.sleep(2000) //Two seconds
    println(value)
}

//With Coroutine
/*fun main() {
    println("Task one")

    runBlocking {
        longRunningTask("Task Two")
    }

    println("Task three")
}

private suspend fun longRunningTask(value: String) {
    delay(3000) //Three seconds
    println(value)
}*/