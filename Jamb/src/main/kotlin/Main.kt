fun main() {

    val myHand: Hand = Hand()
    var rollNumber: Int = 3
    var changeRollNumber: Boolean = true

    while(rollNumber > 0){
        println()
        println("Choose your move!")
        println("1 -> ROLL DICE")
        println("2 -> LOCK DICE")
        println("3 -> END GAME")
        println()

        val myMove = readLine()
        if(myMove == "2"){
            changeRollNumber = false
        }

        when(myMove) {
            "1" -> myHand.rollDice()
            "2" -> myHand.lockDice()
            "3" -> myHand.endGame()
        }
        if(changeRollNumber == true){
            rollNumber--
        }
        changeRollNumber = true
    }
}
