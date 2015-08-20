
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/kwlee/Desktop/RandomLane/conf/routes
// @DATE:Thu Aug 20 10:31:39 KST 2015

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseRandomApp RandomApp = new controllers.ReverseRandomApp(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseApplication Application = new controllers.ReverseApplication(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseRandomApp RandomApp = new controllers.javascript.ReverseRandomApp(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseApplication Application = new controllers.javascript.ReverseApplication(RoutesPrefix.byNamePrefix());
  }

}
