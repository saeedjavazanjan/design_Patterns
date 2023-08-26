package builder

data class Hamberger(
    var beef: Boolean,
    var cheese: Boolean,
    var onions: Boolean
) {
    class Builder {
         var beef: Boolean = true
         var cheese: Boolean = false
         var onions: Boolean = false

        fun beef(value: Boolean) = apply { beef = value }
        fun chesse(value: Boolean) = apply { cheese = value }
        fun onions(value: Boolean) = apply { onions = value }

        fun build()=Hamberger(beef,cheese,onions)

    }


}