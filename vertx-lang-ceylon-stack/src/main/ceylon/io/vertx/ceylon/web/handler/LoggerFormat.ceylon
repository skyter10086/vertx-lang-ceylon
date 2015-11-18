import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.web.handler { LoggerFormat_=LoggerFormat }

" The possible out of the box formats.\n"
shared abstract class LoggerFormat(shared String name) of \iDEFAULT | \iSHORT | \iTINY {
}

" <i>remote-client</i> - - [<i>timestamp</i>] \"<i>method</i> <i>uri</i> <i>version</i>\" <i>status</i> <i>content-length</i> \"<i>referrer</i>\" \"<i>user-agent</i>\"\n"
shared object \iDEFAULT extends LoggerFormat("DEFAULT") {}
" <i>remote-client</i> - <i>method</i> <i>uri</i> <i>version</i> <i>status</i> <i>content-length</i> <i>duration</i> ms\n"
shared object \iSHORT extends LoggerFormat("SHORT") {}
" <i>method</i> <i>uri</i> <i>status</i> - <i>content-length</i> <i>duration</i>\n"
shared object \iTINY extends LoggerFormat("TINY") {}

shared object loggerFormat {

  shared String toString(LoggerFormat val) {
      switch (val)
      case(\iDEFAULT) { return "DEFAULT"; }
      case(\iSHORT) { return "SHORT"; }
      case(\iTINY) { return "TINY"; }
  }

  shared LoggerFormat fromString(String val) {
      switch (val)
      case("DEFAULT") { return \iDEFAULT; }
      case("SHORT") { return \iSHORT; }
      case("TINY") { return \iTINY; }
      else {
        throw Exception("Invalid LoggerFormat value ``val``");
      }
  }

  shared object toJava extends Converter<LoggerFormat, LoggerFormat_>() {
    shared actual LoggerFormat_ convert(LoggerFormat src) {
      switch (src)
      case(\iDEFAULT) { return LoggerFormat_.\iDEFAULT; }
      case(\iSHORT) { return LoggerFormat_.\iSHORT; }
      case(\iTINY) { return LoggerFormat_.\iTINY; }
    }
  }

  shared object toCeylon extends Converter<LoggerFormat_, LoggerFormat>() {
    shared actual LoggerFormat convert(LoggerFormat_ src) {
      if (src == LoggerFormat_.\iDEFAULT) {
        return \iDEFAULT;
      }
      if (src == LoggerFormat_.\iSHORT) {
        return \iSHORT;
      }
      if (src == LoggerFormat_.\iTINY) {
        return \iTINY;
      }
      throw Exception("Invalid enum value");
    }
  }
}
