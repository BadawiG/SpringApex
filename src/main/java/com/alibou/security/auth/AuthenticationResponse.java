package com.alibou.security.auth;

import com.alibou.security.user.User;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationResponse {

  @JsonProperty("access_token")
  private String accessToken;
  @JsonProperty("refresh_token")
  private String refreshToken;
  
  @JsonProperty("userName")
  private String userName;
  @JsonProperty("email")
  private String email;
  @JsonProperty("lang")
  private String lang;
  @JsonProperty("userId")
  private Integer userId;


}
