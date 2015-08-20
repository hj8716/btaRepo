
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kwlee/Desktop/RandomLane/conf/routes
// @DATE:Thu Aug 20 10:31:39 KST 2015


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
