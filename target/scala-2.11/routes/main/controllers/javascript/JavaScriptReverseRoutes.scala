
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kwlee/Desktop/RandomLane/conf/routes
// @DATE:Thu Aug 20 10:31:39 KST 2015

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:11
  class ReverseRandomApp(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RandomApp.index",
      """
        function(sequence,laneCount) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "random/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("sequence", encodeURIComponent(sequence)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("laneCount", encodeURIComponent(laneCount))})
        }
      """
    )
  
    // @LINE:12
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RandomApp.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "random"})
        }
      """
    )
  
  }

  // @LINE:9
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }


}