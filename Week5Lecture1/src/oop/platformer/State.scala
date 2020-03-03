package oop.platformer

abstract class State(move: Player) {
  def duck()
  def standStill()
  def run()
  def jumpHeight()
  def movementSpeed()
}
