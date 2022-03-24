class Dice {
    var value: Int = 0
    var canBeRolled: Boolean = true

    fun generateDiceValue() {
        value = (1..6).random()
    }
}