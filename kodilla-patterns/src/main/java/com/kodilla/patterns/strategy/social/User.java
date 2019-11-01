package com.kodilla.patterns.strategy.social;

public class User {
    final private String userName;
    protected SocialPublisher socialPublisher;

    public User(final String userName) {
        this.userName = userName;
    }

    public String share() {
        return socialPublisher.share();
    }

    public void setSocialPublisher(SocialPublisher socialPublisher) {
        this.socialPublisher = socialPublisher;
    }
}
