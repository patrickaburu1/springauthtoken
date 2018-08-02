# springauthtoken


First, run Application.java as a java program and switch to postman and make POST request at http://localhost:8080/oauth/token to generate tokens.In the headers we have selected basic auth and provided username and password as devglan-client and devglan-secret. 
This will result access_token, token_type, refresh_token, expiry etc.

body 

username "Alex123"
password "password"
grant_type "password"



Test Token

Try http://localhost:8080/users/user then authorization with given token
