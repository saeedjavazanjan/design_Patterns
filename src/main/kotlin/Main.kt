import builder.Hamberger
import facade.User
import facade.UserRepository
import faktory.FoodClassCreator
import faktory.Material

fun main(args: Array<String>) {
  //  var any1 = Singleton
  //  var any2 = Singleton

    // var any1=singleton.EagerSingleton.getInstance()
    //var any2=singleton.EagerSingleton.getInstance()

    //  var any1=singleton.StaticBlockSingleton.getInstance()
    // var any2=singleton.StaticBlockSingleton.getInstance()

    //  var any1=singleton.LazySingleton.getInstance()
    //   var any2=singleton.LazySingleton.getInstance()

//    var any1=singleton.ThreadSafeSingleton.getInstance()
    //  var any2=singleton.ThreadSafeSingleton.getInstance()

    //  val any1= EnumSingleton.INSTANCE1
    // var any2= EnumSingleton.INSTANCE2

  /*  Thread{
        Thread.sleep(1000)
        println(any1)
    }.start()

    Thread{
        Thread.sleep(2000)
        println(any2)
    }.start()
*/
//foodCreator(Material.Vegtebels)

   /* var hamberger=Hamberger.Builder()
    hamberger.beef(true)
        .chesse(false)
        .onions(true)
        .build()


    if (hamberger.cheese){
        println("cheesy hamberger")
    }*/

    val userRepository=UserRepository()
    val user= User("SAEED")
    userRepository.save(user)
    val retriveduser=userRepository.findFirst()
    println(retriveduser.login)

}

fun foodCreator(m:Material){
    when(m){
        is Material.Hotdog -> println(FoodClassCreator.Sandwich("provide a hotdog sandwich").command)
        is Material.Vegtebels -> println( FoodClassCreator.Sandwich("provide a dish of  salad").command)
        is Material.Flesh -> println( FoodClassCreator.Sandwich("provide a dish of  kabab").command)

    }
}