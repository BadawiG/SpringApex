package com.alibou.security.user;

import com.alibou.security.token.Token;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "prv_users")
public class User implements UserDetails {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2497885331158551684L;

	@Id
    @Column(name = "USERS_PK")
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "USER_PASSWORD")
    private String userPassword;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ACTIVE_FL")
    private Integer activeFlag;

    @Column(name = "USER_TYPE_FK")
    private Long userTypeFk;

    @Column(name = "MOBILE")
    private String mobile;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "GENDER_FK")
    private Long genderFk;

    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Column(name = "USER_IMAGE")
    private String userImage;

    @Column(name = "FAVORITE_LANG_FK")
    private Long favoriteLangFk;

    @Column(name = "RECEIVE_NOTIFICATION_FL")
    private Integer receiveNotificationFlag;

    @Column(name = "COUNTRIES_FK")
    private Long countriesFk;

    @Column(name = "CITIES_FK")
    private Long citiesFk;

    @Column(name = "SECURITY_TOKEN")
    private String securityToken;
 
    @Column(name = "USER_START_DATE")
    private Date userStartDate;

    @Column(name = "USER_END_DATE")
    private Date userEndDate;

    @Column(name = "EMAIL_VERIFY_FL")
    private Integer emailVerifyFlag;

    @Column(name = "MOBILE_VERIFY_FL")
    private Integer mobileVerifyFlag;

    @Column(name = "RESIDENCE_COUNTRY_FK")
    private Long residenceCountryFk;

    @Column(name = "FB_TOKEN")
    private String fbToken;

    @Column(name = "LANG")
    private String lang ;

    // Getters and setters

  @Enumerated(EnumType.STRING)
  private Role role;

  @OneToMany(mappedBy = "user")
  private List<Token> tokens;

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return role.getAuthorities();
  }

  @Override
  public String getPassword() {
    return userPassword;
  }

  @Override
  public String getUsername() {
    return userName;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }
}
