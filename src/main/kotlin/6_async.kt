import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking{
    val startTime = System.currentTimeMillis()

    val deferredValue1 = async { fetchUser(1) }.await()
    val deferredValue2 = async { fetchUser(2) }.await()
    val deferredValue3 = async { fetchUser(3) }.await()

    println(deferredValue1 + deferredValue2 + deferredValue3)

    val endTime = System.currentTimeMillis()
    println("Time ${endTime - startTime}")
}

private suspend fun fetchUser(id: Int): String {
    delay(2000) //two seconds
    return "UserId$id "
}