package py.starwars.controller;

import java.io.IOException;

import jakarta.servlet.*;

import jakarta.servlet.http.HttpServletResponse;

public class CorsFilter implements Filter{

    @Override
  public void init(FilterConfig fc) throws ServletException {}

  @Override
  public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain)
      throws IOException, ServletException {
    HttpServletResponse httpResponse = (HttpServletResponse) res;
    httpResponse.setHeader("Access-Control-Allow-Origin", "*");
    httpResponse.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
    httpResponse.setHeader("Access-Control-Allow-Headers", "Content-Type, Authorization");
    filterChain.doFilter(req, res);
  }

  @Override
  public void destroy() {}

}
