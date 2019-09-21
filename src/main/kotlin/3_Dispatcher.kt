import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

//Dispatcher
fun main() {
    println("Task one - ${Thread.currentThread().name}")

    runBlocking(Dispatchers.IO) {
        longRunningTask("Task Two - ${Thread.currentThread().name}")
    }

    println("Task three - ${Thread.currentThread().name}")
}

private suspend fun longRunningTask(value: String) {
    delay(3000) //Three seconds
    println(value)
}