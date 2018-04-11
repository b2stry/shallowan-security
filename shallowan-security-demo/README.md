# shallowan-security-demo
Spring Security技术栈开发企业级认证与授权

### Restful API
1) 用URL描述资源
2) 使用HTTP方法描述行为。使用HTTP状态码来表示不同的结果
3) 使用json交互数据
4) Restful只是一种风格，并不是强制的标准


#### REST成熟度模型(Glory of REST，由低到高)
Level 0: The Swamp of POX: 使用HTTP作为传输方式

Level 1: Resources: 引入资源概念。每个资源都有对应的URL

Level 2: HTTP Verbs: 使用HTTP方法进行不同的操作。使用HTTP状态码来表示不同的结果。

Level 3: Hypermedia Controls: 使用超媒体。在资源的表达中包含了链接信息。

#### 如何编写RestfulAPI的测试用例
```java
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void whenQuerySuccess() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));
    }
}
```

JsonPath Github地址：https://github.com/json-path/JsonPath

#### 常用注解

`@RestController 标明此Controller提供RestAPI`

`@RequestMapping及其变体   映射HTTP请求URL到Java方法`

`@RequestParam 映射请求参数到Java方法的参数`

`@PageableDefault 指定分页参数的默认值`

`@RequestBody 映射请求体到Java方法的参数`

`@JsonView使用步骤：`

`使用接口来声明多个视图`

`在值对象的get方法上指定视图`

`在Controller方法上指定视图`

Hibernate Validator

`@NotNull        值不能为空`

`@Null       值必须为空`

`@Pattern(regex=)      字符串必须匹配正则表达式`

`@Size(min=,max=)      集合的元素数量必须在min和max之间`

`@CreditCardNumber(ignoreNonDigitCharacters=)   字符串必须是信用卡号（按美国的标准验的）`

`@Email         字符串必须是Email地址`

`@Length(min=,max=)      检查字符串的长度`

`@NotBlank        字符串必须有字符`

`@NotEmpty        字符串不为null，集合有元素`

`@Range(min=,max=)      数字必须大于等于min，小于等于max`

`@SafeHtml         字符串是安全的html`

`@URL          字符串是合法的URL`

`@AssertFalse  值必须是false`

`@AssertTrue   值必须是true`

`@DecimalMax(value=,inclusive=)      值必须小于等于(inclusive=true)/小于(inclusive=false)value属性指定的值，可以注解在字符串类型的属性上`

`@DecimalMin(value=,inclusive=)      值必须大于等于(inclusive=true)/大于(inclusive=false)value属性指定的值，可以注解在字符串类型的属性上`

`@Digits(integer=,fraction=)     数字格式检查，integer指定整数部分的最大长度，fraction指定小数部分的最大长度`

`@Future     值必须是未来的日期`

`@Past       值必须是过去的日期`

`@Max(value=)        值必须小于等于value指定的值，不能注解在字符串的属性上`

`@Min(value=)        值必须大于等于value指定的值，不能注解在字符串的属性上`