package bdn.code.springwsfundamentals.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "soap")
public class SoapProperties {

    private String url;
    private String port;
    private String xsdResource;
    private String targetNamespace;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getXsdResource() {
        return xsdResource;
    }

    public void setXsdResource(String xsdResource) {
        this.xsdResource = xsdResource;
    }

    public String getTargetNamespace() {
        return targetNamespace;
    }

    public void setTargetNamespace(String targetNamespace) {
        this.targetNamespace = targetNamespace;
    }
}
