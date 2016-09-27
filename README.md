# Entry Points

## Console application with multiple entry points
- main
    - [foo](console-two/src/main/scala/com/seanshubin/entrypoint/console/two/EntryPointFoo.scala)
    - [bar](console-two/src/main/scala/com/seanshubin/entrypoint/console/two/EntryPointBar.scala)
- behavior is outside the application, possibly in a script
- this makes it here to test

## Same console application with one entry point
- main
    - [entry point](console-one/src/main/scala/com/seanshubin/entrypoint/console/one/EntryPoint.scala)
    - [dispatcher](console-one/src/main/scala/com/seanshubin/entrypoint/console/one/Dispatcher.scala)
- test
    - [test](console-one/src/test/scala/com/seanshubin/entrypoint/console/one/DispatcherTest.scala)

## Web application with multiple entry points
- main
    - [web.xml](web-two/src/main/webapp/WEB-INF/web.xml)
    - [foo](web-two/src/main/scala/com/seanshubin/entrypoint/web/two/FooServlet.scala)
    - [bar](web-two/src/main/scala/com/seanshubin/entrypoint/web/two/BarServlet.scala)
- need to spin up a web server to test the dispatch behavior

## Same web application with one entry point
- main
    - [web.xml](web-one/src/main/webapp/WEB-INF/web.xml)
    - [servlet](web-one/src/main/scala/com/seanshubin/entrypoint/web/one/EntryPointServlet.scala)
    - [dispatcher](web-one/src/main/scala/com/seanshubin/entrypoint/web/one/TopLevelDispatcher.scala)
- test
    - 