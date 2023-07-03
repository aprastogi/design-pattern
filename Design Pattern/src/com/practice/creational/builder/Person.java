package com.practice.creational.builder;

public class Person {
    private final String name;
    private final String address;

    Person(Builder builder){
        this.name = builder.getName();
        this.address = builder.getAddress();
    }

    public static Builder Builder(){
        return new Builder();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    static class Builder{
        private String name;
        private String address;

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder address(String address){
            this.address = address;
            return this;
        }

        public String getName(){
            return name;
        }

        public String getAddress(){
            return address;
        }

        public Person build(){
            return new Person(this);
        }
    }
}
