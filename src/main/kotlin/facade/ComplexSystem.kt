package facade

class ComplexSystem(private val filepath:String) {
    private val cache :HashMap<String,String> = HashMap()

    init {
        println("reading data from the $filepath")
    }

    fun store(key:String,value:String){
        cache[key]=value
    }
    fun read(key: String)=cache[key] ?:""
    fun commit()="storing cached data to file $filepath"
}