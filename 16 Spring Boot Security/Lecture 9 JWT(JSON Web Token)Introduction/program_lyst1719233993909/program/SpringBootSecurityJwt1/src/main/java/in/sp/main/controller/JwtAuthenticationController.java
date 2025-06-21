package in.sp.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.sp.main.model.JwtRequest;
import in.sp.main.security.JwtTokenUtil;

@RestController
public class JwtAuthenticationController 
{
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@PostMapping("/login")
	public String createAuthenticationToken(@RequestBody JwtRequest jwtRequest)
	{
		authenticateTheUser(jwtRequest.getUsername(), jwtRequest.getPassword());
		
		final UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getUsername());
		
		String jwt_token = jwtTokenUtil.generateToken(userDetails);
		
		return jwt_token;
	}
	
	private void authenticateTheUser(String username, String password)
	{
		try
		{
			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(username, password));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}