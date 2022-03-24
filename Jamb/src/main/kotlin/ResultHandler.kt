class ResultHandler: checkForPattern {
    override fun checkTris(numbers: List<Int>, n: Int) {
        for(i in 0..n step 1){
            var counter = 1
            for(j in 0..n step 1){
                if(i == j){
                    continue
                }
                if(numbers[i] == numbers[j]){
                    counter++
                }
            }
            if(counter == 3) {
                println("You have Tris!")
                break
            }
            counter = 1
        }
    }

    override fun checkPoker(numbers: List<Int>, n: Int) {
        for(i in 0..n step 1){
            var counter = 1
            for(j in 0..n step 1){
                if(i == j){
                    continue
                }
                if(numbers[i] == numbers[j]){
                    counter++
                }
            }
            if(counter == 4) {
                println("You have poker!")
                break
            }
            counter = 1
        }
    }

    override fun checkYahtzee(numbers: List<Int>, n: Int) {
        for(i in 0..n step 1){
            var counter = 1
            for(j in 0..n step 1){
                if(i == j){
                    continue
                }
                if(numbers[i] == numbers[j]){
                    counter++
                }
            }
            if(counter == 5) {
                println("You have Yahtzee!")
                break
            }
            counter = 1
        }
    }
}