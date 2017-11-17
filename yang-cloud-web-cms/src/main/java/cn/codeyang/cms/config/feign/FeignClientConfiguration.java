package cn.codeyang.cms.config.feign;

import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.security.oauth2.client.feign.OAuth2FeignRequestInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2ClientContext;
import org.springframework.security.oauth2.client.resource.OAuth2ProtectedResourceDetails;
import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;

/**
 * Created by yangzhongyang on 17/11/17
 */
public class FeignClientConfiguration {
    @Value("${security.oauth2.client.user-authorization-uri}")
    private String authorizeUrl;

    @Value("${security.oauth2.client.access-token-uri}")
    private String tokenUrl;

    @Value("${security.oauth2.client.client-id}")
    private String clientId;


    @Bean
    public RequestInterceptor oauth2FeignRequestInterceptor(OAuth2ClientContext oauth2ClientContext){
        return new OAuth2FeignRequestInterceptor(oauth2ClientContext, resource());
    }

    @Bean
    protected OAuth2ProtectedResourceDetails resource() {
        AuthorizationCodeResourceDetails resource = new AuthorizationCodeResourceDetails();
        resource.setAccessTokenUri(tokenUrl);
        resource.setUserAuthorizationUri(authorizeUrl);
        resource.setClientId(clientId);
        resource.setClientSecret("secret");
        return resource;
    }
}
