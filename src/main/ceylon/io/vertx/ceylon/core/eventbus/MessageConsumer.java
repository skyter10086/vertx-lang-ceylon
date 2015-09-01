package io.vertx.ceylon.core.eventbus;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public class MessageConsumer<T> implements ReadStream<Message<T>> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MessageConsumer.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageConsumer, MessageConsumer> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageConsumer, MessageConsumer>() {
    public MessageConsumer convert(io.vertx.core.eventbus.MessageConsumer src) {
      return new MessageConsumer(src);
    }
  };

  @Ignore
  private final io.vertx.core.eventbus.MessageConsumer delegate;

  public MessageConsumer(io.vertx.core.eventbus.MessageConsumer delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_0 = new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() { public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) { handler.$call$((Object)new io.vertx.ceylon.core.eventbus.Message(event)); } };
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> pause() {
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> resume() {
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.endHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> bodyStream() {
    ReadStream<T> ret = new io.vertx.ceylon.core.streams.ReadStream.Impl(delegate.bodyStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isRegistered() {
    boolean ret = delegate.isRegistered();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = new ceylon.language.String(delegate.address());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public MessageConsumer<T> setMaxBufferedMessages(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxBufferedMessages) {
    int arg_0 = (int)maxBufferedMessages;
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.setMaxBufferedMessages(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getMaxBufferedMessages() {
    long ret = delegate.getMaxBufferedMessages();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void completionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.completionHandler(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void unregister() {
    delegate.unregister();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void unregister(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.unregister(arg_0);
  }

}
