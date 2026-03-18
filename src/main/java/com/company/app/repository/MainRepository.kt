import com.company.app.model.MainModel

class MainRepository(private val config: Config) {
    fun doSomething() {
        val model = MainModel()
        // do something with model
    }
}