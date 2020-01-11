package com.example.greendaoexample;

import org.greenrobot.greendao.annotation.*;

@Entity
public class Student {
    @Id(autoincrement = true)
    private Long id;
    @NotNull
    private String name;
    private String address;
    @Generated(hash = 153249284)
    public Student(Long id, @NotNull String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    @Generated(hash = 1556870573)
    public Student() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
