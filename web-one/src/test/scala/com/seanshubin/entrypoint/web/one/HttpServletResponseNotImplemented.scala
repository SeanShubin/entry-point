package com.seanshubin.entrypoint.web.one

import java.io.PrintWriter
import java.util.Locale
import javax.servlet.ServletOutputStream
import javax.servlet.http.{Cookie, HttpServletResponse}

trait HttpServletResponseNotImplemented extends HttpServletResponse {
  override def sendError(sc: Int, msg: String): Unit = ???

  override def sendError(sc: Int): Unit = ???

  override def containsHeader(name: String): Boolean = ???

  override def setStatus(sc: Int): Unit = ???

  override def setStatus(sc: Int, sm: String): Unit = ???

  override def addHeader(name: String, value: String): Unit = ???

  override def addIntHeader(name: String, value: Int): Unit = ???

  override def encodeURL(url: String): String = ???

  override def addCookie(cookie: Cookie): Unit = ???

  override def addDateHeader(name: String, date: Long): Unit = ???

  override def setDateHeader(name: String, date: Long): Unit = ???

  override def encodeRedirectUrl(url: String): String = ???

  override def sendRedirect(location: String): Unit = ???

  override def setHeader(name: String, value: String): Unit = ???

  override def setIntHeader(name: String, value: Int): Unit = ???

  override def encodeRedirectURL(url: String): String = ???

  override def encodeUrl(url: String): String = ???

  override def getLocale: Locale = ???

  override def isCommitted: Boolean = ???

  override def setBufferSize(size: Int): Unit = ???

  override def setContentLength(len: Int): Unit = ???

  override def setContentType(`type`: String): Unit = ???

  override def resetBuffer(): Unit = ???

  override def getCharacterEncoding: String = ???

  override def setCharacterEncoding(charset: String): Unit = ???

  override def getOutputStream: ServletOutputStream = ???

  override def getWriter: PrintWriter = ???

  override def flushBuffer(): Unit = ???

  override def setLocale(loc: Locale): Unit = ???

  override def getContentType: String = ???

  override def reset(): Unit = ???

  override def getBufferSize: Int = ???
}
