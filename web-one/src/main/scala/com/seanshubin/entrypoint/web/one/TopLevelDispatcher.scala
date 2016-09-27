package com.seanshubin.entrypoint.web.one

import java.net.URI
import javax.servlet.ServletConfig
import javax.servlet.http.HttpServletResponse._
import javax.servlet.http.{HttpServletRequest, HttpServletResponse}

class TopLevelDispatcher(servletConfig: ServletConfig) extends Dispatcher {
  override def dispatch(request: HttpServletRequest, response: HttpServletResponse): Unit = {
    val uri = new URI(request.getRequestURI)
    val path = uri.getPath
    path match {
      case "/foo" => sendTextUtf8(response, "render foo page")
      case "/bar" => sendTextUtf8(response, "render bar page")
    }
  }

  def sendTextUtf8(response: HttpServletResponse, content: String): Unit = {
    response.setContentType("text/plain; charset=utf-8")
    response.getWriter.println(content)
    response.setStatus(SC_OK)
  }
}
