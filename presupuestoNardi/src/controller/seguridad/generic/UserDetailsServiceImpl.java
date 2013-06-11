package controller.seguridad.generic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;

import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import dao.DaoSecurityUser;
import database.SecurityUser;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    private Assembler assembler;

    @Autowired
    private DaoSecurityUser daoSecurityUser;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	SecurityUser user = daoSecurityUser.findByString("email", username);
	if (user == null)
	    throw new UsernameNotFoundException("Usuario incorrecto.");
	assembler = new Assembler();
	return assembler.buildUserFromUserEntity(user);
    }
}