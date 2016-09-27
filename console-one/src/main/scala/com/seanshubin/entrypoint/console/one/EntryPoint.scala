package com.seanshubin.entrypoint.console.one

object EntryPoint extends App {
  new EntryPointWiring {
    override def commandLineArguments: Seq[String] = args
  }.dispatcher.run()
}
