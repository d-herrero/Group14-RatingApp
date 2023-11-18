package com.rating.demo.beans;

//TEST123

//TEST123 test

public class Account
{
    int id;
    String fullname;
    int studentId;
    String email;
    String username;
    String password;

    public Account(int id, String fullname, int studentId, String email, String username, String password)
    {
        this.id = id;
        this.fullname = fullname;
        this.studentId = studentId;
        this.email = email;
        this.username = username;
        this.password = password;
    }


    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFullname()
    {
        return fullname;
    }

    public void setFullname(String fullname)
    {
        this.fullname = fullname;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
