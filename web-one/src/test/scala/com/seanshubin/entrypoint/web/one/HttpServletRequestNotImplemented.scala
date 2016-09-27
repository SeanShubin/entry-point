package com.seanshubin.entrypoint.web.one

import java.io.BufferedReader
import java.security.Principal
import java.util
import java.util.Locale
import javax.servlet.http.{Cookie, HttpServletRequest, HttpSession}
import javax.servlet.{RequestDispatcher, ServletInputStream}

trait HttpServletRequestNotImplemented extends HttpServletRequest {
  override def isRequestedSessionIdFromURL: Boolean = ???

  override def getRemoteUser: String = ???

  override def getUserPrincipal: Principal = ???

  override def getHeaderNames: util.Enumeration[_] = ???

  override def getPathInfo: String = ???

  override def getAuthType: String = ???

  override def getRequestURL: StringBuffer = ???

  override def getCookies: Array[Cookie] = ???

  override def getQueryString: String = ???

  override def getContextPath: String = ???

  override def getServletPath: String = ???

  override def getRequestURI: String = ???

  override def getPathTranslated: String = ???

  override def getIntHeader(name: String): Int = ???

  override def getHeaders(name: String): util.Enumeration[_] = ???

  override def getRequestedSessionId: String = ???

  override def isRequestedSessionIdFromUrl: Boolean = ???

  override def isRequestedSessionIdValid: Boolean = ???

  override def getSession(create: Boolean): HttpSession = ???

  override def getSession: HttpSession = ???

  override def getMethod: String = ???

  override def getDateHeader(name: String): Long = ???

  override def isUserInRole(role: String): Boolean = ???

  override def isRequestedSessionIdFromCookie: Boolean = ???

  override def getHeader(name: String): String = ???

  override def getParameter(name: String): String = ???

  override def getRequestDispatcher(path: String): RequestDispatcher = ???

  override def getRealPath(path: String): String = ???

  override def getLocale: Locale = ???

  override def getRemoteHost: String = ???

  override def getParameterNames: util.Enumeration[_] = ???

  override def isSecure: Boolean = ???

  override def getLocalPort: Int = ???

  override def getAttribute(name: String): AnyRef = ???

  override def removeAttribute(name: String): Unit = ???

  override def getLocalAddr: String = ???

  override def getCharacterEncoding: String = ???

  override def setCharacterEncoding(env: String): Unit = ???

  override def getParameterValues(name: String): Array[String] = ???

  override def getRemotePort: Int = ???

  override def getServerName: String = ???

  override def getProtocol: String = ???

  override def getLocales: util.Enumeration[_] = ???

  override def getAttributeNames: util.Enumeration[_] = ???

  override def setAttribute(name: String, o: scala.Any): Unit = ???

  override def getRemoteAddr: String = ???

  override def getLocalName: String = ???

  override def getContentLength: Int = ???

  override def getServerPort: Int = ???

  override def getReader: BufferedReader = ???

  override def getContentType: String = ???

  override def getScheme: String = ???

  override def getParameterMap: util.Map[_, _] = ???

  override def getInputStream: ServletInputStream = ???
}
