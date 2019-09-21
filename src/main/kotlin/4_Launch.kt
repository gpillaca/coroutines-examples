import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("Task one - ${Thread.currentThread().name}")

    launch(Dispatchers.IO) {
        longRunningTask("Task Two - ${Thread.currentThread().name}")
    }

    println("Task three - ${Thread.currentThread().name}")
}

private suspend fun longRunningTask(value: String) {
    delay(3000) //Three seconds
    println(value)
}