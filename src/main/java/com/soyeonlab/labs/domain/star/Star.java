package com.soyeonlab.labs.domain.star;

import com.soyeonlab.labs.domain.BaseTimeEntity;
import com.soyeonlab.labs.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Star extends BaseTimeEntity {

    @Id @GeneratedValue
    @Column(name = "star_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "from_user_id")
    private User fromUser;

    @ManyToOne
    @JoinColumn(name = "to_user_id")
    private User toUserId;

}
