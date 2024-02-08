package org.example._2023_12_06.iii;

public interface CommonInterface {
    void m2();
    void m3();
}

interface CommonInterfaceMikhail {
    void m1();
}

class Test1 implements CommonInterface, CommonInterfaceMikhail {

    @Override
    public void m1() {}

    @Override
    public void m2() {}

    @Override
    public void m3() {}
}

class Mikhail implements CommonInterfaceMikhail{

    @Override
    public void m1() {

    }
}
