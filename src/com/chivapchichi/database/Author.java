package com.chivapchichi.database;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Author[name=" + name +
                ", email=" + email +
                ", gender=" + gender + ']';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return name.equals(author.name) && email.equals(author.email) && gender == author.gender;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result += 31 * name.hashCode();
        result += 31 * email.hashCode();
        result += 31 * gender;
        return result;
    }
}
