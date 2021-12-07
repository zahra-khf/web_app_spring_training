package fr.lernejo.todo;
import org.springframework.stereotype.Component;
import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.UUID;


@Component
public class ApplicationIdentifierFilter implements Filter {
    String x;


    public ApplicationIdentifierFilter()
    {
        UUID uuid = UUID.randomUUID();
        x = uuid.toString();
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse servlet = (HttpServletResponse) servletResponse;
        servlet.setHeader("Instance-Id",x);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
