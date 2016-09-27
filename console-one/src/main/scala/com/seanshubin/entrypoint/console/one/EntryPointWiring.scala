package com.seanshubin.entrypoint.console.one

trait EntryPointWiring {
  def commandLineArguments: Seq[String]

  lazy val dispatcher: Runnable = new Dispatcher(commandLineArguments, println)
}
