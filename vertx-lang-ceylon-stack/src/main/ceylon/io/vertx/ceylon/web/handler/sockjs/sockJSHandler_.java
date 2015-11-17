package io.vertx.ceylon.web.handler.sockjs;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.Vertx;
import io.vertx.ceylon.web.Router;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Name("sockJSHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class sockJSHandler_ {

  private static final sockJSHandler_ instance = new sockJSHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::sockJSHandler")
  public static sockJSHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSHandler")
  public static SockJSHandler create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    SockJSHandler ret = io.vertx.ceylon.web.handler.sockjs.SockJSHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.sockjs.SockJSHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSHandler")
  public static SockJSHandler create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx, 
    final @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSHandlerOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.web.handler.sockjs.SockJSHandlerOptions options) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions arg_1 = options == null ? null : new io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    SockJSHandler ret = io.vertx.ceylon.web.handler.sockjs.SockJSHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.sockjs.SockJSHandler.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public static void installTestApplications(
    final @TypeInfo("io.vertx.ceylon.web::Router") @Name("router") @DocAnnotation$annotation$(description = "todo") Router router, 
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx) {
    io.vertx.ext.web.Router arg_0 = io.vertx.ceylon.web.Router.TO_JAVA.safeConvert(router);
    io.vertx.core.Vertx arg_1 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.web.handler.sockjs.SockJSHandler.installTestApplications(arg_0, arg_1);
  }

}