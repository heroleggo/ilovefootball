package com.heroleggo.ilovefootball.domain.model;

import java.util.Date;
import lombok.Builder;

public class User {
  private Integer userId;

  private String userNickname;

  private String userPassword;

  private String userEmail;

  private Date createdAt;

  @Builder
  public User(Integer userId, String userNickname, String userPassword, String userEmail) {
    this.userId = userId;
    this.userNickname = userNickname;
    this.userPassword = userPassword;
    this.userEmail = userEmail;
    this.createdAt = new Date();
  }
}
