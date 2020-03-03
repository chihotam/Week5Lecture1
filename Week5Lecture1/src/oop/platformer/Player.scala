package oop.platformer

class Player {
  var state: State = new StandingPlayer(this)
  var height: Int = 0
  var speed: Int = 0
  def duck(): Unit = {
    this.state.duck()
  }
  def standStill(): Unit = {
    this.state.standStill()
  }
  def run(): Unit = {
    this.state.run()
  }
  def jumpHeight(): Int = {
    this.state.jumpHeight()
    height
  }
  def movementSpeed(): Int = {
    this.state.movementSpeed()
    speed
  }
}
