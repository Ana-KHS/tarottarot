package com.sqisoft.tarottarot.user.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;


@Getter
@Setter
@Entity
@Table(name = "user_info")
@NoArgsConstructor
public class userEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private String user_id;

    @Column(name = "user_name", nullable = false, unique = true)
    private String user_name;
    @Column(name = "user_password", nullable = false)
    private String user_password;
    @Column(name = "user_nickname", nullable = false, unique = true)
    private String user_nickname;
    @Column(name = "user_birth", nullable = false)
    private String user_birth;
    @Column(name = "user_sex", nullable = false)
    private int user_sex;
    @Column(name = "user_class", nullable = false)
    private int user_class;

    @Builder
    public userEntity(String userId, String userName, String userPassword, String userNickname, String userBirth, int userSex, int userClass) {
        this.user_id = userId;
        this.user_name = userName;
        this.user_password = userPassword;
        this.user_nickname = userNickname;
        this.user_birth = userBirth;
        this.user_sex = userSex;
        this.user_class = userClass;
    }
}
