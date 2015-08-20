
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>"""),_display_(/*5.10*/title),format.raw/*5.15*/("""</title>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1" />
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*8.55*/routes/*8.61*/.Assets.versioned("images/favicon.png")),format.raw/*8.100*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*9.50*/routes/*9.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*9.97*/("""">
    <script src=""""),_display_(/*10.19*/routes/*10.25*/.Assets.versioned("javascripts/hello.js")),format.raw/*10.66*/("""" type="text/javascript"></script>
    <script src=""""),_display_(/*11.19*/routes/*11.25*/.Assets.versioned("javascripts/jquery-2.1.4.min.js")),format.raw/*11.77*/("""" type="text/javascript"></script>
</head>
<body class="body">
    """),_display_(/*14.6*/content),format.raw/*14.13*/("""
"""),format.raw/*15.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu Aug 20 10:31:40 KST 2015
                  SOURCE: C:/Users/kwlee/Desktop/RandomLane/app/views/main.scala.html
                  HASH: 1079aca6babca688c2fdd17eca1ffed94c29a492
                  MATRIX: 748->1|873->31|900->32|965->71|990->76|1216->276|1230->282|1290->321|1368->373|1382->379|1443->420|1491->441|1506->447|1568->488|1648->541|1663->547|1736->599|1830->667|1858->674|1886->675
                  LINES: 27->1|32->1|33->2|36->5|36->5|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|45->14|45->14|46->15
                  -- GENERATED --
              */
          