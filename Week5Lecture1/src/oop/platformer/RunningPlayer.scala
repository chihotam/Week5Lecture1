package oop.platformer

class RunningPlayer(move: Player) extends State(move) {
  override def duck(): Unit = {
    println("Cannot transition from running to ducking.")
  }
  override def standStill(): Unit = {
    move.state = new StandingPlayer(move)
  }
  override def run(): Unit = {
    println("Already in running.")
  }
  override def jumpHeight(): Unit = {
    move.height = 6
  }
  override def movementSpeed(): Unit = {
    move.speed = 12
  }
}
