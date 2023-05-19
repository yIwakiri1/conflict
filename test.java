import java.util.;

interface A {
    abstract void x();
}

abstract class B implements A {
    public void x(){}
}

public class Main {
    public static void main(String[] args) throws Exception {
        List list = List.of(A, B, C); 不変
        List list2 = Arrays.asList(A, B, C);  可変
        var list3 = new ArrayList(Arrays.asList(new String[]{A, B, C}));    可変
        ArrayListString list4 = new ArrayList(Arrays.asList(new String[]{A, B, C}));  可変
        var list6 = Arrays.asList(new String[]{A, B, C});  不変(varでないとエラー)
         ArrayListString list7 = Arrays.asList(new String[]{A, B, C});    エラー
        ListString list8 = Arrays.asList(new String[]{A, B, C});    いける
        list8.set(0, hoge);
        System.out.println(list8);
    }
}
