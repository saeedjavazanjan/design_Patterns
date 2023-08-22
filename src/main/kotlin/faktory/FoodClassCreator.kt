package faktory

sealed class FoodClassCreator(){
    data class Kabab(val command:String):FoodClassCreator()
    data class Salad(val command: String ):FoodClassCreator()
    data class Sandwich(val command: String ):FoodClassCreator()


}
