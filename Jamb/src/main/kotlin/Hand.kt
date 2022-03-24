import kotlin.system.exitProcess

class Hand {
    private var firstDice: Dice = Dice()
    private var secondDice: Dice = Dice()
    private var thirdDice: Dice = Dice()
    private var fourthDice: Dice = Dice()
    private var fifthDice: Dice = Dice()
    private var sixthDice: Dice = Dice()

    private var rollsLeftHandler: Int = 3
    private var canRoll: Boolean = true

    val resultHandler: ResultHandler = ResultHandler()

    fun rollDice() {

        firstDice.generateDiceValue()
        secondDice.generateDiceValue()
        thirdDice.generateDiceValue()
        fourthDice.generateDiceValue()
        fifthDice.generateDiceValue()
        sixthDice.generateDiceValue()

        val diceList = listOf(firstDice, secondDice, thirdDice, fourthDice, fifthDice, sixthDice)
        val diceValue = diceList.map { it.value }

        if(canRoll) {

            if (firstDice.canBeRolled) {
                print("1) ")
                print(diceValue[0])
                println()
            }
            if (secondDice.canBeRolled) {
                print("2) ")
                print(diceValue[1])
                println()
            }
            if (thirdDice.canBeRolled) {
                print("3) ")
                print(diceValue[2])
                println()
            }
            if (fourthDice.canBeRolled) {
                print("4) ")
                print(diceValue[3])
                println()
            }
            if (fifthDice.canBeRolled) {
                print("5) ")
                print(diceValue[4])
                println()
            }
            if (sixthDice.canBeRolled) {
                print("6) ")
                print(diceValue[5])
                println()
            }

            rollsLeftHandler--
            println("You have " + rollsLeftHandler + " rolls left!")
            if (rollsLeftHandler == 0) {
                canRoll = false
            }
        }
        resultHandler.checkTris(diceValue, 5)
        resultHandler.checkPoker(diceValue, 5)
        resultHandler.checkYahtzee(diceValue, 5)
    }

    fun lockDice() {

        firstDice.generateDiceValue()
        secondDice.generateDiceValue()
        thirdDice.generateDiceValue()
        fourthDice.generateDiceValue()
        fifthDice.generateDiceValue()
        sixthDice.generateDiceValue()

        val diceList = listOf(firstDice, secondDice, thirdDice, fourthDice, fifthDice, sixthDice)
        val diceValue = diceList.map { it.value }

        println("Choose how many dice you want to lock!")
        var numberOfDiceLocks = readLine()!!.toInt()
        println("Choose dice you want to lock!")

        while(numberOfDiceLocks > 0){
            val diceNumber = readLine()

                when(diceNumber) {
                    "1" -> firstDice.canBeRolled = false
                    "2" -> secondDice.canBeRolled = false
                    "3" -> thirdDice.canBeRolled = false
                    "4" -> fourthDice.canBeRolled = false
                    "5" -> fifthDice.canBeRolled = false
                    "6" -> sixthDice.canBeRolled = false
                    else -> println("You have to choose a number!")
                }
            numberOfDiceLocks--
        }
    }

    fun endGame(){
        println("Thank you for playing!")
        exitProcess(0)
    }
}