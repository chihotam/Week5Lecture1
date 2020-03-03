package oop.platformer

class DuckingPlayer(move: Player) extends State(move) {
  override def duck(): Unit = {
    println("Already in ducking.")
  }
  override def standStill(): Unit = {
    move.state = new StandingPlayer(move)
  }
  override def run(): Unit = {
    println("Cannot transition from ducking to running.")
  }
  override def jumpHeight(): Unit = {
    move.height = 4
  }
  override def movementSpeed(): Unit = {
    move.speed = 1
  }
}
