package my.spring.core;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "mail")
@PropertySource("classpath:my.properties")
public class ApplicationConfigurationProp { 
	private String from; 
	private String host; 
	private int port;
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	} 

	//getter and setter 
//	public static class  Security{ 
//		private String userName;
//		private String password; 
//		//getter and setter 
//	}

}
