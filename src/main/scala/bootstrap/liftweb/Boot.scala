package bootstrap.liftweb

import net.liftweb.http.LiftRules
import net.liftweb.sitemap.{SiteMap, Menu}

class Boot {
  
  def boot {
    LiftRules.addToPackages("au.com.testlift")
    
    val siteMap = List(Menu("Home") / "index", Menu("Todo") / "todo" )
    LiftRules.setSiteMap(SiteMap(siteMap:_*))
  }

}
