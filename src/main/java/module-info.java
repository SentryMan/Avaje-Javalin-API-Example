module avaje.javalin.example {
  requires io.avaje.inject;
  requires io.avaje.http.client;
  requires io.avaje.config;
  requires io.javalin;
  requires io.avaje.http.api;
  requires io.avaje.jsonb.plugin;
  requires ch.qos.logback.classic;

  requires static io.swagger.v3.oas.annotations;

  provides io.avaje.inject.spi.Module with
      com.jojo.javalin.api.ApiModule;
  provides io.avaje.jsonb.Jsonb.GeneratedComponent with
      com.jojo.javalin.api.jsonb.GeneratedJsonComponent;
  provides io.avaje.http.client.HttpClient.GeneratedComponent with
      com.jojo.javalin.api.client.httpclient.GeneratedHttpComponent;
}
