package com.wuchenyv1990.cloud.k8s.svc.common.infra;

import brave.propagation.TraceContext;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cloud.sleuth.instrument.web.TraceHttpAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 在header里添加X-cloud-k8s-traceId=traceid
 *
 * @author wuchenyv1990
 */
@Configuration
@ConditionalOnProperty("cloud.k8s.x-trace-id.enabled")
public class XTraceIdFilterConfiguration {

    /**
     * @see TraceHttpAutoConfiguration
     */
    private static final int TRACING_ID_FILTER_ORDER = Ordered.HIGHEST_PRECEDENCE + 10;

    @Bean
    public FilterRegistrationBean svcTraceFilter() {
        FilterRegistrationBean<XTraceIdFilter> filterRegistrationBean = new FilterRegistrationBean<>(
                traceIdFilter());
        filterRegistrationBean.setDispatcherTypes(DispatcherType.ASYNC,
                DispatcherType.ERROR, DispatcherType.FORWARD, DispatcherType.INCLUDE,
                DispatcherType.REQUEST);
        filterRegistrationBean.setOrder(TRACING_ID_FILTER_ORDER);
        return filterRegistrationBean;
    }

    @Bean
    public XTraceIdFilter traceIdFilter() {
        return new XTraceIdFilter();
    }

    public static class XTraceIdFilter implements Filter {

        private static final String X_TRACE_ID = "X-cloud-k8s-traceId";

        private static final String X_TRACE_ID_UNKNOWN = "unknown";

        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
            HttpServletResponse httpResponse = (HttpServletResponse) response;
            TraceContext context = (TraceContext) request.getAttribute(TraceContext.class.getName());
            if (context != null) {
                httpResponse.addHeader(X_TRACE_ID, context.traceIdString());
            } else {
                httpResponse.addHeader(X_TRACE_ID, X_TRACE_ID_UNKNOWN);
            }
            chain.doFilter(request, response);
        }

        @Override
        public void destroy() {

        }
    }

}
