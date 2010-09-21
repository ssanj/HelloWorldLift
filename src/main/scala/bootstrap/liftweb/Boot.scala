package bootstrap.liftweb

import net.liftweb.http.LiftRules
import net.liftweb.sitemap.{SiteMap, Menu}

class Boot {
  
  def boot {
    LiftRules.addToPackages("au.com.testlift")        
    LiftRules.setSiteMap(SiteMap(Menu("Home") / "index"))
  }
}
