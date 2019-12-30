package com.buzzle.springboot;

import com.buzzle.springboot.entity.Blog;
import com.buzzle.springboot.entity.Message;
import com.buzzle.springboot.entity.User;
import com.buzzle.springboot.entity.message.MessageText;
import com.buzzle.springboot.repository.BlogRepository;
import com.buzzle.springboot.repository.MessageRepository;
import com.buzzle.springboot.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootApplication.class, args);
    }

    @Bean
    CommandLineRunner initUser(UserRepository userRepository) {
        return args -> {
            Stream.of("whitestrightrey", "anonymouse", "billgates", "elsascupcakes", "thatonefurry").forEach(username -> {
                User user = new User(username, username+"06" , username.toLowerCase() + "@domain.com");
                userRepository.save(user);
            });
            userRepository.findAll().forEach(System.out::println);
        };
    }

    @Bean
    CommandLineRunner initBlog(BlogRepository blogRepository) {
        return args -> {
            Stream.of("whitestrightrey", "anonymouse", "billgates", "elsascupcakes", "thatonefurry").forEach(nameDomain -> {
                Blog blog = new Blog(nameDomain, nameDomain.toUpperCase());
                blogRepository.save(blog);
            });
            blogRepository.findAll().forEach(System.out::println);
        };
    }

    @Bean
    CommandLineRunner initMessage(MessageRepository messageRepository) {
        return args -> {
            Stream.of("my cool post", "sup").forEach(title -> {
                Message message = new MessageText(title, "#"+title, new Date(), 0, "MyText");
                messageRepository.save(message);
            });
            messageRepository.findAll().forEach(System.out::println);
        };
    }

}
