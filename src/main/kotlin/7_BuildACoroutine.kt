import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.async
import kotlinx.coroutines.delay

fun main() = runBlocking{

    //1 Scope
    //2 Dispatcher [IO/Main/Default]
    //3 Coroutine builder launch/async

    val scope = CoroutineScope(Dispatchers.IO)
    val deferred = scope.async {
        fetchUser(1)
    }
    val job = scope.launch {
        fetchUser(1)
    }
    //deferred.await()
}

private suspend fun fetchUser(id: Int): String {
    delay(2000) //two seconds
    return "UserId$id "
}