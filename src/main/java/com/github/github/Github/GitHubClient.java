package com.github.github.Github;

import com.github.github.Core.GitRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Component
@RequiredArgsConstructor
public class GitHubClient {

    private final RestTemplate restTemplate;
    private final GitHubConfig gitHubConfig;

    public URI getURI(String userName) {

        return UriComponentsBuilder.fromHttpUrl(gitHubConfig.getGitHubEndpoint() + userName + "/repos")
                .build()
                .encode()
                .toUri();
    }

    public GitRepository[] getRepositories(String userName){

       return restTemplate.getForObject(getURI(userName), GitRepository[].class);
    }
}
