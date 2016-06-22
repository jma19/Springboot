package com.im.server.api;

import com.im.server.mode.Response;
import com.im.server.utils.JsonUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by majun on 16/2/2.
 */
@RestController
@RequestMapping("/register/test/service")
public class TestService {
    private Log logger = LogFactory.getLog(TestService.class);

    //   使用HttpServletRequest 获取cookie
    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public Response ping(@CookieValue("majun") String fooCookie) throws IOException {
        //Mice
        return new Response().setData("OK, cookieValue=!!!" + fooCookie);
    }

    //   使用HttpServletResponse增加cookie, cookie会返回给前端
    @RequestMapping(value = "/getCookie", method = RequestMethod.GET)
    public Response getCookie(HttpServletResponse httpServletResponse) throws IOException {
        Cookie cookie = new Cookie("majun", "xiaoya");
        cookie.setMaxAge(10);
        httpServletResponse.addCookie(cookie);

        return new Response().setData("allocate cookie success!!!");
    }


    //   使用HttpServletResponse增加cookie, cookie会返回给前端
    @RequestMapping(value = "/getUserInfo", method = RequestMethod.GET)
    public Response getUser(HttpServletRequest httpServletRequest) throws IOException {
        Object user_token = httpServletRequest.getAttribute("USER_TOKEN");
        return new Response().setData(user_token);
    }


}
