package com.pividori.Veterinaria.service;

import com.pividori.Veterinaria.model.User;
import com.pividori.Veterinaria.repository.IUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

    private final IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(username);

        List<SimpleGrantedAuthority> authorityList = new ArrayList<>();

        /*
        Agarramos los roles y los añadimos al authorityList convirtiendolos en un SimpleGrantedAuthority.
        Un SimpleGrantedAuthority es lo que entiende SpringSecurity como rol.
        */
        user.getRoles().forEach(role -> {
            authorityList.add(new SimpleGrantedAuthority("ROLE_".concat(role.getRoleEnum().name())));
        });

        /*
        Con esto añadimos los permisos al authorityList.
        */
        user.getRoles().stream()
                .flatMap(role -> role.getPermission().stream())
                .forEach(permission -> authorityList.add(new SimpleGrantedAuthority(permission.getName())));


        /*
        Tengo que hacer referencia de esta forma a la clase User del paquete de SpringSecurity porque mi clase User se llama exactamente igual.
         */
        return new org.springframework.security.core.userdetails.User(
                user.getUsername(),
                user.getPassword(),
                user.isEnabled(),
                user.isAccountNoExpired(),
                user.isCredentialNoExpired(),
                user.isAccountNoLocked(),
                authorityList
        );
    }
}

