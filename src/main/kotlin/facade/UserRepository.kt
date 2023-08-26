package facade
//facade
class UserRepository {

    private val systemPreferences=ComplexSystem("/data/default.prefs")

    fun save(user:User){
        systemPreferences.store("USER_KEY",user.login)

    }
    fun findFirst():User=User(systemPreferences.read("USER_KEY"))

}