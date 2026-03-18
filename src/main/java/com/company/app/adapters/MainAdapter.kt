interface MainAdapter {
    fun adapt(): String
}
class MainAdapterFactory {
    companion object {
        fun createAdapter(): MainAdapter {
            return object : MainAdapter {
                override fun adapt(): String {
                    return "adapted"
                }
            }
        }
    }
}