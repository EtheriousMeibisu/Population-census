public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private Sex sex;
    private Education education;

    public Person (String firstName, String lastName, int age, Sex sex, Education education){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Integer getAge(){
        return age;
    }
    public Sex getSex(){
        return sex;
    }
    public Education getEducation(){
        return education;
    }
    @Override
    public String toString(){
        return "Person{" +
                "name='" + firstName + '\'' +
                ", family='" + lastName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';
    }
}
