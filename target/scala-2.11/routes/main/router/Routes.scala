
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kwlee/Desktop/RandomLane/conf/routes
// @DATE:Thu Aug 20 10:31:39 KST 2015

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  Application_1: controllers.Application,
  // @LINE:9
  Assets_0: controllers.Assets,
  // @LINE:11
  RandomApp_2: controllers.RandomApp,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    Application_1: controllers.Application,
    // @LINE:9
    Assets_0: controllers.Assets,
    // @LINE:11
    RandomApp_2: controllers.RandomApp
  ) = this(errorHandler, Application_1, Assets_0, RandomApp_2, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, RandomApp_2, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """random/$sequence<[^/]+>/$laneCount<[^/]+>""", """controllers.RandomApp.index(sequence:String, laneCount:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """random""", """controllers.RandomApp.register()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_RandomApp_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("random/"), DynamicPart("sequence", """[^/]+""",true), StaticPart("/"), DynamicPart("laneCount", """[^/]+""",true)))
  )
  private[this] lazy val controllers_RandomApp_index2_invoker = createInvoker(
    RandomApp_2.index(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RandomApp",
      "index",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """random/$sequence<[^/]+>/$laneCount<[^/]+>"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_RandomApp_register3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("random")))
  )
  private[this] lazy val controllers_RandomApp_register3_invoker = createInvoker(
    RandomApp_2.register(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RandomApp",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """random"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Assets_versioned1_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_0.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_RandomApp_index2_route(params) =>
      call(params.fromPath[String]("sequence", None), params.fromPath[String]("laneCount", None)) { (sequence, laneCount) =>
        controllers_RandomApp_index2_invoker.call(RandomApp_2.index(sequence, laneCount))
      }
  
    // @LINE:12
    case controllers_RandomApp_register3_route(params) =>
      call { 
        controllers_RandomApp_register3_invoker.call(RandomApp_2.register())
      }
  }
}