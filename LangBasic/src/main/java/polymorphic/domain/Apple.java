package polymorphic.domain;

/**
 * @author dominiczhu
 * @version 1.0
 * @title Apple
 * @date 2021/8/13 下午3:21
 */
public class Apple extends Fruit {

    public String name = "apple";

    // 重写方法的时候，子类方法的返回类型可以是父类方法返回类型的子类
    @Override
    public String get() {
        return this.name;
    }

    private void showSupper(){

        // 下面这俩name根本就是俩东西，变量这东西不存在覆盖什么的
        System.out.println(super.name);
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        System.out.println(new Apple());
    }
}
