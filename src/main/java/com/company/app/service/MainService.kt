import com.company.app.repository.MainRepository

class MainService(private val config: Config) {
    fun doSomething() {
        val repository = MainRepository(config)
        repository.doSomething()
    }
}