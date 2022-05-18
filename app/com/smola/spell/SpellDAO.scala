package com.smola.spell

trait SpellDAO {
  def getAllSpells(): List[Spell]

  def getSpellById(id: Int): Spell

  def addSpellToTable(spell: Spell): Int

  def deleteSpellById(id: Int): Int

  def updateSpellById(id: Int, spell: Spell): Int

}
