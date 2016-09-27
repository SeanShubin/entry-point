package com.seanshubin.entrypoint.console.one

class Dispatcher(args: Seq[String], emit: String => Unit) extends Runnable {
  override def run(): Unit = {
    val codePath = args.head
    codePath match {
      case "foo" => emit("dispatched to foo")
      case "bar" => emit("dispatched to bar")
    }
  }
}
