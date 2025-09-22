package org.example;


//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
public class Main {
    public static void main(String[] args) {
        CurryString2<String,String,String,String> c = new CurryString2<>();
        String result = c.f()
                .apply("1")
                .apply("2")
                .apply("3")
                .apply("4");
        System.out.println(result);
    }

    public static Function<Integer,Integer>compose(Function<Integer,Integer> f1, Function<Integer,Integer> f2) {
        return x -> f2.apply(f1.apply(x));
    }


}