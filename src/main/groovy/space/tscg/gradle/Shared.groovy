 package space.tscg.gradle

import org.gradle.api.artifacts.dsl.DependencyHandler

class Shared {
    
    static Shared instance

    private static Shared instance() {
        if (instance == null) {
            synchronized (Shared.class) {
                if (instance == null) {
                    instance = new Shared();
                }
            }
        }
        return instance;
    }
    
    static Shared Deps() {
        instance()
    }
    
    static TscgProject Libs() {
        new TscgProject()
    }

    def javalinVersion = 'latest.release'
    
    def JacksonCore(String version = 'latest.release') {
        "com.fasterxml.jackson.core:jackson-core:${version}"
    }
    
    def JacksonAnnotations(String version = 'latest.release') {
        "com.fasterxml.jackson.core:jackson-annotations:${version}"
    }
    
    def JacksonDatabind(String version = 'latest.release') {
        "com.fasterxml.jackson.core:jackson-databind:${version}"
    }
    
    def TinyLog(String version = 'latest.release') {
        "org.tinylog:tinylog-impl:${version}"
    }
    
    def TinyLogApi(String version = 'latest.release') {
        "org.tinylog:tinylog-api:${version}"
    }
    
    def ClassIndex(String version = 'latest.release') {
        "org.atteo.classindex:classindex:${version}"
    }
    
    def Javalin(String version = 'latest.release') {
        setJavalinVersion(version)
        "io.javalin:javalin:${version}"
    }
    
    def OAuthSdk(String version = 'latest.release') {
        "com.nimbusds:oauth2-oidc-sdk:${version}"
    }
    
    def Expressible(String version = 'latest.release') {
        "org.panda-lang:expressible:${version}"
    }
    
    def OkHttp3(String version = 'latest.release') {
        "com.squareup.okhttp3:okhttp:${version}"
    }
    
    def RethinkDb(String version = 'latest.release') {
        "com.rethinkdb:rethinkdb-driver:${version}"
    }
    
    def CommonsLang3(String version = 'latest.release') {
        "org.apache.commons:commons-lang3:${version}"
    }
    
    def CommonsCollections4(String version = 'latest.release') {
        "org.apache.commons:commons-lang3:${version}"
    }
    
    def CommonsCodec(String version = 'latest.release') {
        "commons-codec:commons-codec:${version}"
    }
    
    def Environment(String version = 'latest.integration') {
        "gdn.rom:Environment:${version}"
    }
    
    static class TscgProject {
        
        def StellarLib(String version = 'latest.integration') {
            "space.tscg:stellarlib:${version}"
        }
        
        def Elite4J(String version = 'latest.integration') {
            "space.tscg:elite4j:${version}"
        }
    }
    
    static class Javalin {
        
        static Shared.Javalin Addon() {
            new Shared.Javalin()
        }
        
        def OpenApi() {
            "io.javalin.community.openapi:javalin-openapi-plugin:${Shared.Deps().getJavalinVersion()}"
        }
        
        def OpenApiAnnotation() {
            "io.javalin.community.openapi:openapi-annotation-processor:${Shared.Deps().getJavalinVersion()}"
        }
        
        def Swagger() {
            "io.javalin.community.openapi:javalin-swagger-plugin:${Shared.Deps().getJavalinVersion()}"
        }
        
        def Redoc() {
            "io.javalin.community.openapi:javalin-redoc-plugin:${Shared.Deps().getJavalinVersion()}"
        }
    }
}
