import kotlinx.coroutines.*

fun main() {

    val scope = CoroutineScope(Dispatchers.IO)

    runBlocking {
        println("Task one")

        val job = scope.launch(Dispatchers.IO) {
            longRunningTask("Task Two")
        }
        //delay(1000)
        //job.join()
        println("Task three")
    }
}

private suspend fun longRunningTask(value: String) {
    delay(3000) //Three seconds
    println(value)
}