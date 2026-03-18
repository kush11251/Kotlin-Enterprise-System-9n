import java.io.File
import java.io.FileReader
import java.util.Properties

class Config {
    private val properties = Properties()
    init {
        val file = File("config.properties")
        properties.load(FileReader(file))
    }
    fun getProperty(key: String): String {
        return properties.getProperty(key)
    }
}