package com.seanshubin.entrypoint.web.one

import javax.servlet.ServletConfig
import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

class EntryPointServlet extends HttpServlet {
  private var wiring: EntryPointWiring = null

  override def init(config: ServletConfig): Unit = {
    wiring = new EntryPointWiring {
      override def servletConfig: ServletConfig = config
    }
  }

  override def service(request: HttpServletRequest, response: HttpServletResponse): Unit = {
    wiring.dispatcher.dispatch(request, response)
  }
}
