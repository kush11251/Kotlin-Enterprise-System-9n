import com.company.app.service.MainService

class MainController(private val config: Config) {
    fun run() {
        val service = MainService(config)
        service.doSomething()
    }
}