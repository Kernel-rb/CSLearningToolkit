// random number guessing game
// !how it works => the game generate a random number from 1 to 10 , and the player try to guess in 3 tries max

// 3 - compare the players guess with the generated number
//    -> if ramining_tries > 0 => the plaer can contunie guessing if they are !wrong
//    -> the p lost
//    -> the p won
//    -> if the players_tries <3 ,  output TOO HIGH or TOO LOW to the console depending on their guess.
//    -> if the player has won, output WINNER to the console.
//    ->  If the player has lost, output YOU LOSE! THE NUMBER WAS: X to the console, where X is the randomNumber.


function game(tries, randomNumber, guess) {

    if (tries > 0) {
        if (guess < randomNumber) {
            console.log("TOO LOW");
        } else if (guess > randomNumber) {
            console.log("TOO HIGH");
        } else {
            console.log("WINNER");
        }
    } else if (tries == 0) {
        if (guess != randomNumber) {

            console.log(`YOU LOSE! THE NUMBER WAS:${randomNumber}`)
        } else {
            console.log("WINNER")
        }
    }
} 