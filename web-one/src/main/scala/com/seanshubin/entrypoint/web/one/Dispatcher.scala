package com.seanshubin.entrypoint.web.one

import javax.servlet.http.{HttpServletRequest, HttpServletResponse}

trait Dispatcher {
  def dispatch(request: HttpServletRequest, response: HttpServletResponse): Unit

}
