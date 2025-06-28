Implemented JWT (JSON Web Token) for secure user authentication

1.User Login:
User sends login credentials (username and password) to the authentication endpoint.

2.JWT Generation:
If credentials are valid, the server generates a JWT token and sends it back in the response.

3.Client Usage:
Client stores the token (usually in localStorage or sessionStorage) 

4.On each API request, the server verifies the JWT token. If valid, access is granted.

🛠️ Tech Stack Used
Spring Boot
jjwt library for token creation and validation
Spring Security for securing endpoints
