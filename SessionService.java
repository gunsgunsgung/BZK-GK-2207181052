package com.guns.testmybatis1.session;


import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Component
public class SessionService {
    private Map<String,Long> sessionMap;
    //创建随机数
    private Random random =  new Random();
    private static int EXPIRE_TIME = 300 * 60 * 1000;

    public SessionService(){ sessionMap = new HashMap<>();}
    
    public RespBaseVo findAllStaff(ReqSysStaff reqSysStaff) {
        System.out.println("=============查询所有Staff表信息====================");
        RespBaseVo<Object> respBaseVo = new RespBaseVo<>();
        List<SysStaff> sysStaffsList = sysStaffMapper.findAllStaff();
        respBaseVo.setData(sysStaffsList);
        System.out.println("gunsgunsgung");
        return respBaseVo;
    }
    

    /**
     * 建立session，返回给用户
     * */



}
