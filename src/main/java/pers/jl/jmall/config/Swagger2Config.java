package pers.jl.jmall.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @ClassName: Swagger2Config.java
 * @Description: Swagger2API文档的配置
 * @author: JL Du
 * @date: 2022/2/26 16:38
 * @version: 1.0.0
 */

@Configuration
public class Swagger2Config {

    public static final String TAG_1 = "PmsBrandController";

    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .tags(new Tag(TAG_1, " 商品品牌管理 "))
                .select()
                //为当前包下controller生成API文档
                .apis(RequestHandlerSelectors.basePackage("pers.jl.jmall.controller"))
                //为有@Api注解的Controller生成API文档
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //为有@ApiOperation注解的方法生成API文档
//                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Jmall后端接口页面")
                .description("Jmall")
                .contact(new Contact("JL", null, null))
                .version("1.0")
                .build();
    }
}
