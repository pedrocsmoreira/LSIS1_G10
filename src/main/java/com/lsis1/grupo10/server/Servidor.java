/*
  @author Hugo
 */

package com.lsis1.grupo10.server;

import io.vertx.core.Vertx;

/**
 * It creates a Vert.x instance and deploys the VerticleRSJson class
 */

public class Servidor {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new VerticleRSJson());
    }

}
