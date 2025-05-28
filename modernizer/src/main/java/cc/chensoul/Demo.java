package cc.chensoul;

import java.time.LocalDate;

public class Demo {

    public static void main(final String[] args) throws Exception {

//        Integer i = new Integer("42");
//        Long bigNumber = new Long("42");

        // 使用 valueOf 替代 new Integer，更高效且不废弃
        Integer i = Integer.valueOf("42");
        Long bigNumber = Long.valueOf("42");

        LocalDate now = LocalDate.now();

    }

}
