package com.example.basic.config.interceptor;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class BasicInterceptor implements HandlerInterceptor{
  
  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
      @Nullable Exception ex) throws Exception {
    // TODO Auto-generated method stub
      log.info("[BasicInterceptor][afterCompletion] InterCeptor 성공"); 

    HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
  }

  @Override
  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
      @Nullable ModelAndView modelAndView) throws Exception {
    // TODO Auto-generated method stub

    log.info("[BasicInterceptor][postHandle] InterCeptor 성공");

    HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    // TODO Auto-generated method stub
    log.info("[BasicInterceptor][preHandle] InterCeptor 성공");

    return HandlerInterceptor.super.preHandle(request, response, handler);
  }

  
  
}
