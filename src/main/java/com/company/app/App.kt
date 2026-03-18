import com.company.app.config.Config
import com.company.app.controller.MainController

fun main() {
    val config = Config()
    val controller = MainController(config)
    controller.run()
}