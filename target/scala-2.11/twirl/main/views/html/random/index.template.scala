
package views.html.random

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,String,Map[String, String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(sequence: String, laneSize: String, result: Map[String, String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.67*/("""

"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("레인배정")/*6.14*/ {_display_(Seq[Any](format.raw/*6.16*/("""
    
    """),format.raw/*8.5*/("""<h3>레인배정</h3>
        <form name="" action=""""),_display_(/*9.32*/routes/*9.38*/.RandomApp.register),format.raw/*9.57*/("""" method="post">
        	<input type="hidden" name="sequence" value=""""),_display_(/*10.55*/sequence),format.raw/*10.63*/("""" />
        	<input type="hidden" name="laneSize" value=""""),_display_(/*11.55*/laneSize),format.raw/*11.63*/("""" />
            <label>시드 </label>
            <select name="seed">
            	<option value="1">1</option>
            	<option value="2">2</option>
            	<option value="3">3</option>
            	<option value="4">4</option>
            </select>
            <br />
            <label>이름 </label>
            <input type="text" name="name"/><br />
            <input type="submit" class="btn" value="등록"/> 
        </form>
        <br/>
        <table>
            <tr class="title">
                <th></th>
                <th>1번레인</th>
                <th>2번레인</th>
                <th>3번레인</th>
                <th>4번레인</th>
                <th>5번레인</th>
                <th>6번레인</th>
                <th>7번레인</th>
                <th>8번레인</th>
            </tr>
            <tr>
                <th>1번시드</th>
                <td>"""),_display_(/*39.22*/result/*39.28*/.get("1_1")),format.raw/*39.39*/("""</td>
                <td>"""),_display_(/*40.22*/result/*40.28*/.get("1_2")),format.raw/*40.39*/("""</td>
                <td>"""),_display_(/*41.22*/result/*41.28*/.get("1_3")),format.raw/*41.39*/("""</td>
                <td>"""),_display_(/*42.22*/result/*42.28*/.get("1_4")),format.raw/*42.39*/("""</td>
                <td>"""),_display_(/*43.22*/result/*43.28*/.get("1_5")),format.raw/*43.39*/("""</td>
                <td>"""),_display_(/*44.22*/result/*44.28*/.get("1_6")),format.raw/*44.39*/("""</td>
                <td>"""),_display_(/*45.22*/result/*45.28*/.get("1_7")),format.raw/*45.39*/("""</td>
                <td>"""),_display_(/*46.22*/result/*46.28*/.get("1_8")),format.raw/*46.39*/("""</td>
            </tr>
            <tr>
                <th>2번시드</th>
                <td>"""),_display_(/*50.22*/result/*50.28*/.get("2_1")),format.raw/*50.39*/("""</td>
                <td>"""),_display_(/*51.22*/result/*51.28*/.get("2_2")),format.raw/*51.39*/("""</td>
                <td>"""),_display_(/*52.22*/result/*52.28*/.get("2_3")),format.raw/*52.39*/("""</td>
                <td>"""),_display_(/*53.22*/result/*53.28*/.get("2_4")),format.raw/*53.39*/("""</td>
                <td>"""),_display_(/*54.22*/result/*54.28*/.get("2_5")),format.raw/*54.39*/("""</td>
                <td>"""),_display_(/*55.22*/result/*55.28*/.get("2_6")),format.raw/*55.39*/("""</td>
                <td>"""),_display_(/*56.22*/result/*56.28*/.get("2_7")),format.raw/*56.39*/("""</td>
                <td>"""),_display_(/*57.22*/result/*57.28*/.get("2_8")),format.raw/*57.39*/("""</td>
            </tr>
            <tr>
                <th>3번시드</th>
                <td>"""),_display_(/*61.22*/result/*61.28*/.get("3_1")),format.raw/*61.39*/("""</td>
                <td>"""),_display_(/*62.22*/result/*62.28*/.get("3_2")),format.raw/*62.39*/("""</td>
                <td>"""),_display_(/*63.22*/result/*63.28*/.get("3_3")),format.raw/*63.39*/("""</td>
                <td>"""),_display_(/*64.22*/result/*64.28*/.get("3_4")),format.raw/*64.39*/("""</td>
                <td>"""),_display_(/*65.22*/result/*65.28*/.get("3_5")),format.raw/*65.39*/("""</td>
                <td>"""),_display_(/*66.22*/result/*66.28*/.get("3_6")),format.raw/*66.39*/("""</td>
                <td>"""),_display_(/*67.22*/result/*67.28*/.get("3_7")),format.raw/*67.39*/("""</td>
                <td>"""),_display_(/*68.22*/result/*68.28*/.get("3_8")),format.raw/*68.39*/("""</td>
            </tr>
            <tr>
                <th>4번시드</th>
                <td>"""),_display_(/*72.22*/result/*72.28*/.get("4_1")),format.raw/*72.39*/("""</td>
                <td>"""),_display_(/*73.22*/result/*73.28*/.get("4_2")),format.raw/*73.39*/("""</td>
                <td>"""),_display_(/*74.22*/result/*74.28*/.get("4_3")),format.raw/*74.39*/("""</td>
                <td>"""),_display_(/*75.22*/result/*75.28*/.get("4_4")),format.raw/*75.39*/("""</td>
                <td>"""),_display_(/*76.22*/result/*76.28*/.get("4_5")),format.raw/*76.39*/("""</td>
                <td>"""),_display_(/*77.22*/result/*77.28*/.get("4_6")),format.raw/*77.39*/("""</td>
                <td>"""),_display_(/*78.22*/result/*78.28*/.get("4_7")),format.raw/*78.39*/("""</td>
                <td>"""),_display_(/*79.22*/result/*79.28*/.get("4_8")),format.raw/*79.39*/("""</td>
            </tr>
        </table>
	<script type="text/javascript">
	</script>
""")))}),format.raw/*84.2*/("""
"""))
      }
    }
  }

  def render(sequence:String,laneSize:String,result:Map[String, String]): play.twirl.api.HtmlFormat.Appendable = apply(sequence,laneSize,result)

  def f:((String,String,Map[String, String]) => play.twirl.api.HtmlFormat.Appendable) = (sequence,laneSize,result) => apply(sequence,laneSize,result)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Aug 20 10:31:40 KST 2015
                  SOURCE: C:/Users/kwlee/Desktop/RandomLane/app/views/random/index.scala.html
                  HASH: 621487a1a9fcc2d91b91f09f935f165604883927
                  MATRIX: 779->1|954->66|982->85|1010->88|1030->100|1069->102|1105->112|1176->157|1190->163|1229->182|1327->253|1356->261|1442->320|1471->328|2346->1176|2361->1182|2393->1193|2447->1220|2462->1226|2494->1237|2548->1264|2563->1270|2595->1281|2649->1308|2664->1314|2696->1325|2750->1352|2765->1358|2797->1369|2851->1396|2866->1402|2898->1413|2952->1440|2967->1446|2999->1457|3053->1484|3068->1490|3100->1501|3219->1593|3234->1599|3266->1610|3320->1637|3335->1643|3367->1654|3421->1681|3436->1687|3468->1698|3522->1725|3537->1731|3569->1742|3623->1769|3638->1775|3670->1786|3724->1813|3739->1819|3771->1830|3825->1857|3840->1863|3872->1874|3926->1901|3941->1907|3973->1918|4092->2010|4107->2016|4139->2027|4193->2054|4208->2060|4240->2071|4294->2098|4309->2104|4341->2115|4395->2142|4410->2148|4442->2159|4496->2186|4511->2192|4543->2203|4597->2230|4612->2236|4644->2247|4698->2274|4713->2280|4745->2291|4799->2318|4814->2324|4846->2335|4965->2427|4980->2433|5012->2444|5066->2471|5081->2477|5113->2488|5167->2515|5182->2521|5214->2532|5268->2559|5283->2565|5315->2576|5369->2603|5384->2609|5416->2620|5470->2647|5485->2653|5517->2664|5571->2691|5586->2697|5618->2708|5672->2735|5687->2741|5719->2752|5835->2838
                  LINES: 27->1|32->1|34->4|36->6|36->6|36->6|38->8|39->9|39->9|39->9|40->10|40->10|41->11|41->11|69->39|69->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|76->46|76->46|76->46|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|84->54|84->54|84->54|85->55|85->55|85->55|86->56|86->56|86->56|87->57|87->57|87->57|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|98->68|98->68|98->68|102->72|102->72|102->72|103->73|103->73|103->73|104->74|104->74|104->74|105->75|105->75|105->75|106->76|106->76|106->76|107->77|107->77|107->77|108->78|108->78|108->78|109->79|109->79|109->79|114->84
                  -- GENERATED --
              */
          