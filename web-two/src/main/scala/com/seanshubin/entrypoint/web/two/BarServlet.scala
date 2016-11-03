package com.seanshubin.entrypoint.web.two

import javax.servlet.http.{HttpServlet, HttpServletRequest, HttpServletResponse}

import com.seanshubin.entrypoint.web.two.ServletUtil._

class BarServlet extends HttpServlet {
  override def service(request: HttpServletRequest, response: HttpServletResponse): Unit = {
    sendTextUtf8(response, "render bar page")
  }
}
