package com.sebastian.vertx;

import io.vertx.core.AbstractVerticle;

public class Main extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer().requestHandler(req -> {
      req.response().end("hola: " + Thread.currentThread().getName());
    }).listen(8080);
  }

}
