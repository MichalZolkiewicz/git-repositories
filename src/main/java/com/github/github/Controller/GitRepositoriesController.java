package com.github.github.Controller;

import com.github.github.Core.GitRepository;
import com.github.github.Exception.UserNameNotFoundException;
import com.github.github.Facade.GitRepositoriesFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/repos")
public class GitRepositoriesController {

    private final GitRepositoriesFacade gitRepositoriesFacade;

    @GetMapping(value = "/REPO")
    public GitRepository[] getRepositories(@RequestParam String userName) throws UserNameNotFoundException {
        return gitRepositoriesFacade.getRepositories(userName);
    }
}
