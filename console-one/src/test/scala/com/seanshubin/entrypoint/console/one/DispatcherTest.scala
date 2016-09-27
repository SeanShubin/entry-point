package com.seanshubin.entrypoint.console.one

import org.scalatest.FunSuite

import scala.collection.mutable.ArrayBuffer

class DispatcherTest extends FunSuite {
  test("foo") {
    //given
    val args = Seq("foo")
    val output = new ArrayBuffer[String]()
    val emit: String => Unit = (line) => output.append(line)
    val dispatcher = new Dispatcher(args, emit)

    //when
    dispatcher.run()

    //then
    assert(output === Seq("dispatched to foo"))
  }

  test("bar") {
    //given
    val args = Seq("bar")
    val output = new ArrayBuffer[String]()
    val emit: String => Unit = (line) => output.append(line)
    val dispatcher = new Dispatcher(args, emit)

    //when
    dispatcher.run()

    //then
    assert(output === Seq("dispatched to bar"))
  }
}
