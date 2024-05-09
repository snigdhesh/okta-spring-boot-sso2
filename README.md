# okta-spring-boot-sso2
SSO with spring-boot 3 and spring-security 6


#### application.properties

```
spring.application.name=okta-spring-boot-sso2

#Okta OAuth2 configuration
#===========================
okta.oauth2.client-id= <your client Id from okta>
okta.oauth2.client-secret= <your client secret from okta>
okta.oauth2.issuer=https://dev-12345.oktapreview.com/oauth2/default
okta.oauth2.logoutURL=https://dev-12345.oktapreview.com/login/signout

# Path to home page of your app
okta.oauth2.post-logout-redirect-uri=http://localhost:8080/
```