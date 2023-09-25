package com.github.github.Facade;

import com.github.github.Core.GitRepository;
import com.github.github.Exception.UserNameNotFoundException;
import com.github.github.Github.GitHubClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
@RequiredArgsConstructor
public class GitRepositoriesFacade {

    private final GitHubClient gitHubClient;

    public GitRepository[] getRepositories(String userName) throws UserNameNotFoundException {
        GitRepository[] gitRepositories;

        try {
            gitRepositories = gitHubClient.getRepositories(userName);
        } catch (HttpClientErrorException e) {
            throw new UserNameNotFoundException(e.getStatusCode(), e.getMessage());
        }

        return gitRepositories;
    }
}
