package com.d.inheritance.anonymous_class.effectively_final;

class EffectivelyFinalDemo{
    public static void main(String[] args){

        // Ojbect accessed in
        final MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();
        MyObject o3 = new MyObject();
        new Object(){
            public void anonymousClassMethod(){
                //Variable 'o2' is accessed from within inner class, needs to be final or effectively final
                // cannot do this
                // o2 = o3;
                // or this
                // o2 = new MyObject();

                // but you can do this
                o1.setName("o1 object");
                // or read from it
                String o2Name = o2.getName();

            }
        };
    }
}
