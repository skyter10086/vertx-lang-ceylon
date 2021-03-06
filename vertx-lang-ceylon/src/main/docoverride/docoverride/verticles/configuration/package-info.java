/*
 * Copyright 2014 Red Hat, Inc.
 *
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  and Apache License v2.0 which accompanies this distribution.
 *
 *  The Eclipse Public License is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  The Apache License v2.0 is available at
 *  http://www.opensource.org/licenses/apache2.0.php
 *
 *  You may elect to redistribute this code under either of these licenses.
 */

/**
 * === Passing configuration to a verticle
 *
 * Configuration in the form of JSON can be passed to a verticle at deployment time:
 *
 * [source]
 * ----
 * value config = JsonObject {
 *   "name"->"Tim",
 *   "directory"->"blah"
 * };
 * value options = DeploymentOptions {
 *   config = config;
 * };
 *
 * vertx.deployVerticle("otherVerticle.java", options);
 * ----
 *
 * NOTE: we suppose `ceylon.json::Object` is aliased to `JsonObject`
 *
 * This configuration is then available via the `io.vertx.ceylon.core::Context` object. The configuration is returned as a
 * `JsonObject` object so you can retrieve data as follows:
 *
 * [source]
 * ----
 * print("``vertx.getOrCreateContext().config()?.get("name") else "no config"``")
 * ----
 *
 * === Accessing environment variables in a Verticle
 *
 * Environment variables and system properties are accessible from a verticle using the Java API:
 *
 * [source,javascript]
 * ----
 * print("``System.getProperty("foo")``");
 * print("``System.getenv("HOME")``");
 * ----
 *
 */
@Document(fileName = "override/verticle-configuration.adoc")
package docoverride.configuration;

import io.vertx.docgen.Document;