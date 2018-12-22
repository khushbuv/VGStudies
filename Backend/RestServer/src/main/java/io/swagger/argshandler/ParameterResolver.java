package io.swagger.argshandler;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebDataBinderFactory;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.method.support.HandlerMethodArgumentResolverComposite;
import org.springframework.web.method.support.ModelAndViewContainer;
import org.threeten.bp.LocalDate;

import io.swagger.annotation.FormatResolver;


public class ParameterResolver extends HandlerMethodArgumentResolverComposite {
	
	@Override
	public boolean supportsParameter(MethodParameter parameter) {
		return parameter.getParameterAnnotation(FormatResolver.class)!=null;
	}
	
	 
		@Override
		public Object resolveArgument(MethodParameter parameter, ModelAndViewContainer mavContainer,
				NativeWebRequest webRequest, WebDataBinderFactory binderFactory) throws Exception {
			FormatResolver param = parameter.getParameterAnnotation(FormatResolver.class);
			String unresolved = webRequest.getParameter(param.value());
			LocalDate date = resolve(unresolved);
		 return date;
	 }


		private LocalDate resolve(String unresolved) {
			LocalDate date = LocalDate.parse(unresolved);
			return date;
		}
	 

}
