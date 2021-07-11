package com.soyeonlab.labs.web;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@RequiredArgsConstructor
@Controller
public class StarController {
    // 유저는 다른 유저에게 별점 평가를 남길 수 있습니다.

    // POST /star: 상대방에게 별점 평가를 남깁니다.
    @PostMapping("/")
    public Long save() {
        return 1L;
    }

    // GET /star/user/{user_id}: 특정 대상에게 스타를 주었는지 여부를 리턴합니다.
}
