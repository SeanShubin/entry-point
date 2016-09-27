package com.seanshubin.entrypoint.web.one

import java.io.{PrintWriter, StringWriter}
import javax.servlet.ServletConfig
import javax.servlet.http.HttpServletResponse._

import org.scalatest.FunSuite

class TopLevelDispatcherTest extends FunSuite {
  test("foo") {
    // given
    val dummyServletConfig: ServletConfig = null
    val topLevelDispatcher = new TopLevelDispatcher(dummyServletConfig)
    val uriString = "http://some.domain/foo"
    val stubRequest = new StubHttpServletRequest(uriString)
    val stubResponse = new StubHttpServletResponse

    //when
    topLevelDispatcher.dispatch(stubRequest, stubResponse)

    //then
    assert(stubResponse.contentType === "text/plain; charset=utf-8")
    assert(stubResponse.statusCode === SC_OK)
    assert(stubResponse.body.trim === "render foo page")
  }

  test("bar") {
    // given
    val dummyServletConfig: ServletConfig = null
    val topLevelDispatcher = new TopLevelDispatcher(dummyServletConfig)
    val uriString = "http://some.domain/bar"
    val stubRequest = new StubHttpServletRequest(uriString)
    val stubResponse = new StubHttpServletResponse

    //when
    topLevelDispatcher.dispatch(stubRequest, stubResponse)

    //then
    assert(stubResponse.contentType === "text/plain; charset=utf-8")
    assert(stubResponse.statusCode === SC_OK)
    assert(stubResponse.body.trim === "render bar page")
  }

  class StubHttpServletRequest(uriString: String) extends HttpServletRequestNotImplemented {
    override def getRequestURI: String = uriString
  }

  class StubHttpServletResponse extends HttpServletResponseNotImplemented {
    var contentType: String = _
    var statusCode: Int = _

    def body: String = stringWriter.toString

    val stringWriter = new StringWriter

    override def setContentType(`type`: String): Unit = contentType = `type`

    override def getWriter: PrintWriter = new PrintWriter(stringWriter)

    override def setStatus(sc: Int): Unit = statusCode = sc
  }

}
