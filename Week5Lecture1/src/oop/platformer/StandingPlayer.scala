package oop.platformer

class StandingPlayer(move: Player) extends State(move) {
  override def duck(): Unit = {
    move.state = new DuckingPlayer(move)
  }
  override def standStill(): Unit = {
    println("Already in standing.")
  }
  override def run(): Unit = {
    move.state = new RunningPlayer(move)
  }
  override def jumpHeight(): Unit = {
    move.height = 3
  }
  override def movementSpeed(): Unit = {
    move.speed = 5
  }
}
