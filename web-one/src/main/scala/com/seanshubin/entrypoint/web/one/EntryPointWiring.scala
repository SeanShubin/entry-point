package com.seanshubin.entrypoint.web.one

import javax.servlet.ServletConfig

trait EntryPointWiring {
  def servletConfig: ServletConfig

  lazy val dispatcher: Dispatcher = new TopLevelDispatcher(servletConfig)
}
