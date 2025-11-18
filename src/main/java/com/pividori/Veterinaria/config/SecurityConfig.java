package com.pividori.Veterinaria.config;

import com.pividori.Veterinaria.service.UserDetailServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {


    //When an http request is made, it goes through these filters.
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .csrf(csrf -> csrf.disable())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//                .authorizeHttpRequests(http -> {
//                    //Configure public endpoints
//                    http.requestMatchers(HttpMethod.GET, "/auth/hola").permitAll();
//                    //Configure private endpoints
//                    http.requestMatchers(HttpMethod.GET, "/auth/holaPremium").hasAuthority("READ");
//                    //Configure rest of endpoints
//                    //Request needs are authenticated.
//                    //http.anyRequest().authenticated();
//                    //Deny all request for rest of endpoints
//                    http.anyRequest().denyAll();
//                })
                .build();

        }

    //After that, needs authentication with at authentication manager.
    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }

    //This form of authentication is for database. He needs two components...
    @Bean
    public AuthenticationProvider authenticationProvider(UserDetailServiceImpl userDetailService){
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider(userDetailService);
        provider.setPasswordEncoder(passwordEncoder());
        return provider;
    }

    /*First component. The User.
    @Bean
    public UserDetailsService userDetailsService(){
        UserDetails userDetails = User.withUsername("Santiago")
                .password(passwordEncoder().encode("123santi"))
                .roles("ADMIN")
                .authorities("READ", "CREATED")
                .build();

        return new InMemoryUserDetailsManager(userDetails);
    }
    */

    //Second component. The encrypted password.
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

}

/*http
                .csrf(csrf -> csrf.disable()) // Deshabilita protección CSRF (necesario si no usás formularios)
                .authorizeHttpRequests(auth -> auth
                        .anyRequest().permitAll() // Permite acceso a TODO
                )
                .formLogin(login -> login.disable()) // Deshabilita login por formulario
                .httpBasic(basic -> basic.disable()); // Deshabilita autenticación básica

        return http.build();*/
