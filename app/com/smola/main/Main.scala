package com.smola.main

import com.smola.dice.Dice
import com.smola.dice.DiceService

object Main extends App {
  val diceToRoll = new Dice(1, 8)
  val diceRoller = new DiceService
  println(diceRoller.rollSetOfDice(diceToRoll))
}
