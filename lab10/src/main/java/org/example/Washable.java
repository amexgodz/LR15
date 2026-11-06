package org.example;

public interface Washable {
    void wash();
    String getMaterial();
    int max = 100;
    default void gav()
    {
        System.out.println("1234");
        gav3();
    }
    static void gav2()
    {
        System.out.println("567" );

    }
    private void gav3()
    {
        System.out.println("890");
    }
}
