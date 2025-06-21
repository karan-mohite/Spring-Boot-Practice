package in.sp.main.security;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtTokenUtil 
{
	private final Key secretKey = Keys.secretKeyFor(SignatureAlgorithm.HS512);
	private final long JWT_EXPIRATION_TIME = 1000 * 60 * 10;
	
//	public String generateToken(UserDetails userDetails)
//	{		
//		String jwt_token = Jwts.builder()
//								.setSubject(userDetails.getUsername())
//								.setIssuedAt(new Date(System.currentTimeMillis()))
//								.setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION_TIME))
//								.signWith(secretKey)
//								.compact();
//		
//		return jwt_token;
//	}
	
	
	public String generateToken(UserDetails userDetails)
	{
		Map<String, Object> claims = new HashMap<>();
		claims.put("claim1", "claim one data");
		claims.put("claim2", "claim two data");
		
		String jwt_token = Jwts.builder()
								.setClaims(claims)
								.setSubject(userDetails.getUsername())
								.setIssuedAt(new Date(System.currentTimeMillis()))
								.setExpiration(new Date(System.currentTimeMillis() + JWT_EXPIRATION_TIME))
								.signWith(secretKey)
								.compact();
		
		return jwt_token;
	}
}
