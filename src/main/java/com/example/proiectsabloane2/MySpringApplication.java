package com.example.proiectsabloane2;

import com.example.proiectsabloane2.difexamples.ClientComponent;
import com.example.proiectsabloane2.difexamples.SingletonComponent;
import com.example.proiectsabloane2.difexamples.TransientComponent;
import com.example.proiectsabloane2.observer.AllBooksSubject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(MySpringApplication.class, args);


        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();

        c = (ClientComponent) context.getBean("clientComponent");
        c.operation();
    }

    @Bean
    public AllBooksSubject allBooksSubject() {
        return new AllBooksSubject();
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }
}
