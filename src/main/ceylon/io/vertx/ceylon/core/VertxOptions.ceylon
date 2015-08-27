import io.vertx.core {
  VertxOptions_=VertxOptions
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.ceylon.core.metrics {
  MetricsOptions
}
/* Generated from io.vertx.core.VertxOptions */
shared class VertxOptions(
  shared Integer? blockedThreadCheckInterval = null,
  shared String? clusterHost = null,
  shared Integer? clusterPingInterval = null,
  shared Integer? clusterPingReplyInterval = null,
  shared Integer? clusterPort = null,
  shared Boolean? clustered = null,
  shared Integer? eventLoopPoolSize = null,
  shared Boolean? haEnabled = null,
  shared String? haGroup = null,
  shared Integer? internalBlockingPoolSize = null,
  shared Integer? maxEventLoopExecuteTime = null,
  shared Integer? maxWorkerExecuteTime = null,
  shared MetricsOptions? metricsOptions = null,
  shared Integer? quorumSize = null,
  shared Integer? warningExceptionTime = null,
  shared Integer? workerPoolSize = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists blockedThreadCheckInterval) {
      json.put("blockedThreadCheckInterval", blockedThreadCheckInterval);
    }
    if (exists clusterHost) {
      json.put("clusterHost", clusterHost);
    }
    if (exists clusterPingInterval) {
      json.put("clusterPingInterval", clusterPingInterval);
    }
    if (exists clusterPingReplyInterval) {
      json.put("clusterPingReplyInterval", clusterPingReplyInterval);
    }
    if (exists clusterPort) {
      json.put("clusterPort", clusterPort);
    }
    if (exists clustered) {
      json.put("clustered", clustered);
    }
    if (exists eventLoopPoolSize) {
      json.put("eventLoopPoolSize", eventLoopPoolSize);
    }
    if (exists haEnabled) {
      json.put("haEnabled", haEnabled);
    }
    if (exists haGroup) {
      json.put("haGroup", haGroup);
    }
    if (exists internalBlockingPoolSize) {
      json.put("internalBlockingPoolSize", internalBlockingPoolSize);
    }
    if (exists maxEventLoopExecuteTime) {
      json.put("maxEventLoopExecuteTime", maxEventLoopExecuteTime);
    }
    if (exists maxWorkerExecuteTime) {
      json.put("maxWorkerExecuteTime", maxWorkerExecuteTime);
    }
    if (exists metricsOptions) {
      json.put("metricsOptions", metricsOptions.toJson());
    }
    if (exists quorumSize) {
      json.put("quorumSize", quorumSize);
    }
    if (exists warningExceptionTime) {
      json.put("warningExceptionTime", warningExceptionTime);
    }
    if (exists workerPoolSize) {
      json.put("workerPoolSize", workerPoolSize);
    }
    return json;
  }
}
