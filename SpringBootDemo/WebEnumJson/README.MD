[深入解析Spring使用枚举接收参数和返回值机制并提供自定义最佳实践](https://blog.csdn.net/alinyua/article/details/86383254)
[Spring Boot 使用枚举类型作为api请求参数,如何接收int](https://segmentfault.com/q/1010000020636087)
Springboot改Formatter没用，RequestBody走的jackson，@JsonValue香的，但每个Enum里只能有一个JsonValue
注意，使用 @RequestBody （application/json）接收时，默认只支持字面量与ordinal自动转换为枚举类型，上面博客讲的不太对

最近遇到的坑，前端传来的不是字面量也不是ordinal，所以要自己写转换