package security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import dao.DaoSecurityUser;
import database.SecurityUser;

public class UserDetailsServiceImpl implements UserDetailsService {

	private Assembler assembler;
	
	@Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
			SecurityUser user = new DaoSecurityUser().findByString("email", username);
			if (user == null)
				throw new UsernameNotFoundException("Usuario incorrecto.");
			assembler = new Assembler();
		return assembler.buildUserFromUserEntity(user);
	}
}
