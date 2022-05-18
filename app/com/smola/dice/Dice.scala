package com.smola.dice

class Dice(var numberOfDice: Int = 1,
           var sidesOfDice: Int = 6) {

  def canEqual(other: Any): Boolean = other.isInstanceOf[Dice]

  override def equals(other: Any): Boolean = other match {
    case that: Dice =>
      (that canEqual this) &&
        numberOfDice == that.numberOfDice &&
        sidesOfDice == that.sidesOfDice
    case _ => false
  }

  override def hashCode(): Int = {
    val state = Seq(numberOfDice, sidesOfDice)
    state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
  }

  override def toString = s"Dice($numberOfDice, $sidesOfDice)"
}
