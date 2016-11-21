/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.meecrowave.openwebbeans;

import org.apache.tomcat.JarScanFilter;
import org.apache.tomcat.JarScanType;

import java.util.Collection;
import java.util.HashSet;

public class KnownJarsFilter implements JarScanFilter {
    private final Collection<String> forceIncludes = new HashSet<String>() {{
        add("cxf-integration-cdi");
    }};

    private final Collection<String> excludes = new HashSet<String>() {{
        add("tools.jar");
        add("bootstrap.jar");
        add("ApacheJMeter");
        add("XmlSchema-");
        add("activation-");
        add("activeio-");
        add("activemq-");
        add("aether-");
        add("akka-actor-");
        add("akka-cluster-");
        add("akka-remote-");
        add("antlr-");
        add("aopalliance-");
        add("args4j-");
        add("arquillian-core.jar");
        add("arquillian-testng.jar");
        add("arquillian-junit.jar");
        add("arquillian-transaction.jar");
        add("arquillian-common");
        add("arquillian-config-");
        add("arquillian-core-api-");
        add("arquillian-core-impl-base");
        add("arquillian-core-spi-");
        add("arquillian-container-");
        add("arquillian-junit-");
        add("arquillian-test-api");
        add("arquillian-test-impl-base");
        add("arquillian-test-spi");
        add("arquillian-tomee-");
        add("asciidoctorj-");
        add("asm-");
        add("avalon-framework-");
        add("axis-");
        add("axis2-");
        add("batchee-jbatch");
        add("bcprov-");
        add("bootstrap.jar");
        add("bval-core");
        add("bval-jsr");
        add("c3p0-");
        add("cassandra-driver-core");
        add("catalina-");
        add("catalina.jar");
        add("cglib-");
        add("charsets.jar");
        add("commons-beanutils");
        add("commons-cli-");
        add("commons-codec-");
        add("commons-collections-");
        add("commons-configuration-");
        add("commons-dbcp");
        add("commons-dbcp-all-1.3-");
        add("commons-digester-");
        add("commons-discovery-");
        add("commons-httpclient-");
        add("commons-io-");
        add("commons-jcs-core-");
        add("commons-lang-");
        add("commons-lang3-");
        add("commons-logging-");
        add("commons-logging-api-");
        add("commons-net-");
        add("commons-pool-");
        add("commons-pool2-");
        add("cryptacular-");
        add("cssparser-");
        add("cxf-");
        add("deploy.jar");
        add("derby-");
        add("derbyclient-");
        add("derbynet-");
        add("dom4j");
        add("ecj-");
        add("el-api");
        add("eclipselink-");
        add("ehcache-");
        add("FastInfoset");
        add("jaxb-");
        add("jce.jar");
        add("jfr.jar");
        add("jfxrt.jar");
        add("jna-");
        add("jnr-");
        add("johnzon-");
        add("json-simple-");
        add("fusemq-leveldb-");
        add("geronimo-");
        add("google-");
        add("gragent.jar");
        add("groovy-");
        add("gson-");
        add("guava-");
        add("guice-");
        add("h2-");
        add("hamcrest-");
        add("hawtbuf-");
        add("hawtdispatch-");
        add("hawtjni-runtime");
        add("hibernate-");
        add("howl-");
        add("hsqldb-");
        add("htmlunit-");
        add("httpclient-");
        add("httpcore-");
        add("icu4j-");
        add("idb-");
        add("idea_rt.jar");
        add("istack-commons-runtime-");
        add("jackson-annotations-");
        add("jackson-core-");
        add("jackson-databind-");
        add("jackson-mapper-asl-");
        add("jackson-module-jaxb-annotations-");
        add("janino-");
        add("jansi-");
        add("jasper.jar");
        add("jasper-el.jar");
        add("jasypt-");
        add("java-atk-wrapper");
        add("java-support-");
        add("javaee-");
        add("javaee-api");
        add("javassist-");
        add("javaws.jar");
        add("javax.");
        add("jaxb-");
        add("jaxp-");
        add("jbake-");
        add("jboss-");
        add("jbossall-");
        add("jbosscx-");
        add("jbossjts-");
        add("jbosssx-");
        add("jcommander-");
        add("jersey-");
        add("jettison-");
        add("jetty-");
        add("jline");
        add("jmdns-");
        add("joda-time-");
        add("johnzon-");
        add("jruby-");
        add("jsoup-");
        add("jsonb-api");
        add("jsp-api");
        add("jsr299-");
        add("jsr311-");
        add("jsse.jar");
        add("jul-to-slf4j-");
        add("juli-");
        add("junit-");
        add("kahadb-");
        add("kotlin-runtime");
        add("leveldb");
        add("log4j-");
        add("logkit-");
        add("lucene-analyzers-");
        add("lucene-core-");
        add("management-agent.jar");
        add("maven-");
        add("mbean-annotation-api-");
        add("meecrowave-maven-");
        add("meecrowave-gradle-");
        add("mimepull-");
        add("mina-");
        add("mqtt-client-");
        add("myfaces-api");
        add("myfaces-impl");
        add("mysql-connector-java-");
        add("neethi-");
        add("nekohtml-");
        add("netty-");
        add("openjpa-");
        add("openmdx-");
        add("opensaml-");
        add("openwebbeans-");
        add("openws-");
        add("ops4j-");
        add("org.eclipse.");
        add("org.junit.");
        add("org.osgi.core-");
        add("orient-commons-");
        add("orientdb-core-");
        add("orientdb-nativeos-");
        add("oro-");
        add("pax-url");
        add("PDFBox");
        add("plexus-");
        add("plugin.jar");
        add("poi-");
        add("quartz-2");
        add("quartz-openejb-");
        add("resources.jar");
        add("rmock-");
        add("rt.jar");
        add("saaj-");
        add("sac-");
        add("scala-library-");
        add("scalatest");
        add("scannotation-");
        add("serializer-");
        add("serp-");
        add("servlet-api-");
        add("sisu-inject");
        add("sisu-guice");
        add("shrinkwrap-");
        add("slf4j-");
        add("smack-");
        add("smackx-");
        add("snappy-");
        add("spring-");
        add("sshd-");
        add("stax-api-");
        add("stax2-api-");
        add("sunec.jar");
        add("surefire-");
        add("swizzle-");
        add("sxc-");
        add("testng-");
        add("tomcat-annotations");
        add("tomcat-api");
        add("tomcat-catalina");
        add("tomcat-coyote");
        add("tomcat-dbcp");
        add("tomcat-el");
        add("tomcat-i18n");
        add("tomcat-jasper");
        add("tomcat-jaspic");
        add("tomcat-jdbc");
        add("tomcat-jni");
        add("tomcat-jsp");
        add("tomcat-juli");
        add("tomcat-tribes");
        add("tomcat-servlet");
        add("tomcat-spdy");
        add("tomcat-util");
        add("tomcat-websocket-api");
        add("tomee-");
        add("tools.jar");
        add("twitter4j-");
        add("velocity-");
        add("wagon-");
        add("webbeans-ee");
        add("webbeans-ejb");
        add("webbeans-impl");
        add("webbeans-spi");
        add("websocket-api");
        add("woodstox-core-asl-");
        add("ws-commons-util-");
        add("wsdl4j-");
        add("wss4j-");
        add("wstx-asl-");
        add("xalan-");
        add("xbean-");
        add("xercesImpl-");
        add("xml-apis-");
        add("xml-resolver-");
        add("xmlbeans-");
        add("xmlrpc-");
        add("xmlschema-");
        add("xmlsec-");
        add("xmltooling-");
        add("xmlunit-");
        add("ziplock-");
        add("zipfs.jar");
    }};

    @Override
    public boolean check(final JarScanType jarScanType, final String jarName) {
        return forceIncludes.stream().filter(jarName::startsWith).findAny().isPresent()
                || !excludes.stream().filter(jarName::startsWith).findAny().isPresent();
    }
}