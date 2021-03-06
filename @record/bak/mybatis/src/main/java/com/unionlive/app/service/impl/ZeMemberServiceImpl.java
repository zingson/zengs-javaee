package com.unionlive.app.service.impl;

import com.unionlive.app.entity.ZeMember;
import com.unionlive.app.mapper.MemberMapper;
import com.unionlive.app.service.ZeMemberService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 *
 */
@Service
public class ZeMemberServiceImpl implements ZeMemberService, InitializingBean,DisposableBean {

    @Resource
    private MemberMapper memberMapper;


    @Override
    public ZeMember getMemeber(int id) {
        return memberMapper.getMember(id);
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
