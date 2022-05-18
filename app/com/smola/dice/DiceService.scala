package com.smola.dice

import scala.util.Random

class DiceService {
  def Roll(sidesOfDice: Int): Int = {
    // Create an instance of the random class
    val random = Random
    // Generate a random number from 1 to sidesOfDice inclusive
    random.nextInt(sidesOfDice) + 1
  }
  def RollSetOfDice(dice: Dice): Int = {
    // Variable to track how many dice are left to roll
    var diceRemaining = dice.numberOfDice
    // Tracks result total
    var result = 0
    def RollNextDice(): Unit = {
      // Check if any dice remain
      if (diceRemaining != 0) {
        // Roll and add result to total
        result += Roll(dice.sidesOfDice)
        // Remove a die from the total
        diceRemaining -= 1
        // Attempt to roll next die
        RollNextDice()
      }
    }
    RollNextDice()
    result
  }

}
