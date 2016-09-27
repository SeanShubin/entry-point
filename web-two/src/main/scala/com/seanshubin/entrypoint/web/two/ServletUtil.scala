package com.seanshubin.entrypoint.web.two

import javax.servlet.http.HttpServletResponse
import javax.servlet.http.HttpServletResponse._

object ServletUtil {
  def sendTextUtf8(response: HttpServletResponse, content: String): Unit = {
    response.setContentType("text/plain; charset=utf-8")
    response.getWriter.println(content)
    response.setStatus(SC_OK)
  }
}
