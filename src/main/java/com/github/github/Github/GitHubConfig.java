package com.github.github.Github;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class GitHubConfig {

    @Value("https://api.github.com/users/")
    private String gitHubEndpoint;
}
